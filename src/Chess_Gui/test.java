package Chess_Gui;

import javax.swing.*;

public class test  extends JFrame {
    ImageIcon king = new ImageIcon(Chess_Local_Game_Display.class.getResource("../img/chess_king.png"));
    public test() {
        // 윈도우의 크기와 위치 설정
        build_gui();
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void build_gui(){

        this.setLayout(null);
        JLabel sample = new JLabel(king);
        sample.setBounds(200,200,300,200);
        this.add(sample);
    }
}
