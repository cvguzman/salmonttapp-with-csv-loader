package org.cvguzman.ui;
import javax.swing.*;
import java.awt.*;

// Clase destinada a la creación de la interfaz gráfica básica
public class Vista  extends JFrame {

    // Constructor para realizar ls primera capa de modelo vista controlador JFrame
    public Vista() {
        setTitle("Unidad Operativa interna de Salmontt");
        setSize(500,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Generamos un organizador para los componentes
        setLayout(new FlowLayout());

        // Componentes
        JLabel etiqueta = new JLabel("Bienvenido a Salmontt");
        JButton boton = new JButton("Entrar");

        boton.addActionListener(ActiveEvent -> {
            System.out.println("Botón presionado");
            JOptionPane.showMessageDialog(this,"hola");
        });

        // Se agrega componentes al Pane
        add(etiqueta);
        add(boton);

        // Efectuamos visualización de la vista
        setVisible(true);
    }

    public static void main(String[] args) {
        Vista vista = new Vista();
    }
}
