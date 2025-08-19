import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CemeteryG extends JFrame {

    // Controller y objetos que ya tienes en tu proyecto
    private CementerioController control = new CementerioController();
    private Enterrador enterrador = new Enterrador("Luis", "Pala", 24, 0);
    private Fantasma fantasma = new Fantasma("Alta", 1);

    // “Consola” simple
    private JTextArea consola = new JTextArea(10, 70);

    // Campos Exorcista
    private JTextField exoNombre = new JTextField(10);
    private JSpinner exoNum = new JSpinner(new SpinnerNumberModel(0, 0, 1000, 1));

    // Campos Guardia
    private JTextField guarNombre = new JTextField(10);
    private JTextField guarPuesto = new JTextField(10);
    private JCheckBox guarVigilando = new JCheckBox("Inicia vigilando");

    // Campos Lote
    private JSpinner lotePrecio = new JSpinner(new SpinnerNumberModel(1000.0, 0.0, 1_000_000.0, 100.0));
    private JSpinner loteDiametro = new JSpinner(new SpinnerNumberModel(2.0, 0.0, 100.0, 0.5));

    // Campos Lápida
    private JTextField lapForma = new JTextField(10);
    private JTextField lapMaterial = new JTextField(10);

    public CemeteryG() {
        super("Cementerio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pestañas (simple)
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Exorcista", panelExorcista());
        tabs.addTab("Guardia", panelGuardia());
        tabs.addTab("Lote", panelLote());
        tabs.addTab("Lápida", panelLapida());
        tabs.addTab("Fantasma", panelFantasma());

        // Consola
        consola.setEditable(false);
        JScrollPane sp = new JScrollPane(consola);

        add(tabs, BorderLayout.CENTER);
        add(sp, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    private JPanel panelExorcista() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(new JLabel("Nombre:"));
        p.add(exoNombre);
        p.add(new JLabel("Exorcismos:"));
        p.add(exoNum);

        JButton bCrear = new JButton("Crear exorcista");
        bCrear.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                String nom = exoNombre.getText().trim();
                int n = ((Number) exoNum.getValue()).intValue();
                if (nom.isEmpty()) { log("Pon un nombre para el exorcista."); return; }
                log(control.crearexorcista(nom, n)); // <- método real
            }
        });
        p.add(bCrear);

        JButton bExorcismo = new JButton("Realizar exorcismo");
        bExorcismo.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.realizarExorcismo());
            }
        });
        p.add(bExorcismo);

        JButton bBend = new JButton("Realizar bendición");
        bBend.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.realizarBendicion());
            }
        });
        p.add(bBend);

        return p;
    }

    private JPanel panelGuardia() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(new JLabel("Nombre:"));
        p.add(guarNombre);
        p.add(new JLabel("Puesto:"));
        p.add(guarPuesto);
        p.add(guarVigilando);

        JButton bCrear = new JButton("Crear guardia");
        bCrear.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                String nom = guarNombre.getText().trim();
                String puesto = guarPuesto.getText().trim();
                boolean v = guarVigilando.isSelected();
                if (nom.isEmpty() || puesto.isEmpty()) { log("Rellena nombre y puesto."); return; }
                log(control.crearGuardia(nom, puesto, v)); // <- requiere boolean
            }
        });
        p.add(bCrear);

        JButton bVigilar = new JButton("Vigilar (toggle)");
        bVigilar.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.vigilar()); // toggle
            }
        });
        p.add(bVigilar);

        JButton bUbic = new JButton("Ver ubicación");
        bUbic.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.buscarUbic());
            }
        });
        p.add(bUbic);

        return p;
    }

    private JPanel panelLote() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(new JLabel("Precio:"));
        p.add(lotePrecio);
        p.add(new JLabel("Diámetro:"));
        p.add(loteDiametro);

        JButton bCrear = new JButton("Crear lote");
        bCrear.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                double precio = ((Number) lotePrecio.getValue()).doubleValue();
                double diam = ((Number) loteDiametro.getValue()).doubleValue();
                log(control.crearLote(precio, diam));
            }
        });
        p.add(bCrear);

        JButton bPrecio = new JButton("Ver precio");
        bPrecio.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.verPrecioLote());
            }
        });
        p.add(bPrecio);

        JButton bDiam = new JButton("Ver diámetro");
        bDiam.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.verDiametroLote());
            }
        });
        p.add(bDiam);

        return p;
    }

    private JPanel panelLapida() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(new JLabel("Forma:"));
        p.add(lapForma);
        p.add(new JLabel("Material:"));
        p.add(lapMaterial);

        JButton bCrear = new JButton("Crear lápida");
        bCrear.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                String forma = lapForma.getText().trim();
                String mat = lapMaterial.getText().trim();
                if (forma.isEmpty() || mat.isEmpty()) { log("Rellena forma y material."); return; }
                log(control.crearLapida(forma, mat));
            }
        });
        p.add(bCrear);

        JButton bForma = new JButton("Ver forma");
        bForma.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.verFormaLapida());
            }
        });
        p.add(bForma);

        JButton bMats = new JButton("Ver materiales");
        bMats.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.verMaterialesLapida());
            }
        });
        p.add(bMats);

        return p;
    }

    private JPanel panelFantasma() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        p.add(new JLabel("Enterrador fijo: Luis | Fantasma: peligrosidad Alta"));

        JButton bAsustar = new JButton("Asustar Enterrador");
        bAsustar.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.asustarEnterrador(fantasma, enterrador));
            }
        });
        p.add(bAsustar);

        JButton bPoseer = new JButton("Poseer Enterrador");
        bPoseer.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                log(control.poseerenterrador(fantasma, enterrador));
            }
        });
        p.add(bPoseer);

        return p;
    }

    private void log(String s) {
        consola.append(s + "\n");
        consola.setCaretPosition(consola.getDocument().getLength());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                new CemeteryG().setVisible(true);
            }
        });
    }
}