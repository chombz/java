
package mvc_demo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Java program to demonstrate how MVC works.
 * @author e.chomba
 */
public class MVC_Demo
{
    //Declare the GUi components
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    
    public MVC_Demo()
    {
        //Invoke the method to initialise the above components
        prepareGUI();
    }
    
    
    
    public static void main(String[] args) 
    {
        //Launch the application
        SwingUtilities.invokeLater(() ->
        {
          MVC_Demo ch = new MVC_Demo(); 
        });
    }
    
    private void prepareGUI()
    {
        //Design the GUI
        this.mainFrame = new JFrame("Demonstrate MVC");
        this.mainFrame.setSize(400, 400);
        this.mainFrame.setLayout(new GridLayout(3, 1));
        this.headerLabel = new JLabel("", JLabel.CENTER);
        this.statusLabel = new JLabel("", JLabel.CENTER);
        this.statusLabel.setSize(350, 100);
        
        //Add an event listener to the Jframe/Window
        this.mainFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
        
        this.controlPanel = new JPanel();
        this.controlPanel.setLayout(new FlowLayout());
        
        //Add the GUI components to the JFrame/Window
        this.mainFrame.add(headerLabel);
        this.mainFrame.add(controlPanel);
        this.mainFrame.add(statusLabel);
        this.clickOK();
        this.mainFrame.setLocationRelativeTo(null);
        this.mainFrame.setVisible(true);
    }
    
    private void clickOK()
    {
        //Declare a JButton and Instantiate it
        JButton btnOK = new JButton("OK");
        btnOK.setActionCommand("OK");
        
        //Add an event listener to the OK button
        btnOK.addActionListener((ae) ->
        {
            statusLabel.setText("Button click controller invocked");
        });
        
        //Add the ok button to the control panel
        controlPanel.add(btnOK);
                
    }
    
}
