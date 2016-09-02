import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Color;

public class ClockFinalWithGUI {
	/**
	 * @wbp.parser.entryPoint
	 */
	private static final JFrame frame = new JFrame("Clock");
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(ChronoField.CLOCK_HOUR_OF_AMPM);
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		int day = now.get(ChronoField.DAY_OF_MONTH);
		int year = now.get(ChronoField.YEAR);
		String am = "";
		int amTest = now.get(ChronoField.AMPM_OF_DAY);
		String minute2 = "";
		JLabel label1 = new JLabel();
		label1.setText("Time");
		if (amTest == 0) am ="AM";
		else am ="PM";
		if (minute < 10) {
			minute2 = "0";
			label1.setText("It's " + hour + ":" + minute2 + minute + " " + am + " on "+ month + "/" + day +"/"
					+ year +".");
		}
		else {
			label1.setText("It's " + hour + ":" +  minute + " " + am + " on "+ month + "/" + day +"/"
					+ year +".");
		}

		label1.setBackground(Color.WHITE);
		label1.setForeground(new Color(0, 191, 255));
		label1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 13));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label1);
		frame.setBackground(Color.WHITE);
		frame.setForeground(new Color(0, 0, 0));
		frame.setVisible(true);
		frame.setSize(250,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
