def call(jobname,buildrange){
sh "curl -O http://18.219.210.127:8080/jnlpJars/jenkins-cli.jar"
sh "java -jar jenkins-cli.jar -s http://18.219.210.127:8080 -auth admin:119767fb81f22e2f10d8594e4201717e53 delete-builds '${jobname}' ''${buildrange}''"
}