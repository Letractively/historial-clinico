CREATE TABLE cita
(
  id serial NOT NULL,
  fechahora date,
  idpaciente integer NOT NULL,
  idmedico integer NOT NULL,
  CONSTRAINT cita_pkey PRIMARY KEY (id)
);

CREATE TABLE especializacion
(
  id integer NOT NULL,
  nombre character varying(45) NOT NULL,
  CONSTRAINT especializacion_pkey PRIMARY KEY (id)
);

CREATE TABLE historiaclinica
(
  id integer NOT NULL,
  estado integer,
  CONSTRAINT historiaclinica_pkey PRIMARY KEY (id)
);

CREATE TABLE medico
(
  id serial NOT NULL,
  idpersona integer NOT NULL,
  idespecializacion integer NOT NULL,
  CONSTRAINT medico_pkey PRIMARY KEY (id)
);
CREATE TABLE paciente
(
  id integer NOT NULL,
  idpersona integer NOT NULL,
  idhistoriaclinica integer NOT NULL,
  CONSTRAINT paciente_pkey PRIMARY KEY (id)
);
CREATE TABLE permiso
(
  id serial NOT NULL,
  nombre character varying(20),
  descripcion character varying(20),
  CONSTRAINT permiso_pkey PRIMARY KEY (id)
);
CREATE TABLE permisosxusurio
(
  idusurio serial NOT NULL,
  idpermiso integer NOT NULL,
  CONSTRAINT permisosxusurio_pkey PRIMARY KEY (idusurio, idpermiso)
);
CREATE TABLE persona
(
  id serial NOT NULL,
  tipodocumento character varying(5),
  nrodocumento numeric(10,0),
  nombres character varying(45),
  apellidos character varying(45),
  email character varying(25),
  fechanacimiento date,
  telefono character varying(45),
  direccion character varying(45),
  idusurio integer,
  CONSTRAINT persona_pkey PRIMARY KEY (id)
);
CREATE TABLE procedimiento
(
  id serial NOT NULL,
  cirugia character varying(45) NOT NULL,
  terapia character varying(45) NOT NULL,
  idcita integer NOT NULL,
  CONSTRAINT procedimiento_pkey PRIMARY KEY (id)
);
CREATE TABLE usuario
(
  id serial NOT NULL,
  login character varying(45),
  clave character varying(45),
  estado integer,
  CONSTRAINT usuario_pkey PRIMARY KEY (id)
)


  
