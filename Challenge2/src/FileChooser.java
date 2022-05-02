

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser 
{
	
	public FileChooser()
	{
		SubprocessClient subprocessClient;
		subprocessClient = new SubprocessClient();
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Choose a place to save");
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		
		int returnValue = jfc.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION)
		{
			if(jfc.getSelectedFile().isDirectory())
			{
				System.out.println("You selected: " + jfc.getSelectedFile());
			}
			
			File selectedFile = jfc.getSelectedFile();
			String repoPath = selectedFile.getAbsolutePath().toString();
			subprocessClient.CreateRepo(repoPath);
			System.out.println(selectedFile.getAbsolutePath());
		}
	}

}
