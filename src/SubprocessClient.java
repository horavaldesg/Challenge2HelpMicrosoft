import git.tools.client.GitSubprocessClient;


public class SubprocessClient{
    GitSubprocessClient gitSubprocessClient;
    public void CreateRepo(String repoPath){
        System.out.println(("File Chosen: " + repoPath));

        gitSubprocessClient = new GitSubprocessClient(repoPath);
    }
    public void GitCommit(String commitMessage){
        String addAll = gitSubprocessClient.gitAddAll();
        String commit = gitSubprocessClient.gitCommit(commitMessage);

    }

    public void GitPush(){
        String push = gitSubprocessClient.gitPush("master");
    }
}