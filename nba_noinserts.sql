#creamos la base de datos
CREATE DATABASE IF NOT EXISTS nba;

#seleccionar la base de datos
USE nba;


CREATE TABLE IF NOT EXISTS equipos (
  Nombre varchar(20) NOT NULL,
  Ciudad varchar(20) DEFAULT NULL,
  Conferencia varchar(4) DEFAULT NULL,
  Division varchar(9) DEFAULT NULL,
  PRIMARY KEY (Nombre)
);

CREATE TABLE IF NOT EXISTS jugadores (
  codigo int NOT NULL,
  Nombre varchar(30) DEFAULT NULL,
  Procedencia varchar(20) DEFAULT NULL,
  Altura varchar(4) DEFAULT NULL,
  Peso int DEFAULT NULL,
  Posicion varchar(5) DEFAULT NULL,
  Nombre_equipo varchar(20) DEFAULT NULL,
  PRIMARY KEY (codigo),
  FOREIGN KEY (Nombre_equipo) References equipos(Nombre)
);

CREATE TABLE IF NOT EXISTS estadisticas (
  temporada varchar(5) NOT NULL ,
  jugador int NOT NULL ,
  Puntos_por_partido float DEFAULT NULL,
  Asistencias_por_partido float DEFAULT NULL,
  Tapones_por_partido float DEFAULT NULL,
  Rebotes_por_partido float DEFAULT NULL,
  PRIMARY KEY (temporada,jugador),
  FOREIGN KEY (jugador) REFERENCES Jugadores(Codigo)
);

CREATE TABLE IF NOT EXISTS partidos (
  codigo int NOT NULL,
  equipo_local varchar(20) DEFAULT NULL,
  equipo_visitante varchar(20) DEFAULT NULL,
  puntos_local int DEFAULT NULL,
  puntos_visitante int DEFAULT NULL,
  temporada varchar(5) DEFAULT NULL,
  PRIMARY KEY (codigo),
  FOREIGN KEY (equipo_local) REFERENCES equipos(nombre),
  FOREIGN KEY (equipo_visitante) REFERENCES equipos(nombre)
);