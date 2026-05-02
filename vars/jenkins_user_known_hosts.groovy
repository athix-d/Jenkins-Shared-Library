def call(String BackendIP){
  sh """
  sudo su - jenkins
  sh "ssh-keyscan -H ${BackendIP} >> ~/.ssh/known_hosts"
  """
} 
