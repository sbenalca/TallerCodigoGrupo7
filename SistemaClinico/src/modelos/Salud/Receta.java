/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.Salud;

import java.time.LocalDateTime;

/**
 *
 * @author aspoveda
 */
public class Receta {

    protected LocalDateTime fecha;
    protected Medicamento medicamento;
    protected PlanNutricional planNutricional;

    public Receta() {
        medicamento = new Medicamento();
        planNutricional = new PlanNutricional();
    }

}
