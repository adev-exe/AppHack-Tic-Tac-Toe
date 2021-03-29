package App_Hack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WidgetViewer {

	public static int defaultXsize = 750;
	public static int defaultYsize = 500;

	private JFrame jframe;
	private JPanel jpanel;

	private Lock lock;
	private Condition userWait;

	private JComponent userInputComponent = null;
	private ActionListener eventHandler;

	private int lastX = 50;
	private int lastY = 50;
	private int lastW = 300;
	private int lastH = 500;

	public WidgetViewer() {
		this(defaultXsize, defaultYsize);
	}

	public WidgetViewer(int pixelSizeInX, int pixelSizeInY) {
		lock = new ReentrantLock();
		userWait = lock.newCondition();

		eventHandler = e -> {
			if (e.getSource() != userInputComponent) {
				return;
			}
			lock.lock();
			userWait.signalAll();
			lock.unlock();
			JComponent jbx = (JComponent) e.getSource();
			jpanel.remove(jbx);
		};

		jframe = new JFrame();
		jframe.setTitle("Tic Tac Toe");
		jpanel = new JPanel();
		jpanel.setLayout(null);
		jframe.setContentPane(jpanel);
		jframe.getContentPane().setBackground(new Color(153, 255,204));
		jframe.setSize(pixelSizeInX, pixelSizeInY);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}
	
	public void remove(JComponent jcomp) {
		jpanel.remove(jcomp);
	}

	public void add(JComponent jcomp, int x, int y, int w, int h) {
		jcomp.setBounds(x, y, w, h);
		jpanel.add(jcomp);
		jframe.setContentPane(jpanel);
		lastX = x;
		lastY = y;
		lastW = w;
		lastH = h;
	}
	

	public void add(JComponent jcomp) {
		lastY += lastH;
		add(jcomp, lastX, lastY, lastW, lastH);
	}
}

