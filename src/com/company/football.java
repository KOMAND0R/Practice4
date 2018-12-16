package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class football extends JFrame
{
    private int winWidth = 600, winHeight = 300;
    private int winXPos = 100, winYPos = 100;
    private String LastS = "N/A", winner = "Ничья";
    private int acmscore = 0, rmscore = 0;
    JButton ACM = new JButton("AC Milan");
    JButton RM = new JButton("Real Madrid");
    JLabel score = new JLabel("Счёт: " + acmscore + " X " + rmscore);
    JLabel LastScore = new JLabel("Последний гол: " + LastS);
    Label win = new Label("Победитель: " + winner);
    Font font = new Font("Times New Roman", 0, 14);

    public football()
    {
        super("FootballManager");
        setLayout(null);
        this.setBounds(winXPos, winYPos, winWidth, winHeight);

        ACM.setBounds(15, 10, 100, 30);
        add(ACM);

        RM.setBounds(winWidth - 150, 10, 120, 30);
        add(RM);

        score.setBounds((winWidth - winXPos) / 2 - 10, 10, 100, 30);
        score.setFont(font);
        add(score);

        LastScore.setBounds( (winWidth - winXPos) / 2 - 35, 50, 200, 30);
        LastScore.setFont(font);
        add(LastScore);

        win.setBounds((winWidth - winXPos) / 2 - 30, 110, 180, 30);
        win.setFont(font);
        add(win);

        ACM.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                acmscore = acmscore + 1;
                score.setText("Счёт: " + acmscore + " X " + rmscore);
                LastS = "AC Milan";
                LastScore.setText("Последний гол: " + LastS);
                if (acmscore > rmscore)
                {
                    winner = "AC Milan";
                    win.setText("Победитель: " + winner);
                }
                else if (acmscore == rmscore)
                {
                    winner = "Ничья";
                    win.setText("Победитель: " + winner);
                }
            }
        });
        RM.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                rmscore = rmscore + 1;
                score.setText("Счёт: " + acmscore + " х " + rmscore);
                LastS = "Real Madrid";
                LastScore.setText("Последний гол: " + LastS);
                if (acmscore < rmscore)
                {
                    winner = "Real Madrid";
                    win.setText("Победитель: " + winner);
                }
                else if (acmscore == rmscore)
                {
                    winner = "Ничья";
                    win.setText("Победитель: " + winner);
                }
            }
        });

        setVisible(true);
    }
}
