DELIMITER //
CREATE PROCEDURE GetReclamosPorAgente(IN agenteID INT)
BEGIN
    SELECT r.*
    FROM reclamo r
    WHERE r.Agente_de_Seguros_idAsegurador = agenteID;
END //
DELIMITER ;

call GetReclamosPorAgente(1);
call GetReclamosPorAgente(2);

DELIMITER //
CREATE PROCEDURE GetPolizasPorAgente(IN agenteID INT)
BEGIN
    SELECT p.*
    FROM poliza p
    WHERE p.Agente_de_Seguros_idAsegurador = agenteID;
END //
DELIMITER ;
call GetPolizasPorAgente(1);
call GetPolizasPorAgente(2);

DELIMITER //
CREATE PROCEDURE GetPagosPorAgente(IN agenteID INT)
BEGIN
    SELECT pa.*
    FROM pago pa
    WHERE pa.Agente_de_Seguros_idAsegurador = agenteID;
END //
DELIMITER ;

call GetPagosPorAgente(1);
call GetPagosPorAgente(2);
