package Chess_Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chess_Local_Game_Display  extends JFrame {

    ImageIcon chess_board = new ImageIcon(Chess_Local_Game_Display.class.getResource("../img/chess_board.jpg"));
    ImageIcon king = new ImageIcon(Chess_Local_Game_Display.class.getResource("../img/chess_king.jpg"));
    public Chess_Local_Game_Display() {
        // 윈도우의 크기와 위치 설정
        build_gui();
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void build_gui(){

        board_panel back_panel = new board_panel();
        back_panel.setLayout(null);

        JLabel sample = new JLabel(king);
        sample.setBounds(304,40,80,80);
        back_panel.add(sample);

        this.add(back_panel);

        back_panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                setTitle("마우스 좌표 : " + e.getX() + " , " + e.getY());
            }
        });
    }

    private class board_panel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(chess_board.getImage(),0,0,getWidth(),getHeight(),this);
        }
    }
}
