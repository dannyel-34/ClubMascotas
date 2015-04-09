/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.nomina;

/**
 *
 * @author DANIEL
 * 
 */
public class registro_empleados {

  
    public int getCodigo() {
        return codigo;
    }

  
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

 
    public int getSueldo() {
        return sueldo;
    }

   
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

   
    public String getNombres() {
        return nombres;
    }

  
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

  
    public String getCargo() {
        return cargo;
    }

    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    int codigo;
    int sueldo;
    String nombres;
    String cargo;
    
    
    
}
