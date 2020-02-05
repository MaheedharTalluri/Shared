def call(){

sh "curl -X POST http://admin:119767fb81f22e2f10d8594e4201717e53@18.219.210.127:8080/credentials/store/system/domain/_/createCredentials \
-H "Expect:" \
-H 'Content-Type: application/json; charset=utf-8' \
--data-urlencode 'json={
  "": "0",
  "credentials": {
    "scope": "GLOBAL",
    "id": "credential_id_here",
    "username": "username_here",
    "password": "password_here",
    "description": "My new credentials",
    "$class": "com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl"
  }
}' "
}