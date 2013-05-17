CREATE TABLE `Permiso` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`descripcion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE=MyISAM
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `Persona` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`tipoDocumento` int(11) NOT NULL,
`nroDocumento` decimal(10,0) NOT NULL,
`nombres` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`apellidos` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`email` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`fechaNacimiento` datetime NOT NULL,
`telefono` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`direccion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`idUsurio` int NOT NULL,
PRIMARY KEY (`id`) 
)
ENGINE=MyISAM
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `Usuario` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`login` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`clave` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`estado` int(11) NOT NULL DEFAULT 1,
PRIMARY KEY (`id`) 
)
ENGINE=MyISAM
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `PermisosXUsurio` (
`idUsurio` int NOT NULL,
`idPermiso` int NOT NULL,
PRIMARY KEY (`idUsurio`, `idPermiso`) 
);

CREATE TABLE `Medico` (
`id` int NOT NULL AUTO_INCREMENT,
`idPersona` int NOT NULL,
`idEspecializacion` int NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Paciente` (
`id` int NOT NULL AUTO_INCREMENT,
`idPersona` int NOT NULL,
`idHistoriaClinica` int NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Especializacion` (
`id` int NOT NULL AUTO_INCREMENT,
`nombre` varchar(45) NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `HistoriaClinica` (
`id` int NOT NULL AUTO_INCREMENT,
`estado` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Cita` (
`id` int NOT NULL AUTO_INCREMENT,
`fechaHora` datetime NOT NULL DEFAULT current,
`idPaciente` int NOT NULL,
`idMedico` int NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Procedimiento` (
`id` int NOT NULL AUTO_INCREMENT,
`Cirugia` varchar(45) NOT NULL,
`Terapia` varchar(45) NOT NULL,
`idCita` int NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Clase` (
`id` int NOT NULL AUTO_INCREMENT,
`descripcion` varchar(100) NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `Parametro` (
`id` int NOT NULL AUTO_INCREMENT,
`descripcion` varchar(120) NOT NULL,
`idClase` int NOT NULL,
PRIMARY KEY (`id`) 
);


ALTER TABLE `Usuario` ADD CONSTRAINT `fk_Usuario_PermisosXUsurio_1` FOREIGN KEY (`id`) REFERENCES `PermisosXUsurio` (`idUsurio`);
ALTER TABLE `Permiso` ADD CONSTRAINT `fk_Permiso_PermisosXUsurio_1` FOREIGN KEY (`id`) REFERENCES `PermisosXUsurio` (`idPermiso`);
ALTER TABLE `Usuario` ADD CONSTRAINT `fk_Usuario_Persona_1` FOREIGN KEY (`id`) REFERENCES `Persona` (`idUsurio`);
ALTER TABLE `Medico` ADD CONSTRAINT `fk_medico_Persona_1` FOREIGN KEY (`idPersona`) REFERENCES `Persona` (`id`);
ALTER TABLE `Paciente` ADD CONSTRAINT `fk_paciente_Persona_1` FOREIGN KEY (`idPersona`) REFERENCES `Persona` (`id`);
ALTER TABLE `Especializacion` ADD CONSTRAINT `fk_Especializacion_medico_1` FOREIGN KEY (`id`) REFERENCES `Medico` (`idEspecializacion`);
ALTER TABLE `Paciente` ADD CONSTRAINT `fk_paciente_HistoriaClinica_1` FOREIGN KEY (`idHistoriaClinica`) REFERENCES `HistoriaClinica` (`id`);
ALTER TABLE `Medico` ADD CONSTRAINT `fk_medico_Cita_1` FOREIGN KEY (`id`) REFERENCES `Cita` (`idMedico`);
ALTER TABLE `Paciente` ADD CONSTRAINT `fk_paciente_Cita_1` FOREIGN KEY (`id`) REFERENCES `Cita` (`idPaciente`);
ALTER TABLE `Cita` ADD CONSTRAINT `fk_Cita_Procedimiento_1` FOREIGN KEY (`id`) REFERENCES `Procedimiento` (`idCita`);
ALTER TABLE `Clase` ADD CONSTRAINT `fk_Clase_Parametro_1` FOREIGN KEY (`id`) REFERENCES `Parametro` (`idClase`);
ALTER TABLE `Parametro` ADD CONSTRAINT `fk_Parametro_Persona_1` FOREIGN KEY (`id`) REFERENCES `Persona` (`tipoDocumento`);

