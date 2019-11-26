/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelofarmslash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/**
 *
 * @author kire
 */
public class InterfaceFarm extends javax.swing.JFrame {
    protected Jogador jogador;
    protected int secondsPassed = 0;
    /**
     * Creates new form TelaFarmDuel
     */
    public InterfaceFarm(Jogador jogador) {
        this.jogador = jogador;
        initComponents();
        MonsterHpBar.setMaximum(200);
        MonsterHpBar.setValue(200);
        
        setVisible(true);
        attackSpaceBar();
        jogadorFarm();
    }
    
    public void attackSpaceBar() {
        
        addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE){
            MonsterHpBar.setValue(MonsterHpBar.getValue() - 5);
            }
        }
        });
    }
    
    
    public void jogadorFarm () {

    System.out.println("outside");
    
    Timer t = new Timer(1000, new ActionListener() {
    protected long time = 10 * 1000; //10 seconds, for example
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("inside");
        if (time >= 0) {
            long s = ((time / 1000) % 60);
   
            ContadorTempoText.setText("Tempo restante: " + s + " segundos");
            time -= 1000;
            
            if (s == 0) {
                
                dispose();
            }
            
            if (MonsterHpBar.getValue() <= 0) {
                jogador.setCreditos(5);
                dispose();
            }
        }
 
    }
    });
    t.start();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Monster = new javax.swing.JLabel();
        MonsterHpBar = new javax.swing.JProgressBar();
        MonsterName = new javax.swing.JLabel();
        PressSpaceText = new javax.swing.JLabel();
        ContadorTempoText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Monster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duelofarmslash/monster.gif"))); // NOI18N

        MonsterName.setText("Nidhogg");

        PressSpaceText.setText("Pressione espaço para matar o monstro!");

        ContadorTempoText.setText("ContagemDeTempo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(PressSpaceText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(ContadorTempoText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Monster)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MonsterName)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MonsterHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(MonsterName)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonsterHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(PressSpaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(ContadorTempoText)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(Monster, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel ContadorTempoText;
    protected javax.swing.JLabel Monster;
    protected javax.swing.JProgressBar MonsterHpBar;
    protected javax.swing.JLabel MonsterName;
    protected javax.swing.JLabel PressSpaceText;
    // End of variables declaration//GEN-END:variables
}
