/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasfinanzas;

/**
 *
 * @author BRAYAN
 */
public class Amortizacion {
    int periodos;
    double TEA,prestamo;

    public Amortizacion(double  prestamo, double TEA, int periodos) {
        this.prestamo = prestamo;
        this.TEA = TEA;
        this.periodos = periodos;
    }
    
    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public double getTEA() {
        return TEA;
    }

    public void setTEA(double TEA) {
        this.TEA = TEA;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }
    
}
