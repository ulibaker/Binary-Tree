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
public class BinaryTree {
    NodeT root;
    String alltree = "";
    public BinaryTree() {
        root = null;
    }
    
    public void addNode(int data, String name) {
        NodeT newnode = new NodeT(data, name);
        if(root == null) {
            root = newnode;            
        } 
        else {
            NodeT aux = root;
            NodeT father;
            
            while(true) {
                father = aux;
                if(data < aux.data) {
                    aux = aux.sonL;
                    if(aux == null) { 
                        father.sonL = newnode;
                        return;
                    }
                }
                else {
                    aux = aux.sonR;
                    if(aux == null) {
                        father.sonR = newnode;
                        return;
                    }
                }
            }
        }
    }
    public void cleanString() {
        alltree = "";
    }
    
    public boolean isVoid() {
        return (root == null);
    }
    
    public String inOrder(NodeT r) {       
        if(r != null) {
            inOrder(r.sonL);
            alltree = alltree+" "+r.data;
            inOrder(r.sonR);       
        }
        
        return alltree;
    }
    
    public String preOrder(NodeT r) {
        if(r != null) {
            alltree = alltree+" "+r.data;
            preOrder(r.sonL);
            preOrder(r.sonR);       
        }
        
        return alltree;
    }
    
    public String postOrder(NodeT r) {
        if(r != null) {           
            postOrder(r.sonL);
            postOrder(r.sonR); 
            alltree = alltree+" "+r.data;
        }
        
        return alltree;
    }   
    
    public NodeT searchNode(int data) {
        NodeT aux = root;
        while(aux.data != data) {
            if(data < aux.data) {
                aux = aux.sonL;
            }
            else {
                aux = aux.sonR;
            }
            if(aux == null) {
                return null;
            }
        }
        return aux;
    }
    
    public boolean delete(int data) {
        NodeT aux = root;
        NodeT father = root;
        boolean isSonL = true;       
        while(aux.data != data) {
            father = aux;
            if(data < aux.data) {
                isSonL = true; 
                aux = aux.sonL;
            }
            else {
                isSonL = false;
                aux = aux.sonR;
            }
            if(aux == null) {
                return false;
            }
        }
        if(aux.sonL == null && aux.sonR == null) {
            if(aux == root) {
                root = null;
            }
            else if(isSonL) {
                father.sonL = null;
            }
            else {
                father.sonR = null;
            }
        }
        else if(aux.sonR == null) {
            if(aux == root) {
                root = aux.sonL;
            }
            else if(isSonL) {
                father.sonL = aux.sonL;
            }
            else {
                father.sonR = aux.sonL;
            }
        }
        else if(aux.sonL == null) {
            if(aux == root) {
                root = aux.sonR;
            }
            else if(isSonL) {
                father.sonL = aux.sonR;
            }
            else {
                father.sonR = aux.sonR;
            }
        }
        else {  
            NodeT replacement = getReplacement(aux);
            if(aux == root) {
                root = replacement;
            }
            else if(isSonL) {
                father.sonL = replacement;
            }
            else {
                father.sonR = replacement;
            }
            replacement.sonL = aux.sonL;
        }
        return true;
    }
    
    public NodeT getReplacement(NodeT nodeRep) {
        NodeT fatherGet = nodeRep;
        NodeT repGet = nodeRep;
        NodeT auxGet = nodeRep.sonR;
        
        while(auxGet != null) {
            fatherGet = repGet;
            repGet = auxGet;
            auxGet = auxGet.sonL;   
        }
        if(repGet != nodeRep.sonR) {
            fatherGet.sonL = repGet.sonR; 
            repGet.sonR = nodeRep.sonR;
        }
        return repGet;
    }
}