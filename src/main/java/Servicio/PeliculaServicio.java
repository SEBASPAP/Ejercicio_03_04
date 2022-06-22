/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class PeliculaServicio implements IPeliculaServicio{
    
    private static List<Pelicula> peliculaList = new ArrayList<>();

    @Override
    public Pelicula crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        return pelicula;
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

//    @Override
//    public Pelicula modificar(String genero, Pelicula peliculaNuevo) {
     //   var posicion = this.buscarPosicion(peliculaNuevo);
//        this.listar().get(posicion).setNombre(peliculaNuevo.getNombre());
//        this.listar().get(posicion).setGenero(peliculaNuevo.getGenero());
//        this.listar().get(posicion).setPaisOrigen(peliculaNuevo.getPaisOrigen());
//        this.listar().get(posicion).setFechaPublicacion(peliculaNuevo.getFechaPublicacion());
//        this.listar().get(posicion).setPersonaje(peliculaNuevo.getPersonaje());
//        return peliculaNuevo;
//    }

//    @Override
//    public int buscarPosicion(Pelicula pelicula) {
//       int posicion=-1; 
//        for(var b:this.peliculaList){
//            posicion++; 
//            if(b.getGenero()==pelicula.getGenero()){
//                break;
//            }
//        }
//        return posicion;
//    }

    @Override
    public Pelicula modificar(String genero, Pelicula peliculaNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pelicula eliminar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
