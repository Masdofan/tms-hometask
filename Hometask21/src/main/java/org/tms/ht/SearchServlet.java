package org.tms.ht;

import org.tms.ht.domain.Device;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    private final Database database = new Database();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String brand = req.getParameter("brandToSearch");

        List<Device> devices = database.getByBrand(brand);

        req.setAttribute("devices", devices);

        req.getRequestDispatcher("/home.jsp").forward(req, resp);

    }
}
