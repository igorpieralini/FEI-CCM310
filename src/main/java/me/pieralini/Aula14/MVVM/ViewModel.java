
package me.pieralini.Aula14.MVVM;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ViewModel {

    private final Modelo modelo;
    private final PropertyChangeSupport eventos;

    public ViewModel(Modelo modelo) {
        this.modelo = modelo;
        this.eventos = new PropertyChangeSupport(this);
    }

    public String getNome() {
        return modelo.getNome();
    }

    public void atualizarNome(String novoNome) {
        String nomeAnterior = modelo.getNome();

        modelo.setNome(novoNome);

        eventos.firePropertyChange(
                "nome",
                nomeAnterior,
                novoNome
        );
    }

    public void adicionarObservador(PropertyChangeListener observador) {
        eventos.addPropertyChangeListener(observador);
    }
}
