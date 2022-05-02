import git.tools.client.GitSubprocessClient;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;   

public class SubprocessClient{
    GitSubprocessClient gitSubprocessClient;
    public void CreateRepo(String repoPath){
        System.out.println(("File Chosen: " + repoPath));
        boolean dirFlag = false;
        gitSubprocessClient = new GitSubprocessClient(repoPath);
        File gitIgnore = new File(repoPath, ".gitIgnore");
        
        try {
           dirFlag = gitIgnore.mkdir();
           FileWriter gitWriter = new FileWriter("gitIgnore");
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
        
        }
        
    
    public void GitCommit(String commitMessage){
        String addAll = gitSubprocessClient.gitAddAll();
        String commit = gitSubprocessClient.gitCommit(commitMessage);

    }

    public void GitPush(){
        String push = gitSubprocessClient.gitPush("master");
    }
}