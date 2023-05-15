package TextAdventure3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.Font;


public class TextUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel screen;
	private JTextField InputBar;

	/**
	 * Create the frame.
	 */
	public TextUI()
	{
		JTextField AreaC = new JTextField("0");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 520);
		setLocationRelativeTo(null);
		screen = new JPanel();
		screen.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(screen);
		SpringLayout sl_screen = new SpringLayout();
		screen.setLayout(sl_screen);

		JTextArea DiaBox = new JTextArea(20, 40);
		DiaBox.setFont(new Font("Power Red and Blue Intl", Font.PLAIN, 12));
		DiaBox.setEditable(false);
		

		JScrollPane scrollPane = new JScrollPane(DiaBox);
		sl_screen.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, screen);
		sl_screen.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, screen);
		sl_screen.putConstraint(SpringLayout.SOUTH, scrollPane, -75, SpringLayout.SOUTH, screen);
		sl_screen.putConstraint(SpringLayout.EAST, scrollPane, -100, SpringLayout.EAST, screen);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		screen.add(scrollPane);

		JTextArea NoteBox = new JTextArea();
		NoteBox.setText("Notes:\r\n");
		sl_screen.putConstraint(SpringLayout.NORTH, NoteBox, 0, SpringLayout.NORTH, scrollPane);
		sl_screen.putConstraint(SpringLayout.WEST, NoteBox, 10, SpringLayout.EAST, scrollPane);
		sl_screen.putConstraint(SpringLayout.SOUTH, NoteBox, 0, SpringLayout.SOUTH, scrollPane);
		sl_screen.putConstraint(SpringLayout.EAST, NoteBox, 0, SpringLayout.EAST, screen);
		NoteBox.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 18));
		NoteBox.setEditable(false);
		screen.add(NoteBox);

		InputBar = new JTextField();
		InputBar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				TakeInput(InputBar, DiaBox, AreaC, NoteBox);
			}
		});
		InputBar.setFont(new Font("Power Red and Blue Intl", Font.PLAIN, 18));
		sl_screen.putConstraint(SpringLayout.NORTH, InputBar, 5, SpringLayout.SOUTH, scrollPane);
		sl_screen.putConstraint(SpringLayout.WEST, InputBar, 0, SpringLayout.WEST, scrollPane);
		sl_screen.putConstraint(SpringLayout.SOUTH, InputBar, -5, SpringLayout.SOUTH, screen);
		sl_screen.putConstraint(SpringLayout.EAST, InputBar, 0, SpringLayout.EAST, scrollPane);
		screen.add(InputBar);
		InputBar.setColumns(10);

		JButton Undo = new JButton("BACK");
		sl_screen.putConstraint(SpringLayout.NORTH, Undo, 5, SpringLayout.SOUTH, NoteBox);
		sl_screen.putConstraint(SpringLayout.WEST, Undo, 10, SpringLayout.EAST, InputBar);
		sl_screen.putConstraint(SpringLayout.SOUTH, Undo, -5, SpringLayout.SOUTH, screen);
		sl_screen.putConstraint(SpringLayout.EAST, Undo, 0, SpringLayout.EAST, screen);
		Undo.setFont(new Font("Power Red and Blue Intl", Font.BOLD, 18));
		Undo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Back(DiaBox, AreaC);
			}
		});
		screen.add(Undo);
		Output.Open(0,DiaBox);
	}

	private void TakeInput(JTextField a, JTextArea b, JTextField  j, JTextArea l)
	{
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				b.append("  @  " + a.getText() + "\n");
				String d = a.getText();
				a.setText("");
				int c=GetArea(j);
				Say(Output.Out(c, d,l), b);
				int x=Output.MayUp(c, d, b, l);
				UpArea(j,x);
			}
		});
		thread.start();
	}

	private void Back(JTextArea b,JTextField  j)
	{
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				int c=GetArea(j);
				if (c > 0)
				{
					UpArea(j,-1);
					Say("You trace your steps back to "+Output.Place(c-1), b);
				} else
				{
					Say("There isn't much to back track to, you started here", b);
				}
			}
		});
		thread.start();
	}

	private void Say(String a, JTextArea b)
	{
		b.append("#  " + a + "\n");
	}

	private void UpArea(JTextField j,int k)
	{
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				String x= j.getText();
				int y=Integer.parseInt(x)+k;
				j.setText(""+y);
			}
		});
		thread.start();
	}
	private int GetArea(JTextField j)
	{
		String x= j.getText();
		return Integer.parseInt(x);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TextUI frame = new TextUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
