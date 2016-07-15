/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_2;

/**
 *
 * @author SPPDF
 */
public class CuentaClave extends Cuenta{
    protected int clave;
    
    public CuentaClave(){
        
    }

    public CuentaClave(int clave, float saldo) {
        super(saldo);
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    @Override
    public  void  extraer(float c){
        if(this.saldo > 0){
            saldo -= c;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.clave;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaClave other = (CuentaClave) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuentaClave{" + "clave=" + clave + '}';
    }
    
    
    
    
}
