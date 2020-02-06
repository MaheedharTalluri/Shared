def call(){
echo 'jenkins.model.Jenkins.instance.securityRealm.createAccount("user1", "password123")' |
java -jar jenkins-cli.jar -s http://http://18.219.210.127:8080 groovy =
}