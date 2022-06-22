/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Personaje;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author paulp
 */
public class PersonajeServicio implements IPersonajeServicio{
 
    private static List<Personaje> personajeList = new ArrayList<>();
    

    public Personaje crear(Personaje personaje) {
        this.personajeList.add(personaje); 
        return personaje; 
    }
    
//    public Personaje buscar(String nombre) {
//        Personaje personaje=null;
//        for(var c:this.personajeList){
//            if(nombre==c.getNombre()){
//                personaje=c;
//                break;
//            }
//        }
//        return personaje;
//    }
    
    
    public List<Personaje> listar() {
        return this.personajeList; 
    }

    @Override
    public Personaje modificar(String nombre, Personaje PersonajeNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Personaje eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
         
}
