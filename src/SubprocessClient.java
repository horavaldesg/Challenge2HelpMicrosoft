import git.tools.client.GitSubprocessClient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SubprocessClient{
	public static String path;
    public static String userName;
    public static String remote;
    public static String commitMessage;
    public static GitSubprocessClient gitSubprocessClient;
    public void CreateRepo(String repoPath){
    	gitSubprocessClient  = new GitSubprocessClient(repoPath);
    	String gitInit = gitSubprocessClient.gitInit();
    	
    	File remoteFile = new File(repoPath);
    	String remoteName = remoteFile.getName();
    	System.out.println(remoteName);
    	
    	remote = "https://github.com/" + userName + "/" + remoteName;
    	String gitRemoteAdd = gitSubprocessClient.gitRemoteAdd("origin", remote);
    	System.out.println("Remote: " +gitRemoteAdd);
        System.out.println(("File Chosen: " + repoPath));
        
        String folder = repoPath; 
        String gitignore = ".gitignore";
        String ReadMe = "README.md";
        Path folderPath = Paths.get(folder);
        Path gitignorePath = folderPath.resolve(gitignore);
        Path ReadMePath = folderPath.resolve(ReadMe);

        List<String> lines = new ArrayList<>();
        lines.add("# folders to be ignored");
        lines.add("**/logs");
        lines.add("**/classpath");
        lines.add(".project");
        lines.add("*.class");
        lines.add("bin/");
        lines.add(".settings/");
        lines.add(".idea/");
        lines.add(".DS_Store");
        lines.add(".vscode/extensions.json");
        lines.add("/.metadata/");
        List<String> readMeText = new ArrayList<>();
        readMeText.add(repoPath);
        try {

        	Files.write(gitignorePath, lines);
            Files.write(ReadMePath, readMeText);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(gitSubprocessClient.gitStatus());
        }
        
    
    public void GitCommit(){
    	
        String addAll = gitSubprocessClient.gitAddAll();
        
        System.out.println(addAll);
        String commit = gitSubprocessClient.gitCommit(commitMessage);
        System.out.println(commit);
        
    }

    public void GitPush(){
    	
        String push = gitSubprocessClient.gitPush("master");
        System.out.println(push);
    }
    
    public void GitStatus() {
    	String status = this.gitSubprocessClient.gitStatus();
    	ControlPanel statusField = new ControlPanel();
    	statusField.SetStatus(status);
//    	System.out.println(remote);    
    	}
    
    public void GitFetch() {
    	String fetch = gitSubprocessClient.gitFetchAll();
    	System.out.println(fetch);
    }
    public void setPath(String path) {
    	this.path = path;
    }
    public String getPath() {
    	return this.path;
    }
    public void GetBranchName() {
    	String branchName = gitSubprocessClient.getCurrentBranchName();
    	ControlPanel branch = new ControlPanel();
    	branch.SetBranchName(branchName);
    }
    public void SetMessage(String message) {
    	commitMessage = message;
    }
    
    public void SetUserName(String _usrName) {
    	userName = _usrName;
    	System.out.println("User Name: " + userName);
    	
    	
    }
}