package ru.mirea.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Match extends JFrame {

    JButton realM = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");

    JLabel score = new JLabel();
    JLabel winTeam = new JLabel();
    JLabel lastGoal = new JLabel("Last Scorer: N/A");

    int milGoal = 0, madrGoal = 0;

    public Match() {
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3, 1));
        add(realM);
        setSize(500,500);

        updateScore();
        updateWinTeam();

        milan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milGoal;
                updateWinTeam();
                updateScore();
                updateLastGoal("AC Milan");
            }
        });

        realM.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrGoal++;
                updateWinTeam();
                updateScore();
                updateLastGoal("Real Madrid");
            }
        });

        Font fnt = new Font("Times new roman",Font.BOLD,50);
        Font fnt22 = new Font("Times new roman",Font.BOLD,22);
        add(winTeam);
        winTeam.setVerticalAlignment(JLabel.CENTER);
        winTeam.setHorizontalAlignment(JLabel.CENTER);
        winTeam.setFont(fnt22);
        add(milan);
        add(score);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        score.setFont(fnt);
        add(lastGoal);
        lastGoal.setVerticalAlignment(JLabel.CENTER);
        lastGoal.setHorizontalAlignment(JLabel.CENTER);
        lastGoal.setFont(fnt22);
    }

    public void updateWinTeam() {
        if (milGoal > madrGoal)
            winTeam.setText("Winner: AC Milan");
        else if (milGoal < madrGoal)
            winTeam.setText("Winner: Real Madrid");
        else
            winTeam.setText("Winner: DRAW");
    }

    public void updateLastGoal(String Team) {
        lastGoal.setText("Last Scorer: " + Team);
    }

    public void updateScore() {
        score.setText( madrGoal + " X " + milGoal);
    }

    public static void main(String[] args) {
        new Match().setVisible(true);
    }
}
