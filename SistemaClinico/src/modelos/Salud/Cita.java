/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.Salud;

import interfaces.Pago;
import java.time.LocalDateTime;

/**
 *
 * @author aspoveda
 */
public class Cita {
    
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    
    public void realizarPago(Pago pago){
        
    }
    
}
