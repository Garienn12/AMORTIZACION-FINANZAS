package tablasfinanzas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package flujos;

/**
 *
 * @author Allen
 */
public class datos {
    int inversion,impuestos,periodos;
    public datos(int inversion, int impuestos, int periodos){
        this.inversion=inversion;
        this.impuestos=impuestos;
        this.periodos=periodos;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }
      
}
