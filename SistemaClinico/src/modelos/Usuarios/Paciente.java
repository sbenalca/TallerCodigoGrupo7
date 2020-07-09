/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.Usuarios;

import modelos.Salud.HistoriaClinica;
import modelos.Salud.Receta;

/**
 *
 * @author aspoveda
 */
public class Paciente extends Persona {

    protected String email;
    protected Receta receta;
    protected HistoriaClinica historia_clinica;

    public Paciente() {
        receta = new Receta();
        historia_clinica = new HistoriaClinica();
    }

    public boolean solicitarCita() {
        return false;

    }

}
