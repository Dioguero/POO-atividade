package view;

import controller.Controlador;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class TurmaFrame {
    /*  - singificado privado
        + é publico
     */
    private JButton listarAlunosButton;
    private JButton resultadosButton;
    private JButton novoAlunoButton;
    private Controlador controlador;

    public JButton getListarAlunosButton() {
        return listarAlunosButton;
    }

    public void setListarAlunosButton(JButton listarAlunosButton) {
        this.listarAlunosButton = listarAlunosButton;
    }

    public JButton getResultadosButton() {
        return resultadosButton;
    }

    public void setResultadosButton(JButton resultadosButton) {
        this.resultadosButton = resultadosButton;
    }

    public JButton getNovoAlunoButton() {
        return novoAlunoButton;
    }

    public void setNovoAlunoButton(JButton novoAlunoButton) {
        this.novoAlunoButton = novoAlunoButton;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public static void main(String[] args) {

    }

    private void thisWindowClosing() {

    }
    private void novoAlunoButtonActionPerformed() {

    }
    private void listarAlunosButtonActionPerformed() {

    }
    private void resultadosButtonActionPerformed() {

    }
}
