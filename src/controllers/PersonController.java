package controllers;

import models.Persona;

public class PersonController {

    public void sortByDireccionCodigo(Persona[] personas){

        for(int i=0; i<personas.length -1; i++){

            int indice = i;

            for(int j = i+1; j < personas.length; j++){
                if (personas[j].equalsByCodigoDireccion(personas[indice])) {
                    indice=j;
                }
            }

            if (indice != i) {
                Persona temp = personas[indice];
                personas[indice] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo){

        int izquierda = 0;
        int derecha = personas.length-1;

        while (izquierda<=derecha) {

            int medio = (izquierda+derecha)/2;

            int valor = personas[medio].getCodigoDireccion();

            if (valor == codigo) {
                return personas[medio];

            } else if (valor > codigo) {
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }

        return null;
    }
}