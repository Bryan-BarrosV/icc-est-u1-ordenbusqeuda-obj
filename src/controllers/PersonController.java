package controllers;
import models.Persona;

public class PersonController {

    public void sortByDireccionCodigo(Persona[] personas){
        for(int i = 0 ; i < personas.length - 1 ; i++){
            int max = i;
            for (int j = i + 1; j < personas.length; j++){
                if (personas[j].getCodigoDireccion() > personas[max].getCodigoDireccion()){
                    max = j;
                }
            }
            if (max != i){
                Persona temp = personas[max];
                personas[max] = personas[i];
                personas [i] = temp;
            }
        }
    }
}