package Modelo; 

public class Personaje { 
    String nombre; 
    String clase; 
    int nivel; 
    double vida; 
    double vidaMaxima; 
    int ataque; 
    int defensa; 

  // Constructor 
    public Personaje(String nombre, String clase, double vidaMax, int ataque, int defensa) { 
        this.nombre    = nombre; 
        this.clase     = clase; 
        this.nivel     = 1; 
        this.vida      = vidaMax; 
        this.vidaMaxima= vidaMax; 
        this.ataque    = ataque; 
        this.defensa   = defensa; 
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    public void MostrarEstado(){
        double vidaMax = 100;
        String estado;

        double pct = (vida / vidaMax) * 100;
        if (pct <= 0) {
            estado = "[..........] 0% - MUERTO";
        } else if (pct <= 25) {
            estado = "[##........] 25% - CRITICO";
        } else if (pct <= 50) {
            estado = "[#####.....] 50% - HERIDO";
        } else if (pct <= 75) {
            estado = "[#######...] 75% - ESTABLE";
        } else {
            estado = "[##########] 100% - SALUDABLE";
        }
        System.out.println(nombre + " Estado: " + estado); 
    }
    
    @Override 

    public String toString() { 

        return String.format( 
          "[%s] %s Nv%d | HP:%.0f/%.0f", 
          clase,nombre,nivel,vida,vidaMaxima); 
    } 
} 
