package Chess_Gui;
import javax.swing.JFrame;
public class Chess_Start_Display {
    public Chess_Start_Display() {
        JFrame frame = new JFrame("chess_start"); // "내 윈도우"라는 제목의 JFrame 객체 생성
        frame.setSize(400, 300); // 윈도우 크기를 400x300 픽셀로 설정
        frame.setLocationRelativeTo(null); // 윈도우를 화면 중앙에 배치
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 사용자가 "X" 버튼을 클릭하면 윈도우를 닫음
        frame.setVisible(true); // 윈도우를 화면에 표시
    }

}
