package com.example.hometask46_les46.web;

import com.example.hometask46_les46.dto.OrderDto;
import com.example.hometask46_les46.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public ModelAndView save(@RequestBody OrderDto request) {
        ModelAndView modelAndView = new ModelAndView("orders");
        OrderDto save = service.save(request);
        modelAndView.addObject("order",save);

        return modelAndView;
    }

}
