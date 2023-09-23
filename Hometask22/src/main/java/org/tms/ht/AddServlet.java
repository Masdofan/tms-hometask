package org.tms.ht;

import org.tms.ht.domain.Device;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    private final Database database = new Database();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String type = req.getParameter("typeToAdd");

        String brand = req.getParameter("brandToAdd");

        Device device = new Device();

        device.setType(type);

        device.setBrand(brand);

        database.create(device);

        req.getRequestDispatcher("/home").forward(req, resp);

    }
}