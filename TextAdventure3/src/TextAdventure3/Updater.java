package TextAdventure3;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;


public class Updater extends OutputStream
{
	private JTextArea DiaBox;
	
	public Updater(JTextArea DiaBox)
	{
		this.DiaBox=DiaBox;
	}
	@Override
	public void write(int b) throws IOException
	{
		DiaBox.append(String.valueOf((char) b));
	}
}
/**
 * Adapted from:
 * https://www.codejava.net/java-se/swing/redirect-standard-output-streams-to-jtextarea
 */
