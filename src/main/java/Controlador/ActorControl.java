/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Actor;
import Modelo.Pelicula;
import Modelo.Personaje;
import Servicio.ActorServicio;
import Servicio.PeliculaServicio;
import Servicio.PersonajeServicio;
import java.util.List;

/**
 *
 * @author paulp
 */
public class ActorControl {
    
    Actor act;
    Personaje personaje;
    Pelicula Pelicula;
    
    private final ActorServicio actorServicio = new ActorServicio();
    private final PersonajeServicio personajeServicio = new PersonajeServicio();
    private final PeliculaServicio peliculaServicio = new PeliculaServicio();
    
    
    
    public Actor crear(String [] params, int fechaNacimiento, int edad){  //,Personaje personaje,Pelicula pelicula
       // Personaje personaje; //= this.personajeServicio.crear(personaje);
       // Pelicula pelicula; //= this.peliculaServicio.crear(pelicula);
        var actor = new Actor(params[0],params[1],fechaNacimiento, edad); //,personaje,pelicula
        this.actorServicio.crear(actor);
        return actor;
    }
   
    public List<Actor> listar()
    {
        return this.actorServicio.listar();
    }
    
    public void modificar(String [] params, int fechaNacimiento, int edad){
       
        var act = new Actor(params[0],params[1],fechaNacimiento, edad);
        act.setNombre(params[0]);
        act.setNacionalidad(params[1]);
        act.setFechanacimiento(fechaNacimiento);
        act.setEdad(edad);
        act.setPersonaje(personaje);
        act.setPelicula(Pelicula);
        
        actorServicio.modificar(act);
    }
    
}
