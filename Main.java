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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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


    wait(5000);
    frame.dispose();
    CopyrightScreen();
  }

  static void CopyrightScreen() {
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    Font font3 = new Font("DialogInput", Font.BOLD, 50);
    JLabel copyrightlabel = new JLabel("Copyright");
    copyrightlabel.setHorizontalAlignment(SwingConstants.CENTER);
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
    
    wait(3000);
    copyrightFrame.dispose();
    Menu();
  }

  static void Menu() {
    GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();


    // Account Label (Username and Profile Picture)
    Font font4 = new Font("Arial", Font.BOLD, 20);
    JLabel accountlab = new JLabel("Account");
    accountlab.setHorizontalAlignment(SwingConstants.LEFT);
    accountlab.setVerticalAlignment(SwingConstants.TOP);
    accountlab.setForeground(Color.WHITE);
    accountlab.setText("Account: " + null);
    accountlab.setFont(font4);
    accountlab.setBounds(0,0,0,0);

    JLabel currenttimelab = new JLabel("Time");
    currenttimelab.setHorizontalAlignment(SwingConstants.RIGHT);
    currenttimelab.setVerticalAlignment(SwingConstants.TOP);
    currenttimelab.setForeground(Color.WHITE);
    currenttimelab.setFont(font4);
    currenttimelab.setBounds(0,0,0,0);

    javax.swing.JFrame menuFrame = new JFrame();
    menuFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    menuFrame.setUndecorated(true);
    menuFrame.setResizable(false);
    menuFrame.setVisible(true);
    menuFrame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    menuFrame.setLayout(new GridLayout(1, 1));

    menuFrame.add(accountlab);
    menuFrame.add(currenttimelab);


    LocalDate date = LocalDate.now();
    currenttimelab.setText("" + date);
  }

}
