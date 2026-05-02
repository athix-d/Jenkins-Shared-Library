def call(String repoUrl, String branch) {
    echo "Clonning the code"
    git url: "${repoUrl}", branch: "${branch}"
    echo "Code Cloned successfully"
}
