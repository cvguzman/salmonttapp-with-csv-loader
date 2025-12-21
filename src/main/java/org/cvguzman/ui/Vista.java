package org.cvguzman.ui;

// Importación de las clases del modelo (dominio)
import org.cvguzman.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* Clase destinada a la creación de la interfaz gráfica básica
Representa la interfaz gráfica (GUI) del sistema utilizando Swing.
Permite crear y visualizar distintas UnidadesOperativas mediante interacción con el usuario.
Esta clase cumple el rol de la vista dentro del patrón MVC
 */

public class Vista  extends JFrame {

    // ===============================
    // 1. COMPONENTES DE FORMULARIO
    // ===============================

    // Campos de texto para el ingreso de datos
    private JTextField txtColaborador;
    private JTextField txtNombre;
    private JTextField txtComuna;
    private JTextField txtTefono;
    private JComboBox<String> comboTipo;
    private JLabel lblColaborador;
    private JLabel lblTelefono;

    // ===============================
    // 2. COMPONENTES DE LISTADO
    // ===============================

    // Lista visual donde se muestran las entidades creadas
    private JList<String> listaEntidades;

    // Modelo de datos asociado a la lista visual
    private DefaultListModel<String> modeloLista;

    // ===============================
    // 3. ESTRUCTURA DE DATOS (POLIMORFISMO)
    // ===============================


    // Lista polimórfica que almacena objetos que implementan la interfaz Registrable
    private List<Registrable> entidades = new ArrayList<>();

    // ===============================
    // 4. CONSTRUCTOR DE LA VISTA
    // ===============================

    // Constructor para realizar ls primera capa de modelo vista controlador JFrame
    // Inicializa la ventana, define el layout, crea los componentes gráficos y configura los eventos deinteracción
    public Vista() {
        setTitle("Unidad Operativa interna de Salmontt");
        setSize(1000, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new BorderLayout(10, 10));

        // -------------------------------
        // Panel superior con formulario
        // -------------------------------

        // Panel superior
        JPanel panel = new JPanel(new GridLayout(10, 10, 10, 10));

        // Selección del tipo de entidad
        panel.add(new JLabel("Tipo de Entidad"));
        comboTipo = new JComboBox<>(new String[]{"Colaborador", "Centro de Cultivo"});
        panel.add(comboTipo);

        // Listener para reaccionar al cambio de selección
        comboTipo.addActionListener(e -> actualizarFormulario());

        // Campo Colaborador
        lblColaborador = new JLabel("Colaborador");
        panel.add(lblColaborador);
        txtColaborador = new JTextField();
        panel.add(txtColaborador);

        // Campo teléfono del colaborador
        lblTelefono = new JLabel("Teléfono");
        panel.add(lblTelefono);
        txtTefono = new JTextField();
        panel.add(txtTefono);

        // Campo nombre de la planta o centro
        panel.add(new JLabel("Nombre Centro"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        // Campo ubicación comuna
        panel.add(new JLabel("Comuna Centro"));
        txtComuna = new JTextField();
        panel.add(txtComuna);

        // Botón para crear la identidad
        JButton boton = new JButton("Crear Entidad");
        panel.add(boton);
        add(panel, BorderLayout.NORTH);

        // -------------------------------
        // Lista visual de entidades
        // -------------------------------

        // Lista entidades
        modeloLista = new DefaultListModel<>();
        listaEntidades = new JList<>(modeloLista);

        JScrollPane scrollLista = new JScrollPane(listaEntidades);
        scrollLista.setBorder(
                BorderFactory.createTitledBorder("Entidades creadas")
        );

        // División de la ventana entre formulario y lista
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                panel,
                scrollLista
        );

        splitPane.setDividerLocation(450);
        add(splitPane, BorderLayout.CENTER);

        // Evento del botón
        boton.addActionListener(e -> crearEntidad());
        setVisible(true);
    }

    // ===============================
    // 5. CREACIÓN DE ENTIDADES
    // ===============================

    /**
     * Método encargado de:
     * - Validar los datos ingresados
     * - Crear la entidad correspondiente según el tipo seleccionado
     * - Almacenar y mostrar el resultado en la interfaz
     */
    private void crearEntidad() {
     // Obtención de datos desde el formulario
    String colaborador = txtColaborador.getText();
    String nombre = txtNombre.getText();
    String comuna = txtComuna.getText();

    int telefono = 0;
    // Validación numérica del teléfono
    try {
        telefono = Integer.parseInt(txtTefono.getText().trim());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
                this,
                "Ingrese números en el campo teléfono",
                "Error numérico",
                JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    // Creación polimórfica de la entidad
    UnidadOperativa entidad = null;
    if (comboTipo.getSelectedItem().equals("Centro de Cultivo")) {
        entidad = new CentroCultivo(nombre, comuna, 45677);
    } else if (comboTipo.getSelectedItem().equals("Colaborador")) {
        entidad = new Colaborador(nombre, comuna, colaborador, telefono);
    }

    // Protección contra valores null
    if (entidad == null) {
        JOptionPane.showMessageDialog(
                this,
                "Tipo de entidad no válido o no implementado",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    // Se agrega la identidad a la lista polimórfica
    entidades.add(entidad);

    // Se muestra el resumen en la vista visual
    modeloLista.addElement(entidad.mostrarResumen());

    // Mensaje de confirmación
    JOptionPane.showMessageDialog(
            this,
            entidad.mostrarResumen(),
            "Entidad creada exitosamente",
            JOptionPane.INFORMATION_MESSAGE
    );

    // Limpieza del formulario
    limpiarFormulario();
}

// ===============================
// 6. LIMPIEZA DEL FORMULARIO
// ===============================

// Limpias los campos del formulario luego de crear la entidad
private void limpiarFormulario() {
        txtColaborador.setText("");
        txtNombre.setText("");
        txtComuna.setText("");
        txtTefono.setText("");
    }

    // ===============================
    // 7. ACTUALIZACIÓN DEL FORMULARIO
    // ===============================

    private void actualizarFormulario() {
        String tipo = (String) comboTipo.getSelectedItem();
        boolean esCentroCultivo = "Centro de Cultivo".equals(tipo);

        // Métodos exclusivo para Colaborador
        lblColaborador.setVisible(!esCentroCultivo);
        txtColaborador.setVisible(!esCentroCultivo);

        lblTelefono.setVisible(!esCentroCultivo);
        txtTefono.setVisible(!esCentroCultivo);

        if(esCentroCultivo) {
            txtColaborador.setText("");
            txtTefono.setText("");
        }

        // Refresca la vista
        revalidate();
        repaint();
    }

    // ===============================
    // 8. PUNTO DE ENTRADA GRÁFICO
    // ===============================

    // Método main para ejecutar la aplicación gráfica
    public static void main(String[] args) {
        new Vista();
    }
}
