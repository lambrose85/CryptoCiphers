import java.io.*;
import 
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
public class MorseCode {
	private String plainText;
	private String cipherText;
	public static void main(String[] args) throws Exception{
	 
		//select a file
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int returnValue = jfc.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			//returns absolute path of selected file
			File SelectedFile = jfc.getSelectedFile();
			System.out.println(SelectedFile.getAbsolutePath());
		}
	
	}

}
