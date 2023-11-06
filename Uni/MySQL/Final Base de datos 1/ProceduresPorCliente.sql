DELIMITER //
CREATE PROCEDURE GetReclamosPorCliente(IN clienteID INT)
BEGIN
    SELECT r.*
    FROM reclamo r
    WHERE r.Cliente_idCliente = clienteID;
END //
DELIMITER ;

CALL GetReclamosPorCliente(1);

DELIMITER //
CREATE PROCEDURE GetPolizasPorCliente(IN clienteID INT)
BEGIN
    SELECT p.*
    FROM poliza p
    WHERE p.Cliente_idCliente = clienteID;
END //
DELIMITER ;

call GetPolizasPorCliente(1);

DELIMITER //
CREATE PROCEDURE GetPagosPorCliente(IN clienteID INT)
BEGIN
    SELECT pa.*
    FROM pago pa
    JOIN poliza po ON pa.Poliza_idPoliza = po.idPoliza
    WHERE po.Cliente_idCliente = clienteID;
END //
DELIMITER ;

call GetPagosPorCliente(1);






