package Pruebaclase4;

import Modelo.Alumno;

import java.io.IOException;
import java.net.BindException;

public class Principal {
public static void main (String [] args){
  Alumno alumno = new Alumno();
  System.err.println(alumno.getNombre());
}
}
