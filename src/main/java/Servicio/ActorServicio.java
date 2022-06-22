/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Actor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class ActorServicio implements IActorServicio{

    private static List<Actor> actorList = new ArrayList<>();
    
    @Override
    public Actor crear(Actor actor) {
        this.actorList.add(actor);
        return actor;
    }

    @Override
    public List<Actor> listar() {
        return this.actorList;
    }

    @Override
    public Actor eliminar(int codigopersonaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Actor modificar(Actor actor) {
        for (int i = 0; i < actorList.size();i++){
            Actor ac = actorList.get(i);
            if(ac.getNombre() == actor.getNombre()){
                actorList.set(i,actor);
                break;
            }
        }
        return null;
    }
    
}
