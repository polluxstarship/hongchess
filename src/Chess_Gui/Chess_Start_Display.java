package Chess_Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Chess_Start_Display extends JFrame {
    ImageIcon Im = new ImageIcon(Chess_Start_Display.class.getResource("../img/background_start.jpg")); // 이미지 파일 경로

    public Chess_Start_Display() {
        // 윈도우의 크기와 위치 설정

        List<JButton> bb = build_gui();
        handler_adding(bb);

        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void handler_adding(List<JButton> buttons) {
        buttons.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Chess_Local_Game_Display();
            }
        });
        buttons.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new test();
            }
        });
        buttons.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    private List<JButton> build_gui(){

        Background_panel back_panel = new Background_panel();
        Font font = new Font("SanSerif", Font.BOLD, 16);

        back_panel.setLayout(null);
        this.add(back_panel);

        JButton solo_play_button = new JButton("혼자하기");
        JButton multi_play_button = new JButton("같이하기");
        JButton option_button = new JButton("옵   션");
        JButton exit_button = new JButton("종   료");

        List<JButton> buttonlist = new ArrayList<JButton>();
        buttonlist.add(solo_play_button);
        buttonlist.add(multi_play_button);
        buttonlist.add(option_button);
        buttonlist.add(exit_button);


        Iterator<JButton> it = buttonlist.iterator();
        int buttonlocationkey = 450;
        while (it.hasNext()){
            JButton thisbutton = it.next();
            thisbutton.setBounds(200, buttonlocationkey = buttonlocationkey + 45, 80, 35);
            thisbutton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            thisbutton.setFont(font);
            back_panel.add(thisbutton);
        }
        return buttonlist;
    }
    private class Background_panel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(Im.getImage(),0,0,getWidth(),getHeight(),this);
        }
    }
}