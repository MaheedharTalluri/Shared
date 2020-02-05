def call(jobname,buildrange){
sh "curl -XGET http://18.219.210.127:8080/jnlpJars/jenkins-cli.jar"
sh "java -jar jenkins-cli.jar -s http://18.219.210.127:8080 delete-builds '${jobname}' ''${buildrange}'' --username admin --password:119767fb81f22e2f10d8594e4201717e53"
}