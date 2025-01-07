package prueba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


    class ecommerce {

        static boolean iniciarsesion(String nombre, String direccion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static void mostrarProductosDisponibles() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static List<Product> getProductos() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static List<String> getCarrito() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static void realizarcompra() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ecommerce() {
        }
    }

   

       
public class EcommerceApp extends JFrame {
private ecommerce ecommerce;
    
    //Constructor para configurar la ventana principal 
    public EcommerceApp(){
        ecommerce = new ecommerce(); //Inicializar controlador
        initComponents();
    }
    private void initComponents(){
        setTitle("Sistema de E-commerce");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //Crear panel para las operaciones principales 
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout (1, 4));
        
        JButton btnRegistro = new JButton("Registrar Cliente");
        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnBuscarProductos = new JButton("Buscar Productos");
        JButton btnCarrito = new JButton("Ver Carrito");
        
        menuPanel.add(btnRegistro);
        menuPanel.add(btnLogin);
        menuPanel.add(btnBuscarProductos);
        menuPanel.add(btnCarrito);
        
        add(menuPanel, BorderLayout.NORTH);
        
        //Panel principal donde se mostrarán las vistas dinámicas
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        
        //Acción para registrar un cliente 
        btnRegistro.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              mostrarRegistroCliente(mainPanel);
          }
        });
        
        //Acción para iniciar sesión 
        btnLogin.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               iniciarsesion(mainPanel);
           }
        });
        
         //Acción para buscar productos 
    btnBuscarProductos.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
        mostrarBuscarProductos(mainPanel);
    }
    });
    
    //Acción para ver el carrito 
    btnCarrito.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            mostrarCarrito(mainPanel);
        } 
    });
}
    private void mostrarRegistroCliente(JPanel mainPanel){
        mainPanel.removeAll();
        
        JLabel lblNombre = new JLabel("Ingrese su nombre: ");
        JTextField txtNombre = new JTextField(20);
        JLabel lblDireccion = new JLabel ("Ingrese una direccion: ");
        JTextField txtDireccion = new JTextField(20);
        JLabel lblDinero = new JLabel ("Ingrese la cantidad disponible de dinero para su compra: ");
        JTextField txtDinero = new JTextField(10);
        JButton btnRegistrar = new JButton("Reistrar");
        
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(lblDinero);
        panel.add(txtDinero);
        panel.add(new JLabel());
        panel.add(btnRegistrar);
       
        
        btnRegistrar.addActionListener (e -> {
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            double dinero;
            try{
                dinero = Double.parseDouble(txtDinero.getText());
                //ecommerce.agregarcliente(nombre, direccion, dinero);
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un numero valido");
                return;
            }
            }); 
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
       
                
    
    private void iniciarsesion(JPanel mainPanel){
        mainPanel.removeAll();
        
        JLabel lblNombre = new JLabel("Ingrese su nombre de usuario: ");
        JTextField txtNombre = new JTextField (20);
        JLabel lblDireccion = new JLabel("Ingrese su direccion: ");
        JTextField txtDireccion = new JTextField(20);
        JButton btnLogin = new JButton ("Iniciar Sesión");

        JPanel panel = new JPanel(new GridLayout(3, 2));
         panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(new JLabel());
        panel.add(btnLogin);
        

        btnLogin.addActionListener(e ->{
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        if (ecommerce.iniciarsesion(nombre, direccion)){
        JOptionPane.showMessageDialog(mainPanel, "Inicio de sesion exitoso");
        }else{
        JOptionPane.showMessageDialog(mainPanel, "Nombre o direccion incorrectos.");
        }
      });

        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private void mostrarBuscarProductos(JPanel mainPanel){
        mainPanel.removeAll();
        JTextArea txtProductos = new JTextArea();
        ecommerce.mostrarProductosDisponibles();
        List<Product> productos = ecommerce.getProductos();
        for (Product producto: productos) {
        txtProductos.append(producto.toString() + "\n");
        }

        mainPanel.add(new JScrollPane(txtProductos), BorderLayout.CENTER);

        
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private void mostrarCarrito(JPanel mainPanel) {
        mainPanel.removeAll();

        JTextArea txtCarrito = new JTextArea();
        txtCarrito.setEditable(false);

        List<String> carrito = ecommerce.getCarrito();
        if (carrito.isEmpty()) {
        txtCarrito.setText("El carrito esta vacío");
        }else {
            for (String producto : carrito){
            txtCarrito.append(producto + "\n");
            }
        }
        
        mainPanel.add(new JScrollPane(txtCarrito), BorderLayout.CENTER); 
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void realizarCompra(JPanel mainPanel) {
        mainPanel.removeAll();
        ecommerce.realizarcompra();
        JOptionPane.showMessageDialog(mainPanel, "Compra realizada exitosamente");
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
        EcommerceApp app = new EcommerceApp();
        app.setVisible(true);
            /*app.setVisible(true);*/
        });
}
}