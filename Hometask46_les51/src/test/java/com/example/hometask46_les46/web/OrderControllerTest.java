package com.example.hometask46_les46.web;

import com.example.hometask46_les46.dto.OrderDto;
import com.example.hometask46_les46.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.servlet.ModelAndView;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @MockBean
    OrderService orderService;
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper;

    @Test
    void save(OrderDto request) throws Exception {

        OrderDto dto = new OrderDto("sadqwfsdfa", 123);

        String json = mapper.writeValueAsString(dto);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/orders").content(json).contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        ModelAndView modelAndView = mvcResult.getModelAndView();

        String viewName = modelAndView.getViewName();
        var result = (OrderDto)modelAndView.getModel().get("order");

        Assertions.assertThat(viewName).isEqualTo("orders");
        Assertions.assertThat(result.getDescription()).isEqualTo(dto.getDescription());
        Assertions.assertThat(result.getPrice()).isEqualTo(dto.getPrice());

    }
}