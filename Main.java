import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.font.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

  public static void main(String[] args){
    Home();
  }
  
  static void Home() {

    GraphicsEnvironment graphics =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    
    JLabel homelabel = new JLabel("Home");
    homelabel.setHorizontalAlignment(SwingConstants.CENTER);
    homelabel.setVerticalAlignment(SwingConstants.CENTER);
    homelabel.setForeground(Color.WHITE);

    String newline = System.getProperty("line.seperator");
    
    javax.swing.JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setUndecorated(true);
    frame.setResizable(false);
    frame.setVisible(true);
    homelabel.setText("CITRIC");
    frame.add(homelabel);
    Font font1 = new Font("Arial", Font.BOLD, 50);
    homelabel.setFont(font1);
    frame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    /*

    The code below will be used to CLOSE THE MAIN WINDOW when any application is opened.

    */
    
    // frame.setVisible(false);
    // frame.dispose();
  }

  static void CitricServices() {
    GraphicsEnvironment graphics =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    Font font2 = new Font("Arial", Font.BOLD, 40);
    JLabel servicelabel = new JLabel("Services.");
    servicelabel.setHorizontalAlignment(SwingConstants.CENTER);
    servicelabel.setVerticalAlignment(SwingConstants.CENTER);
    servicelabel.setForeground(Color.WHITE);
    servicelabel.setText("Citric Services");
    servicelabel.setFont(font2);

    javax.swing.JFrame serviceFrame = new JFrame();
    serviceFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    serviceFrame.setUndecorated(true);
    serviceFrame.setResizable(false);
    serviceFrame.setVisible(true);
    serviceFrame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    serviceFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    // add objects to frame
    serviceFrame.add(servicelabel);
  }
}
