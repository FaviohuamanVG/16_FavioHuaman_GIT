<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ventas</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-4">Lista de Ventas</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Cliente</th>
            <th>Documento</th>
            <th>Fecha</th>
            <th>Fecha de Pago</th>
            <th>Importe</th>
            <th>Tipo de Pago</th>
            <th>Tipo de Comprobante</th>
            <th>Tipo de Envío</th>
            <th>Serie</th>
            <th>Descuento</th>
            <th>Impuesto</th>
            <th>Total</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="venta" items="${ventas}">
            <tr>
                <td>${venta.idventa}</td>
                <td>${venta.idcliente}</td>
                <td>${venta.documento}</td>
                <td>${venta.fecha}</td>
                <td>${venta.fecha_pago}</td>
                <td>${venta.importe}</td>
                <td>${venta.idtipopago}</td>
                <td>${venta.idtipocomp}</td>
                <td>${venta.tipoEnvio}</td>
                <td>${venta.serie}</td>
                <td>${venta.descuento}</td>
                <td>${venta.impuesto}</td>
                <td>${venta.total}</td>
                <td>
                    <form action="ventas" method="post">
                        <input type="hidden" name="idventa" value="${venta.idventa}">
                        <button type="submit" class="btn btn-primary">
                            Ver Detalles
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <!-- Modal -->
    <c:if test="${not empty detalles}">
        <div class="modal fade show" id="detallesModal" tabindex="-1" role="dialog" aria-labelledby="detallesModalLabel" aria-hidden="true" style="display:block;">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="detallesModalLabel">Detalles de la Venta</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>Producto</th>
                                <th>Cantidad</th>
                                <th>Precio</th>
                                <th>Subtotal</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="detalle" items="${detalles}">
                                <tr>
                                    <td>${detalle.nombre}</td>
                                    <td>${detalle.cantidad}</td>
                                    <td>${detalle.precio}</td>
                                    <td>${detalle.subtotal}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                    </div>
                </div>
            </div>
        </div>
    </c:if>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
