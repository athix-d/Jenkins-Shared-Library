def call(String BackendIP){
  sh "ssh-keyscan -H "${BackendIP}" >> ~/.ssh/known_hosts"
} 
