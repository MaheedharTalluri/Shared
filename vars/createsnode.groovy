def call(){
httpRequest authentication: 'jenkins_auth', 
	customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], 
                    [maskValue: false, name: 'Accept', value: 'application/json']],
    
    httpMode: 'POST', requestBody: 
  """{"":["hudson.plugins.sshslaves.SSHLauncher","hudson.slaves.RetentionStrategy$Always"],"launcher":{"":"2","credentialsId":"d436fff1-af1c-45df-8cb6-3907d119b8fa","host":"host","javaPath":"","jvmOptions":"","launchTimeoutSeconds":"","maxNumRetries":"","port":"22","prefixStartSlaveCmd":"","suffixStartSlaveCmd":"","retryWaitTime":"","sshHostKeyVerificationStrategy":{"$class":"hudson.plugins.sshslaves.verifiers.ManuallyTrustedKeyVerificationStrategy","requireInitialManualTrust":true,"stapler-class":"hudson.plugins.sshslaves.verifiers.ManuallyTrustedKeyVerificationStrategy"},"stapler-class":"hudson.plugins.sshslaves.SSHLauncher"},"retentionStrategy":{"$class":"hudson.slaves.RetentionStrategy$Always","stapler-class":"hudson.slaves.RetentionStrategy$Always"},"type":"hudson.slaves.DumbSlave","mode":"NORMAL","name":"node","numExecutors":"1","remoteFS":"\/home\/jenkins","nodeDescription":"Agent node description","labelString":"agent-node-label","nodeProperties":{"stapler-class-bag":"true"}}"""
  ,responseHandle: 'NONE', url: "http://18.219.210.127:8080/computer/doCreateItem?name=node&type=hudson.slaves.DumbSlave"
}