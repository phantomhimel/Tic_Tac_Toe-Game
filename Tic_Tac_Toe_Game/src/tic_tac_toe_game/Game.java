/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe_game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Game extends javax.swing.JFrame {
    
    
    public Game() {
        initComponents();
        homepnl.setBackground(Color.white);
        lblhome.setBackground(new Color(153,153,153));
    }
    
    
    private String startGame = "X";
    private int xCount = 0; 
    private int oCount = 0;
    private int x = 0 , y = 0;
    
    
    private void gameScore()
    {
        lblx.setText(String.valueOf(xCount));
        lblo.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else 
        {
            startGame = "X";
        }
    }
    
    
    private void winningGame()
    {
        String p1 = lbl1.getText();
        String p2 = lbl2.getText();
        String p3 = lbl3.getText();
        
        String p4 = lbl4.getText();
        String p5 = lbl5.getText();
        String p6 = lbl6.getText();
        
        String p7 = lbl7.getText();
        String p8 = lbl8.getText();
        String p9 = lbl9.getText();
        
        
        // for player X
        
        if("X".equals(p1) && "X".equals(p2) && "X".equals(p3))
        {
            lbl1.setBackground(Color.GREEN);
            lbl2.setBackground(Color.GREEN);
            lbl3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p4) && "X".equals(p5) && "X".equals(p6))
        {
            lbl4.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p7) && "X".equals(p8) && "X".equals(p9))
        {
            lbl7.setBackground(Color.GREEN);
            lbl8.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p1) && "X".equals(p4) && "X".equals(p7))
        {
            lbl1.setBackground(Color.GREEN);
            lbl4.setBackground(Color.GREEN);
            lbl7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p2) && "X".equals(p5) && "X".equals(p8))
        {
            lbl2.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p3) && "X".equals(p6) && "X".equals(p9))
        {
            lbl3.setBackground(Color.GREEN);
            lbl6.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p1) && "X".equals(p5) && "X".equals(p9))
        {
            lbl1.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        if("X".equals(p3) && "X".equals(p5) && "X".equals(p7))
        {
            lbl3.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
        }
        // for player O
        
        if("O".equals(p1) && "O".equals(p2) && "O".equals(p3))
        {
            lbl1.setBackground(Color.GREEN);
            lbl2.setBackground(Color.GREEN);
            lbl3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p4) && "O".equals(p5) && "O".equals(p6))
        {
            lbl4.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p7) && "O".equals(p8) && "O".equals(p9))
        {
            lbl7.setBackground(Color.GREEN);
            lbl8.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p1) && "O".equals(p4) && "O".equals(p7))
        {
            lbl1.setBackground(Color.GREEN);
            lbl4.setBackground(Color.GREEN);
            lbl7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p2) && "O".equals(p5) && "O".equals(p8))
        {
            lbl2.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p3) && "O".equals(p6) && "O".equals(p9))
        {
            lbl3.setBackground(Color.GREEN);
            lbl6.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p1) && "O".equals(p5) && "O".equals(p9))
        {
            lbl1.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if("O".equals(p3) && "O".equals(p5) && "O".equals(p7))
        {
            lbl3.setBackground(Color.GREEN);
            lbl5.setBackground(Color.GREEN);
            lbl7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }
        if((((((((!"X".equals(p1) && !"O".equals(p1) || (!"X".equals(p2) && !"O".equals(p2))) || (!"X".equals(p3) && !"O".equals(p3))) || (!"X".equals(p4) && !"O".equals(p4))) || (!"X".equals(p5) && !"O".equals(p5))) || (!"X".equals(p6) && !"O".equals(p6))) || (!"X".equals(p7) && !"O".equals(p7))) || (!"X".equals(p8) && !"O".equals(p8)))
                || (!"X".equals(p9) && !"O".equals(p9)))
        {
        } else {
            JOptionPane.showMessageDialog(null, "Match Tie !! ", "Tic Tac Toe", HEIGHT);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        homepnl = new javax.swing.JPanel();
        lblplay = new javax.swing.JLabel();
        playpnl = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        resetpnl = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        exitpnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        gamepnl = new javax.swing.JPanel();
        play = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        howToPlay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        score = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblo = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        base.setBackground(new java.awt.Color(102, 102, 102));
        base.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                baseMouseDragged(evt);
            }
        });
        base.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                baseMousePressed(evt);
            }
        });
        base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhome.setBackground(new java.awt.Color(51, 51, 51));
        lblhome.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblhome.setForeground(new java.awt.Color(255, 255, 255));
        lblhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhome.setText("Play");
        lblhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhome.setOpaque(true);
        lblhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblhomeMouseExited(evt);
            }
        });
        sidebar.add(lblhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 43));

        homepnl.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout homepnlLayout = new javax.swing.GroupLayout(homepnl);
        homepnl.setLayout(homepnlLayout);
        homepnlLayout.setHorizontalGroup(
            homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        homepnlLayout.setVerticalGroup(
            homepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sidebar.add(homepnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 10, 43));

        lblplay.setBackground(new java.awt.Color(51, 51, 51));
        lblplay.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblplay.setForeground(new java.awt.Color(255, 255, 255));
        lblplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblplay.setText("Score");
        lblplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblplay.setOpaque(true);
        lblplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblplayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblplayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblplayMouseExited(evt);
            }
        });
        sidebar.add(lblplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 43));

        playpnl.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout playpnlLayout = new javax.swing.GroupLayout(playpnl);
        playpnl.setLayout(playpnlLayout);
        playpnlLayout.setHorizontalGroup(
            playpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        playpnlLayout.setVerticalGroup(
            playpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        sidebar.add(playpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 10, 43));

        lblreset.setBackground(new java.awt.Color(51, 51, 51));
        lblreset.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblreset.setForeground(new java.awt.Color(255, 255, 255));
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("How to Play");
        lblreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblreset.setOpaque(true);
        lblreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblresetMouseExited(evt);
            }
        });
        sidebar.add(lblreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 43));

        resetpnl.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout resetpnlLayout = new javax.swing.GroupLayout(resetpnl);
        resetpnl.setLayout(resetpnlLayout);
        resetpnlLayout.setHorizontalGroup(
            resetpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        resetpnlLayout.setVerticalGroup(
            resetpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        sidebar.add(resetpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 10, 43));

        lblexit.setBackground(new java.awt.Color(51, 51, 51));
        lblexit.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblexit.setForeground(new java.awt.Color(255, 255, 255));
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("Exit");
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.setOpaque(true);
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblexitMouseExited(evt);
            }
        });
        sidebar.add(lblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, 43));

        exitpnl.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout exitpnlLayout = new javax.swing.GroupLayout(exitpnl);
        exitpnl.setLayout(exitpnlLayout);
        exitpnlLayout.setHorizontalGroup(
            exitpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        exitpnlLayout.setVerticalGroup(
            exitpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        sidebar.add(exitpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 10, 43));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("TIc Tac Toe");
        sidebar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Play for fun");
        sidebar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        sidebar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 10));

        base.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 323));

        gamepnl.setBackground(new java.awt.Color(102, 102, 102));
        gamepnl.setLayout(new java.awt.CardLayout());

        play.setBackground(new java.awt.Color(102, 102, 102));
        play.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setOpaque(true);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        play.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 11, 109, 72));

        lbl1.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setOpaque(true);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        play.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 11, 109, 72));

        lbl2.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setOpaque(true);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        play.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 11, 109, 72));

        lbl6.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setOpaque(true);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        play.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 89, 109, 72));

        lbl5.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setOpaque(true);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        play.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 89, 109, 72));

        lbl4.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setOpaque(true);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        play.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 89, 109, 72));

        lbl8.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setOpaque(true);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        play.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 167, 109, 72));

        lbl7.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setOpaque(true);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        play.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 167, 109, 72));

        lbl9.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setOpaque(true);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        play.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 167, 109, 72));

        reset.setBackground(new java.awt.Color(102, 102, 102));
        reset.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(224, 235, 235));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("RESET");
        reset.setToolTipText("<html>\nYou can also reset<br>\nby Clicking on the R / r key\n</html>");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setOpaque(true);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resetMouseReleased(evt);
            }
        });
        play.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 257, 136, 43));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        play.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 0, -1));

        gamepnl.add(play, "card2");

        howToPlay.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("<html>\n1. The game is played on a grid that's 3 squares by 3 squares.<br><br>\n\n2. You are X, your friend  is O. Players take turns putting<br>\n their marks in empty squares.<br><br>\n\n3. The first player to get 3 of her marks in a row\n (up, down, across, or diagonally) is the winner.<br><br>\n\n4. When all 9 squares are full, the game is over. <br>\nIf no player has 3 marks in a row, the game ends in a tie. <br>\n</html>");

        javax.swing.GroupLayout howToPlayLayout = new javax.swing.GroupLayout(howToPlay);
        howToPlay.setLayout(howToPlayLayout);
        howToPlayLayout.setHorizontalGroup(
            howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        howToPlayLayout.setVerticalGroup(
            howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        gamepnl.add(howToPlay, "card3");

        score.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Player Name");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Point");

        lblo.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblo.setForeground(new java.awt.Color(255, 255, 204));
        lblo.setText("0");

        lblx.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lblx.setForeground(new java.awt.Color(255, 255, 204));
        lblx.setText("0");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("First Player (X)");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Second Player (O)");

        jSeparator2.setForeground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout scoreLayout = new javax.swing.GroupLayout(score);
        score.setLayout(scoreLayout);
        scoreLayout.setHorizontalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreLayout.createSequentialGroup()
                        .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(scoreLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreLayout.createSequentialGroup()
                        .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))))
        );
        scoreLayout.setVerticalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        gamepnl.add(score, "card4");

        base.add(gamepnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 0, 440, 323));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(656, 323));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseClicked
        // TODO add your handling code here:
       homepnl.setBackground(Color.white);
       lblhome.setBackground(new Color(153,153,153));
       playpnl.setBackground(new Color(51,51,51));
       resetpnl.setBackground(new Color(51,51,51));
       exitpnl.setBackground(new Color(51,51,51));
       lblplay.setBackground(new Color(51,51,51));
       lblreset.setBackground(new Color(51,51,51));
       lblexit.setBackground(new Color(51,51,51));
       
        gamepnl.removeAll();
        gamepnl.add(play);
        gamepnl.repaint();
        gamepnl.revalidate();
    }//GEN-LAST:event_lblhomeMouseClicked

    private void lblplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseClicked
        // TODO add your handling code here:
        playpnl.setBackground(Color.white);
        lblplay.setBackground(new Color(153,153,153));
        homepnl.setBackground(new Color(51,51,51));
        resetpnl.setBackground(new Color(51,51,51));
        exitpnl.setBackground(new Color(51,51,51));
        lblhome.setBackground(new Color(51,51,51));
        lblreset.setBackground(new Color(51,51,51));
        lblexit.setBackground(new Color(51,51,51));
        
        gamepnl.removeAll();
        gamepnl.add(score);
        gamepnl.repaint();
        gamepnl.revalidate();
    }//GEN-LAST:event_lblplayMouseClicked

    private void lblresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresetMouseClicked
        // TODO add your handling code here:
        resetpnl.setBackground(Color.white);
        lblreset.setBackground(new Color(153,153,153));
        homepnl.setBackground(new Color(51,51,51));
        playpnl.setBackground(new Color(51,51,51));
        exitpnl.setBackground(new Color(51,51,51));
        lblplay.setBackground(new Color(51,51,51));
        lblhome.setBackground(new Color(51,51,51));
        lblexit.setBackground(new Color(51,51,51));
        
        gamepnl.removeAll();
        gamepnl.add(howToPlay);
        gamepnl.repaint();
        gamepnl.revalidate();
    }//GEN-LAST:event_lblresetMouseClicked

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        // TODO add your handling code here:
        exitpnl.setBackground(Color.white);
        lblexit.setBackground(new Color(153,153,153));
        playpnl.setBackground(new Color(51,51,51));
        resetpnl.setBackground(new Color(51,51,51));
        homepnl.setBackground(new Color(51,51,51));
        lblplay.setBackground(new Color(51,51,51));
        lblreset.setBackground(new Color(51,51,51));
        lblhome.setBackground(new Color(51,51,51));
        
        int confirm = JOptionPane.showConfirmDialog(null, "Exit Game?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION);
        if(confirm == 0)
        {
            System.exit(0);
        }
        else 
        {
            homepnl.setBackground(Color.white);
            lblhome.setBackground(new Color(153,153,153));
            lblexit.setBackground(new Color(51,51,51));
            exitpnl.setBackground(new Color(51,51,51));
            
            gamepnl.removeAll();
            gamepnl.add(play);
            gamepnl.repaint();
            gamepnl.revalidate();
        }
    }//GEN-LAST:event_lblexitMouseClicked

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        // TODO add your handling code here:
        lbl1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl1.setForeground(Color.BLUE);
        }
        else 
        {
            lbl1.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();  
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        // TODO add your handling code here:
        
        lbl2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl2.setForeground(Color.BLUE);
        }
        else 
        {
            lbl2.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        // TODO add your handling code here:
        
        lbl3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl3.setForeground(Color.BLUE);
        }
        else 
        {
            lbl3.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        // TODO add your handling code here:
        
        lbl4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl4.setForeground(Color.BLUE);
        }
        else 
        {
            lbl4.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        // TODO add your handling code here:
        
        lbl5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl5.setForeground(Color.BLUE);
        }
        else 
        {
            lbl5.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        // TODO add your handling code here:
        
        lbl6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl6.setForeground(Color.BLUE);
        }
        else 
        {
            lbl6.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        // TODO add your handling code here:
        
        lbl7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl7.setForeground(Color.BLUE);
        }
        else 
        {
            lbl7.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        // TODO add your handling code here:
        
        lbl8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl8.setForeground(Color.BLUE);
        }
        else 
        {
            lbl8.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        // TODO add your handling code here:
        
        lbl9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            lbl9.setForeground(Color.BLUE);
        }
        else 
        {
            lbl9.setForeground(Color.MAGENTA);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_lbl9MouseClicked

    private void reset()
    {
        lbl1.setText(null);
        lbl2.setText(null);
        lbl3.setText(null);
        lbl4.setText(null);
        lbl5.setText(null);
        lbl6.setText(null);
        lbl7.setText(null);
        lbl8.setText(null);
        lbl9.setText(null);
        
        lbl1.setBackground(new Color(240,240,240));
        lbl2.setBackground(new Color(240,240,240));
        lbl3.setBackground(new Color(240,240,240));
        lbl4.setBackground(new Color(240,240,240));
        lbl5.setBackground(new Color(240,240,240));
        lbl6.setBackground(new Color(240,240,240));
        lbl7.setBackground(new Color(240,240,240));
        lbl8.setBackground(new Color(240,240,240));
        lbl9.setBackground(new Color(240,240,240));
    }
    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_resetMouseClicked

    private void lblhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseEntered
        // TODO add your handling code here:
        lblhome.setFont(new java.awt.Font("OCR A Extended", 0, 22));
    }//GEN-LAST:event_lblhomeMouseEntered

    private void lblhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseExited
        // TODO add your handling code here:
        lblhome.setFont(new java.awt.Font("OCR A Extended", 0, 18));
    }//GEN-LAST:event_lblhomeMouseExited

    private void lblplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseEntered
        // TODO add your handling code here:
        lblplay.setFont(new java.awt.Font("OCR A Extended", 0, 22));
    }//GEN-LAST:event_lblplayMouseEntered

    private void lblplayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseExited
        // TODO add your handling code here:
        lblplay.setFont(new java.awt.Font("OCR A Extended", 0, 18));
    }//GEN-LAST:event_lblplayMouseExited

    private void lblresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresetMouseEntered
        // TODO add your handling code here:
        lblreset.setFont(new java.awt.Font("OCR A Extended", 0, 22));
    }//GEN-LAST:event_lblresetMouseEntered

    private void lblresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresetMouseExited
        // TODO add your handling code here:
        lblreset.setFont(new java.awt.Font("OCR A Extended", 0, 18));
    }//GEN-LAST:event_lblresetMouseExited

    private void lblexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseEntered
        // TODO add your handling code here:
        lblexit.setFont(new java.awt.Font("OCR A Extended", 0, 22));
    }//GEN-LAST:event_lblexitMouseEntered

    private void lblexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseExited
        // TODO add your handling code here:
        lblexit.setFont(new java.awt.Font("OCR A Extended", 0, 18));
    }//GEN-LAST:event_lblexitMouseExited

    private void resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMousePressed
        // TODO add your handling code here:
        
        reset.setBackground(new Color(224,235,235));
        reset.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_resetMousePressed

    private void resetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseReleased
        // TODO add your handling code here:
        reset.setBackground(new Color(102,102,102));
        reset.setForeground(new Color(224,235,235));
    }//GEN-LAST:event_resetMouseReleased

    private void baseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseMousePressed
        // TODO add your handling code here:
        
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_baseMousePressed

    private void baseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseMouseDragged
        // TODO add your handling code here:
        
        this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_baseMouseDragged

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_R)
        {
            reset();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Game().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JPanel exitpnl;
    private javax.swing.JPanel gamepnl;
    private javax.swing.JPanel homepnl;
    private javax.swing.JPanel howToPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblo;
    private javax.swing.JLabel lblplay;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel lblx;
    private javax.swing.JPanel play;
    private javax.swing.JPanel playpnl;
    private javax.swing.JLabel reset;
    private javax.swing.JPanel resetpnl;
    private javax.swing.JPanel score;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
