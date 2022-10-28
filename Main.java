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
import java.io.*;
import java.awt.event.*;

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
  
  static void Settings() {
    javax.swing.JFrame setsFrame = new JFrame();
    setsFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setsFrame.setUndecorated(true);
    setsFrame.setResizable(false);
    setsFrame.setVisible(true);
    setsFrame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    setsFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    setsFrame.setLocationRelativeTo(null);
    setsFrame.setLayout(null);

    JLabel backhome = new JLabel("BackHome");
    backhome.setHorizontalAlignment(SwingConstants.LEFT);
    backhome.setVerticalAlignment(SwingConstants.TOP);
    backhome.setForeground(Color.WHITE);
    backhome.setIcon(new ImageIcon("BackHome.png"));
    backhome.setText(" ");
    backhome.setBounds(0,0,60,60);

    setsFrame.add(backhome);

    // Button to go back home
    backhome.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        setsFrame.setVisible(false);
        setsFrame.dispose();
        Menu();
      }
    });
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

    Font font3 = new Font("DialogInput", Font.BOLD, 25);
    JLabel copyrightlabel = new JLabel("Copyright");
    copyrightlabel.setHorizontalAlignment(SwingConstants.CENTER);
    copyrightlabel.setVerticalAlignment(SwingConstants.CENTER);
    copyrightlabel.setForeground(Color.WHITE);
    copyrightlabel.setText("INFRARED STUDIOS");
    copyrightlabel.setIcon(new ImageIcon("TransparentInfrared.png"));
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
    accountlab.setText(" ");
    accountlab.setIcon(new ImageIcon("DefaultAvatar.png"));
    accountlab.setFont(font4);
    accountlab.setBounds(0,0,60,60);

    JLabel shutdownlab = new JLabel("Shutdown");
    shutdownlab.setHorizontalAlignment(SwingConstants.LEFT);
    shutdownlab.setVerticalAlignment(SwingConstants.TOP);
    shutdownlab.setForeground(Color.WHITE);
    shutdownlab.setText(" ");
    shutdownlab.setIcon(new ImageIcon("TransSettings.png"));
    shutdownlab.setFont(font4);
    shutdownlab.setBounds(5,70,50,50);
    
    javax.swing.JFrame menuFrame = new JFrame();
    menuFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    menuFrame.setUndecorated(true);
    menuFrame.setResizable(false);
    menuFrame.setVisible(true);
    menuFrame.getContentPane().setBackground(new java.awt.Color(44, 47, 51));
    menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    menuFrame.setLocationRelativeTo(null);
    menuFrame.setLayout(null);

    menuFrame.add(accountlab);
    menuFrame.add(shutdownlab);

    shutdownlab.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        menuFrame.setVisible(false);
        menuFrame.dispose();
        Settings();
      }
    });

  }

}
