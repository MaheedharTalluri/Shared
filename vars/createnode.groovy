def call(){

sh "curl -L -s -o /dev/null -w http://18.219.210.127:8080 -u admin:119767fb81f22e2f10d8594e4201717e53 -H 'Content-Type:application/x-www-form-urlencoded' -X POST -d 'json={"":["hudson.plugins.sshslaves.SSHLauncher","hudson.slaves.RetentionStrategy$Always"],"launcher":{"":"2","$class":"hudson.plugins.sshslaves.SSHLauncher","credentialsId":"d436fff1-af1c-45df-8cb6-3907d119b8fa","host":"host","javaPath":"","jvmOptions":"","launchTimeoutSeconds":"","maxNumRetries":"","port":"22","prefixStartSlaveCmd":"","suffixStartSlaveCmd":"","retryWaitTime":"","sshHostKeyVerificationStrategy":{"$class":"hudson.plugins.sshslaves.verifiers.ManuallyTrustedKeyVerificationStrategy","requireInitialManualTrust":true,"stapler-class":"hudson.plugins.sshslaves.verifiers.ManuallyTrustedKeyVerificationStrategy"},"stapler-class":"hudson.plugins.sshslaves.SSHLauncher"},"retentionStrategy":{"$class":"hudson.slaves.RetentionStrategy$Always","stapler-class":"hudson.slaves.RetentionStrategy$Always"},"type":"hudson.slaves.DumbSlave","mode":"NORMAL","name":"node","numExecutors":"1","remoteFS":"\/home\/jenkins","nodeDescription":"Agent node description","labelString":"agent-node-label","nodeProperties":{"stapler-class-bag":"true"}}' http://18.219.210.127:8080/computer/doCreateItem?name=node&type=hudson.slaves.DumbSlave"

}