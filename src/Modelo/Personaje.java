package Modelo; 

public class Personaje { 
    private String nombre; 
    private String clase; 
    private int    nivel; 
    private double vida; 
    private double vidaMaxima; 
    private int    ataque; 
    private int    defensa;  

    private static final String[] CLASES = {"Guerrero","Mago","Arquero"}; 
  // Constructor 
    public Personaje(String nombre, String clase, double vidaMax, int ataque, int defensa) { 
        this.nombre = nombre; 
        setClase(clase);       // usa setter 
        this.nivel     = 1; 
        this.vidaMaxima= vidaMax; 
        this.vida      = vidaMax; 
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

    public void setClase(String c) {
        for (String valida : CLASES) 
        if (valida.equals(c)) { this.clase=c; return; } 
        System.out.println("Clase invalida: "+c); 
        this.clase = "Guerrero"; // default 
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int n) {
        if (n <= 1) this.nivel = 1;
        else if(n >= 50 ) this.nivel = 50;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double v) {
        if (v < 0) this.vida = 0; 
        else if (v > vidaMaxima) this.vida = vidaMaxima; 
        else this.vida = v; 
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
    
    public void recibirDano(int dano) { 
        int danoReal = dano - this.defensa; 
        if (danoReal < 1) danoReal = 1; 
        setVida(this.vida - danoReal); 
        System.out.printf("%s recibe %d de dano. HP:%.0f%n", 
          nombre, danoReal, vida); 
    } 

    public void curar(double cantidad) { 
        setVida(this.vida + cantidad); 
        System.out.printf("%s curado. HP:%.0f/%.0f%n", 
          nombre, vida, vidaMaxima); 
    } 

    public boolean estaVivo() { 
        return this.vida > 0; 
    } 
    
    @Override 

    public String toString() { 

        return String.format( 
          "[%s] %s Nv%d | HP:%.0f/%.0f", 
          clase,nombre,nivel,vida,vidaMaxima); 
    } 
} 
