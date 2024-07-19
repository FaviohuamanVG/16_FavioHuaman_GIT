package pe.edu.vallegrande.sistventas.controller;

import pe.edu.vallegrande.sistventas.dto.DetalleDto;
import pe.edu.vallegrande.sistventas.dto.VentaDto;
import pe.edu.vallegrande.sistventas.service.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/ventas"})
public class Venta extends HttpServlet {

    private Lista ventaService = new Lista();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listarVentas(request, response);
    }

    private void listarVentas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<VentaDto> ventas = ventaService.obtenerVentas();
        request.setAttribute("ventas", ventas);
        request.getRequestDispatcher("ventas.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idventa = Integer.parseInt(request.getParameter("idventa"));
        List<DetalleDto> detalles = ventaService.obtenerDetallesPorVenta(idventa);
        request.setAttribute("detalles", detalles);
        request.getRequestDispatcher("ventas.jsp").forward(request, response);
    }
}
