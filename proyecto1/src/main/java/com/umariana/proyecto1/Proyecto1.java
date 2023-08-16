/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umariana.proyecto1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.estudiante;

/**
 *
 * @author Posgrados
 */
public class Proyecto1 {

    public static void main(String[] args) {
        //funcion que permite leer el programa
        Scanner lectura = new Scanner (System.in);
        
        //bandera que permite terminar el programa
        boolean activo= true;
        
        ArrayList<estudiante> misEstudiantes= new ArrayList<estudiante>();
        
        do{
        System.out.println("=========menu de opciones=========");
        System.out.println("1. Insertar alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. modificar alumno");
        System.out.println("4. consultar alumno"); 
        System.out.println("5. Terminar programa");
        System.out.println("===================================");
        
        int opcion=lectura.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Introduce el nombre del alumno: ");
                int nombre = lectura.nextInt();
                System.out.println("Introduce el apellido del alumno: ");
                int apellido = lectura.nextInt();
                System.out.println("Introduce la semestre del alumno: ");
                int semestre = lectura.nextInt();
                System.out.println("Introduce el correo del alumno: ");
                int correo = lectura.nextInt();
                System.out.println("Introduce el celular del alumno: ");
                int celular= lectura.nextInt();
                System.out.println("Introduce el cedula del alumno: ");
                int cedula= lectura.nextInt();
                
                //se crea un objeto para guardar la informacion del alumno
                estudiante a = new estudiante();
                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setSemestre(semestre);
                a.setCorreo(correo);
                a.setCelular(celular);
                a.setCedula(cedula);
                break;
            
            case 2: 
                System.out.println("seleccione la opcion 2");
        }
            
        
        
        }while(activo);
    }
}
