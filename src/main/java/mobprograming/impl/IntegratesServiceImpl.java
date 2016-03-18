package mobprograming.impl;

import mobprograming.Alumno;
import mobprograming.Integrante;
import mobprograming.IntegrantesService;
import mobprograming.Relator;

/**
 * Created by maliaga on 17-03-16.
 */
public class IntegratesServiceImpl implements IntegrantesService {

    public Integrante[] creaIntegrantes() {

        Relator mario = new Relator("Mario", "Aliaga", 36, "JAVA");

        Alumno jorge = new Alumno("Jorge", "Zambrano", 38, 1234567);
        Alumno oscar = new Alumno("Oscar", "Lemoine", 34, 65432222);
        Alumno roberto = new Alumno("Roberto", "Correa", 25, 44455566);
        Alumno marcel = new Alumno("Marcel", "Goular", 32, 4342323);

        Integrante[] integrantes = {mario, jorge, oscar, roberto, marcel};

        return integrantes;
    }

    public Integrante getIntegranteMayorEdad() {
        Integrante[] integrantes = creaIntegrantes();
        Integrante integranteMayorEdad = null;

        int mayorEdad = 0;

        for (Integrante integrante : integrantes) {
            if (mayorEdad < integrante.getEdad()) {
                mayorEdad = integrante.getEdad();
                integranteMayorEdad = integrante;
            }
        }
        return integranteMayorEdad;
    }

    public Integrante getIntegranteNombreMasLargo() {
        Integrante[] integrantes = creaIntegrantes();
        Integrante integranteNombreMasLargo = null;

        int largoMax = 0;

        for (Integrante integrante : integrantes) {
            if (largoMax < integrante.getNombre().length()) {
                largoMax = integrante.getNombre().length();
                integranteNombreMasLargo = integrante;
            }
        }
        return integranteNombreMasLargo;
    }

    public void showIntegrantes() {
        Integrante[] integrantes = creaIntegrantes();

        for (Integrante integrante : integrantes) {
            System.out.println(integrante.toString());
        }
    }

    public int getSumaEdad() {
        Integrante[] integrantes = creaIntegrantes();
        int sumaEdad = 0;

        for (Integrante integrante : integrantes) {
            sumaEdad += integrante.getEdad();
        }

        return sumaEdad;
    }
}
