package org.ieslosremedios.daw1.prog.ut7.algoritmia.voraz;

public abstract class EsquemaVoraz {

    public void voraz () {
        inicializa();
        while (!fin()) {
            seleccionaYEliminaCandidato();
            if (esPrometedor()) {
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();

}
