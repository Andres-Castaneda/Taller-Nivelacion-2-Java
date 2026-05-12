
package taller.nivelacion.pkg2.java;
import Modelo.Personaje;

public class TallerNivelacion2Java {

    public static void main(String[] args) {
        Personaje guerrero = new Personaje( 
        "Aragorn","Guerrero",100,18,12); 

        Personaje mago = new Personaje( 
        "Gandalf","Mago",70,28,5); 

        Personaje arquero = new Personaje( 
        "Legolas","Arquero",85,22,8); 

        guerrero.setNivel(0);
        mago.setNivel(75);
        arquero.setNivel(10);
        
        System.out.println(guerrero); 

        System.out.println(mago); 

        System.out.println(arquero); 

        // Dos objetos del mismo molde son independientes 

        double Vida_G = guerrero.getVida();
        Vida_G -= 30;
        double Vida_M = mago.getVida();

        /*System.out.println(Vida_G); // 70 
        System.out.println(Vida_M);*/
        // 70 (sin cambio)
        
        guerrero.MostrarEstado();
        mago.MostrarEstado();
        arquero.MostrarEstado();
        guerrero.recibirDano(25); 
        guerrero.curar(10); 
        System.out.println(guerrero.estaVivo()); 
        
    }
}
