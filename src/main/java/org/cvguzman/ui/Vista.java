package org.cvguzman.ui;
import org.cvguzman.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Clase destinada a la creación de la interfaz gráfica básica
public class Vista  extends JFrame {

    private JTextField txtColaborador;
    private JTextField txtNombre;
    private JTextField txtComuna;
    private JTextField txtTefono;
    private JComboBox<String> comboTipo;

    // Lista visual
    private JList<String> listaEntidades;
    private DefaultListModel<String> modeloLista;

    // Lista polimórfica
    private List<Registrable> entidades = new ArrayList<>();

    // Constructor para realizar ls primera capa de modelo vista controlador JFrame
    public Vista() {
        setTitle("Unidad Operativa interna de Salmontt");
        setSize(1000, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new BorderLayout(10, 10));

        // Panel superior
        JPanel panel = new JPanel(new GridLayout(10, 10, 10, 10));

        // Componente para crear entidad
        panel.add(new JLabel("Tipo de entidad"));
        comboTipo = new JComboBox<>(new String[]{"Colaborador", "Centro Cultivo", "Planta Proceso"});
        panel.add(comboTipo);

        panel.add(new JLabel("Colaborador"));
        txtColaborador = new JTextField();
        panel.add(txtColaborador);

        panel.add(new JLabel("Teléfono"));
        txtTefono = new JTextField();
        panel.add(txtTefono);

        panel.add(new JLabel("Nombre Planta"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Comuna Planta"));
        txtComuna = new JTextField();
        panel.add(txtComuna);

        JButton boton = new JButton("Crear Entidad");
        panel.add(boton);
        add(panel, BorderLayout.NORTH);

        // Lista entidades
        modeloLista = new DefaultListModel<>();
        listaEntidades = new JList<>(modeloLista);

        JScrollPane scrollLista = new JScrollPane(listaEntidades);
        scrollLista.setBorder(
                BorderFactory.createTitledBorder("Entidades creadas")
        );

        // Split
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                panel,
                scrollLista
        );

        splitPane.setDividerLocation(450);
        add(splitPane, BorderLayout.CENTER);
        boton.addActionListener(e -> crearEntidad());
        setVisible(true);
    }

private void crearEntidad() {
        String colaborador = txtColaborador.getText();
        String nombre = txtNombre.getText();
        String comuna = txtComuna.getText();
        int telefono;
        try {
            telefono = Integer.parseInt(txtTefono.getText().trim());
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un número válido",
                    "Error numérico", JOptionPane.ERROR_MESSAGE);
            return;
        }

    UnidadOperativa entidad;
        if(comboTipo.getSelectedItem().equals("Centro de Cultivo")) {
            entidad = new CentroCultivo(nombre, comuna, telefono);
        } else if (comboTipo.getSelectedItem().equals("Colaborador")) {
            entidad = new Colaborador(colaborador, nombre, comuna,telefono);
        } else {
            entidad = new PlantaProceso(nombre, comuna, telefono);
    }

        entidades.add(entidad);
        modeloLista.addElement(entidad.mostrarResumen().toString());
        JOptionPane.showMessageDialog(this, entidad.mostrarResumen(), "Entidad creada exitosamente", JOptionPane.INFORMATION_MESSAGE);
        limpiarFormulario();
}

private void limpiarFormulario() {
        txtColaborador.setText("");
        txtNombre.setText("");
        txtComuna.setText("");
        txtTefono.setText("");
    }

    public static void main(String[] args) {
        new Vista();
    }
}
