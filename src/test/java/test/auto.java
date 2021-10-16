package test;
public class Auto {

    int precio;
    int registro;
    String modelo;
    String marca;
    Motor motor;
    Asiento[] asientos;
    
    
    static int cantidacreados;

    public int cantidadAsientos() {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        String estado = "Auto original";
        for (int i = 0; i < asientos.length; i++) {
            if ( (asientos[i]!=null) &&  (!(motor.registro == registro) || !(registro == asientos[i].registro))) {
                estado = "Las piezas no son originales";
                break;
            }
        }
        return estado;

    }

}