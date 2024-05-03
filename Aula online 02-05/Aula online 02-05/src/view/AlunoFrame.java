package view;

import controller.Controlador;
import model.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class AlunoFrame {
    private JTextField nomeTextField;
    private JButton okButton;
    private JButton cancelarButton;
    private JTextField notaTextField;
    private Controlador controlador;
    private Aluno aluno;
    private boolean editando;

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    private void thisWindowClosing() {

    }
    private void cancelarButtonActionPerformed() {

    }
    private void cancelar() {

    }
    private void okButtonActionPerformed() {

    }
    public void carregarDados() {

    }

    public JButton getOkButton() {
        return okButton;
    }

    public void setOkButton(JButton okButton) {
        this.okButton = okButton;
    }

    public JTextField getNomeTextField() {
        return nomeTextField;
    }

    public void setNomeTextField(JTextField nomeTextField) {
        this.nomeTextField = nomeTextField;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JTextField getNotaTextField() {
        return notaTextField;
    }

    public void setNotaTextField(JTextField notaTextField) {
        this.notaTextField = notaTextField;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }
}
