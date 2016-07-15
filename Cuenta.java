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
public class Cuenta {
    protected float saldo;

    public Cuenta() {
    }
    
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(float c){
        saldo += c;
    }
    
    public void extraer(float c){
        saldo -= c;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Float.floatToIntBits(this.saldo);
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
        final Cuenta other = (Cuenta) obj;
        if (Float.floatToIntBits(this.saldo) != Float.floatToIntBits(other.saldo)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
