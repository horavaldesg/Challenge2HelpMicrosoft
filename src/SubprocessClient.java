import git.tools.client.GitSubprocessClient;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;   

public class SubprocessClient{
	public static String path;
    public static String userName;
    public static String remote;
    public static String commitMessage;
    public static GitSubprocessClient gitSubprocessClient;
    public void CreateRepo(String repoPath){
    	gitSubprocessClient  = new GitSubprocessClient(repoPath);
    	String gitInit = gitSubprocessClient.gitInit();
    	userName = "";
    	remote = "https://github.com/" + userName + "/" + repoPath + ".git";
       
        
    	String gitRemoteAdd = gitSubprocessClient.gitRemoteAdd("origin", remote);

        System.out.println(("File Chosen: " + repoPath));
        boolean dirFlag = false;
        
        File gitIgnore = new File(repoPath, ".gitIgnore");
        
        try {
           dirFlag = gitIgnore.mkdir();
           FileWriter gitWriter = new FileWriter(".gitIgnore");
           gitWriter.write(".project\n"
           		+ ".classpath\n"
           		+ "*.class\n"
           		+ "bin/\n"
           		+ ".settings/\n"
           		+ ".idea/\n"
           		+ "*.iml\n"
           		+ ".DS_Store\n"
           		+ "out/\n"
           		+ ".vscode/extensions.json\n"
           		+ "/.metadata/\n"
           		+ "");
           gitWriter.close();
            if (gitIgnore.createNewFile()) {
              System.out.println("File created: " + gitIgnore.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
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
}