
INSERT INTO `seguros`.`provincia` (`idProvincia`, `nombreProvincia`)
VALUES 
(1, 'Buenos Aires'), 
(2, 'CABA');
select * from provincia;

INSERT INTO `seguros`.`ciudades` (`idCiudad`, `nombreCiudad`, `Provincia_idProvincia`)
VALUES 
(1, 'Ballester', 1),
(2, 'Belgrano', 2);
select * from ciudades;

INSERT INTO `seguros`.`calle` (`idNumeroCalle`, `numero`, `calle`)
VALUES 
(1, '5354', 'Pacifico Rodriguez'),
(2, '893', 'Arce');
select * from calle;

INSERT INTO `seguros`.`direccion` (`idDireccion`, `calle_idNumeroCalle`, `ciudades_idCiudad`)
VALUES 
(1, 1, 1), 
(2, 2, 2);
select * from direccion;

INSERT INTO `seguros`.`persona` (`idPersona`, `nombre`, `apellido`, `telefono`, `direcciones_idDireccion`)
VALUES 
(1, 'Matias', 'Marzorat', '11 2513 0914', 1),
(2, 'Gisela', 'Perugorria', '11 6453 0914', 1),
(3, 'Valen', 'Werle', '11  0000 1111', 2);
select * from persona;

INSERT INTO `seguros`.`agente_de_seguros` (`idAsegurador`, `persona_idPersona`)
VALUES 
(1, 1), 
(2, 2);
select * from agente_de_seguros;

INSERT INTO `seguros`.`cliente` (`idCliente`,`puntosCompania`, `persona_idPersona`)
VALUES
(1,0, 3);
select * from cliente;

INSERT INTO `seguros`.`cobertura` (`idCobertura`, `tipo_cobertura`, `descripcion`)
VALUES 
(1, 'Todo Riesgo', 'Cobertura ante todo riesgo'),
(2, 'Premium', 'Cobertura premium');
select * from cobertura;

INSERT INTO `seguros`.`poliza` (`idPoliza`, `numero_de_poliza`, `fecha_de_emision`, `fecha_de_vencimiento`, `Cliente_idCliente`, `Agente_de_Seguros_idAsegurador`, `cobertura_idCobertura`)
VALUES (1, 1001, '2023-09-15', '2024-09-15', 1, 1, 1),
       (2, 2002, '2023-09-16', '2024-09-16', 1, 2, 2),
       (3, 3003, '2023-09-17', '2024-09-17', 1, 2, 1);
select * from poliza;


INSERT INTO `seguros`.`modificacion` (`idModificacion`, `fecha_modificacion`, `descripcion`, `Agente_de_Seguros_idAsegurador`, `Poliza_idPoliza`)
VALUES (1, '2023-09-15', 'Alteracion de precios', 1, 1),
       (2, '2023-09-16', 'alteracion de vehiculo', 2, 2),
       (3, '2023-09-17', 'Modificación 3', 1, 3);
select * from modificacion;

INSERT INTO `seguros`.`pago` (`idPago`, `fecha_pago`, `monto`, `mesAPagar`, `metodo de pago`,`comision`, `Poliza_idPoliza`, `Agente_de_Seguros_idAsegurador`)
VALUES (1, '2023-09-15', 100.0, 'Septiembre', 'efec',10, 1, 1),
       (2, '2023-09-16', 200.0, 'Septiembre', 'efec',10, 2, 2),
       (3, '2023-09-17', 300.0, 'Septiembre', 'efec',10, 3, 1);
select * from pago;

INSERT INTO `seguros`.`reclamo` (`idReclamo`, `fecha_reclamo`, `descripcion`, `Cliente_idCliente`, `Agente_de_Seguros_idAsegurador`)
VALUES (1, '2023-09-15', 'Reclamo 1', 1, 1),
       (2, '2023-09-16', 'Reclamo 2', 1, 2),
       (3, '2023-09-17', 'Reclamo 3', 1, 1);
select * from reclamo;