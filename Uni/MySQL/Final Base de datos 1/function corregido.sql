DELIMITER //
CREATE FUNCTION CalcularComisionAgente(
    p_idAgente INT
)
RETURNS DECIMAL(10, 2)
DETERMINISTIC
BEGIN
    DECLARE comision_total DECIMAL(10, 2) DEFAULT 0.0;
    DECLARE done INT DEFAULT FALSE;
    DECLARE monto_pago DECIMAL(10, 2); -- Declarar las variables antes del bucle
    DECLARE comision_porcentaje DECIMAL(5, 2);
    DECLARE cur CURSOR FOR
        SELECT monto, comision
        FROM pago
        WHERE Agente_de_Seguros_idAsegurador = p_idAgente;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO monto_pago, comision_porcentaje;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SET comision_total = comision_total + (monto_pago * comision_porcentaje / 100);
    END LOOP;
    CLOSE cur;
    RETURN comision_total;
END;
//
DELIMITER ;

drop function CalcularComisionAgente;
SELECT CalcularComisionAgente(1);
