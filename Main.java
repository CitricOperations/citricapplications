import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.font.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {
    Home();
  }

  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    }
    catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
  
  static void Home() {


    Font font1 = new Font("DialogInput", Font.BOLD, 80);
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    JLabel homelabel = new JLabel("Home");
    homelabel.setHorizontalAlignment(SwingConstants.CENTER);
    homelabel.setVerticalAlignment(SwingConstants.CENTER);
    homelabel.setForeground(Color.WHITE);
    homelabel.setFont(font1);
    homelabel.setIcon(new ImageIcon("OrangeLogo.png"));
    homelabel.setText("CITRUS");

    javax.swing.JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setUndecorated(true);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.add(homelabel);
    frame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    /*
     * 
     * The code below will be used to CLOSE THE MAIN WINDOW when any application is
     * opened.
     * 
     */


    wait(3000);
    frame.setVisible(false);
    frame.dispose();
    CopyrightScreen();
  }

  static void CopyrightScreen() {
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    Font font3 = new Font("DialogInput", Font.BOLD, 15);
    JLabel copyrightlabel = new JLabel("Copyright");
    copyrightlabel.setHorizontalAlignment(SwingConstants.RIGHT);
    copyrightlabel.setVerticalAlignment(SwingConstants.CENTER);
    copyrightlabel.setForeground(Color.WHITE);
    copyrightlabel.setText("(C)INFRARED STUDIOS");
    copyrightlabel.setFont(font3);

    javax.swing.JFrame copyrightFrame = new JFrame();
    copyrightFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    copyrightFrame.setUndecorated(true);
    copyrightFrame.setResizable(false);
    copyrightFrame.setVisible(true);
    copyrightFrame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    copyrightFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    copyrightFrame.add(copyrightlabel);
  }

  static void CitricServices() {
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
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
