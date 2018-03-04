/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author holma
 */
public class Candidato {
    private int CC, edad, telefono;
    private String nombre, apellido, direccion, ciudadNacimiento, partidoPolitico;
    
    Scanner sc = new Scanner(System.in);
    Candidato(String _nombre, String _apellido, int _CC, int _edad, int _telefono, String _direccion, String _ciudadNacimiento, String _partidoPolitico){
        this.nombre=_nombre;
        this.apellido=_apellido;
        this.CC=_CC;
        this.edad=_edad;
        this.telefono=_telefono;
        this.direccion=_direccion;
        this.ciudadNacimiento=_ciudadNacimiento;
        this.partidoPolitico=_partidoPolitico;
    }

    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String _apellido){
        this.apellido=_apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setCc(int _CC){
        this.CC=_CC;
    }
    public int getCc(){
        return this.CC;
    }
    public void setEdad(int _edad){
        this.edad=_edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int _telefono){
        this.telefono=_telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setDireccion(String _direccion){
        this.direccion=_direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setCiudadNacimiento(String _ciudadNacimiento){
        this.ciudadNacimiento=_ciudadNacimiento;
    }
    public String getCiudadNacimiento(){
        return this.ciudadNacimiento;
    }
    public void setPartidoPolitico(String _partidoPolitico){
        this.partidoPolitico=_partidoPolitico;
    }
    public String getPartidoPolitico(String _partidoPolitico){
        return this.partidoPolitico;
    }
    protected String datosCandidato(){
            String respuesta = "\nEl candidato: "+this.nombre+" "+this.apellido; 
            respuesta+="\nNumero Documento: "+this.CC;
            respuesta+="\nEdad: "+this.edad;
            respuesta+="\nTelefono: "+this.telefono;
            respuesta+="\nDireccion: "+this.direccion;        
            respuesta+="\nCiudad: "+this.ciudadNacimiento;
            respuesta+="\nPartido político: "+this.partidoPolitico;
            return respuesta;
        }  
}
