package pe.edu.vallegrande.sistventas.service;

import pe.edu.vallegrande.sistventas.db.AccesoDB;
import pe.edu.vallegrande.sistventas.dto.DetalleDto;
import pe.edu.vallegrande.sistventas.dto.VentaDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    public List<VentaDto> obtenerVentas() {
        List<VentaDto> ventas = new ArrayList<>();
        String sql = "SELECT * FROM VENTA";

        try (Connection cn = AccesoDB.getConnection();
             PreparedStatement pstm = cn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                VentaDto venta = new VentaDto(
                        rs.getInt("idventa"),
                        rs.getInt("idcliente"),
                        rs.getString("documento"),
                        rs.getDate("fecha"),
                        rs.getDate("fecha_pago"),
                        rs.getDouble("importe"),
                        rs.getInt("idtipopago"),
                        rs.getInt("idtipocomp"),
                        rs.getString("tipoEnvio"),
                        rs.getString("serie"),
                        rs.getDouble("descuento"),
                        rs.getDouble("impuesto"),
                        rs.getDouble("total")
                );
                ventas.add(venta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ventas;
    }

    public List<DetalleDto> obtenerDetallesPorVenta(int idventa) {
        List<DetalleDto> detalles = new ArrayList<>();
        String sql = "SELECT d.idprod, p.nombre, d.cant, d.precio, d.subtotal " +
                "FROM DETALLE d " +
                "JOIN PRODUCTO p ON d.idprod = p.idprod " +
                "WHERE d.idventa = ?";

        try (Connection cn = AccesoDB.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idventa);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    DetalleDto detalle = new DetalleDto(
                                                rs.getInt("idprod"),
                                                rs.getString("nombre"),
                            rs.getDouble("subtotal"),
                            rs.getInt("cant"),
                            rs.getDouble("precio")
                                        );
                    detalles.add(detalle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return detalles;
    }
}
