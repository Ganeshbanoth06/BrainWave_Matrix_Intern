import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FreshBreezeLandingPage extends JFrame {

    public FreshBreezeLandingPage() {
        // Set up the frame
        setTitle("FreshBreeze - Refresh Your Home, Sustainably");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create a panel for the header section
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        
        JLabel titleLabel = new JLabel("Transform Your Home, Sustainably", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel, BorderLayout.NORTH);
        
        JButton shopNowButton = new JButton("Shop Now");
        headerPanel.add(shopNowButton, BorderLayout.SOUTH);
        shopNowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Navigating to Shop Page...");
            }
        });
        
        add(headerPanel, BorderLayout.NORTH);
        
        // Create a panel for the featured categories
        JPanel categoriesPanel = new JPanel();
        categoriesPanel.setLayout(new GridLayout(1, 3, 10, 10));
        
        // Eco-Friendly Furniture
        JPanel furniturePanel = new JPanel();
        furniturePanel.setLayout(new BorderLayout());
        JLabel furnitureLabel = new JLabel("Eco-Friendly Furniture", JLabel.CENTER);
        JButton browseFurnitureButton = new JButton("Browse Furniture");
        furniturePanel.add(furnitureLabel, BorderLayout.NORTH);
        furniturePanel.add(browseFurnitureButton, BorderLayout.SOUTH);
        browseFurnitureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Navigating to Furniture Page...");
            }
        });
        categoriesPanel.add(furniturePanel);
        
        // Green Cleaning Supplies
        JPanel cleaningPanel = new JPanel();
        cleaningPanel.setLayout(new BorderLayout());
        JLabel cleaningLabel = new JLabel("Green Cleaning Supplies", JLabel.CENTER);
        JButton shopCleaningButton = new JButton("Shop Cleaning Supplies");
        cleaningPanel.add(cleaningLabel, BorderLayout.NORTH);
        cleaningPanel.add(shopCleaningButton, BorderLayout.SOUTH);
        shopCleaningButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Navigating to Cleaning Supplies Page...");
            }
        });
        categoriesPanel.add(cleaningPanel);
        
        // Organic Bedding
        JPanel beddingPanel = new JPanel();
        beddingPanel.setLayout(new BorderLayout());
        JLabel beddingLabel = new JLabel("Organic Bedding", JLabel.CENTER);
        JButton exploreBeddingButton = new JButton("Explore Bedding");
        beddingPanel.add(beddingLabel, BorderLayout.NORTH);
        beddingPanel.add(exploreBeddingButton, BorderLayout.SOUTH);
        exploreBeddingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Navigating to Bedding Page...");
            }
        });
        categoriesPanel.add(beddingPanel);
        
        add(categoriesPanel, BorderLayout.CENTER);
        
        // Create a panel for customer testimonials
        JPanel testimonialsPanel = new JPanel();
        testimonialsPanel.setLayout(new BorderLayout());
        
        JLabel testimonialsLabel = new JLabel("Customer Testimonials", JLabel.CENTER);
        testimonialsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        testimonialsPanel.add(testimonialsLabel, BorderLayout.NORTH);
        
        JTextArea testimonialsArea = new JTextArea();
        testimonialsArea.setText("Jane D.: “I love my new eco-friendly furniture from FreshBreeze. It’s beautiful and I feel great knowing it’s good for the environment!”\n\n"
                                + "Mark R.: “The cleaning supplies work wonderfully and I’m impressed with the natural ingredients. Highly recommend!”");
        testimonialsArea.setEditable(false);
        testimonialsPanel.add(new JScrollPane(testimonialsArea), BorderLayout.CENTER);
        
        add(testimonialsPanel, BorderLayout.SOUTH);
        
        // Create a footer panel
        JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new GridLayout(2, 2));
        
        JButton aboutUsButton = new JButton("About Us");
        JButton contactUsButton = new JButton("Contact Us");
        JButton privacyPolicyButton = new JButton("Privacy Policy");
        JButton termsOfServiceButton = new JButton("Terms of Service");
        
        footerPanel.add(aboutUsButton);
        footerPanel.add(contactUsButton);
        footerPanel.add(privacyPolicyButton);
        footerPanel.add(termsOfServiceButton);
        
        add(footerPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FreshBreezeLandingPage().setVisible(true);
            }
        });
    }
}
