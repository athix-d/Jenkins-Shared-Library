def call(String repoUrl, String branch) {
    echo "Clonning the code"
    git url: repoUrl, branch: branchName
    echo "Code Cloned successfully"
}
