package newpackage;
/*
    Hecho por el equipo conformado por:
    
        Perla Liliana Covarrubias Pérez  -   (20550202)
        Marilee Armenta Acosta           -   (20550227)
        Gisely Mayram Terán Ramírez      -   (20550225)
        Nubia Estefany Castro Martinez   -   (20550210)  
        María Kassandra Lara Aguirre     -   (20550213)
        René Ulises Delgado García       -   (20550195)

        El 18 de Junio del 2021.
*/
public class NodeT {
    NodeT sonL;
    NodeT sonR;
    String name;
    int data;
    
    public NodeT(int data, String name) {
        this.data = data;
        this.name = name;
        this.sonL = null;
        this.sonR = null;
    }

    @Override
    public String toString() {
        return "El nodo llamado: " + name + ", con valor de: " + data;
    }    
    
}
