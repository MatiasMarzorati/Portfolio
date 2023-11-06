DELIMITER //
CREATE TRIGGER IncrementarPuntosCompania
AFTER INSERT ON poliza
FOR EACH ROW
BEGIN
    DECLARE cliente_id INT;

    SELECT Cliente_idCliente INTO cliente_id
    FROM poliza
    WHERE idPoliza = NEW.idPoliza;

    UPDATE cliente
    SET puntosCompania = puntosCompania + 1
    WHERE idCliente = cliente_id;
END;
//
DELIMITER ;

INSERT INTO poliza (numero_de_poliza, fecha_de_emision, fecha_de_vencimiento, Cliente_idCliente, Agente_de_Seguros_idAsegurador, cobertura_idCobertura)
VALUES (4006, '2023-09-18', '2024-09-18', 1, 1, 1);
select * from cliente;
