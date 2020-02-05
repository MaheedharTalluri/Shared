def call(){

sh "curl -X POST http://admin:119767fb81f22e2f10d8594e4201717e53@18.219.210.127:8080/credentials/store/system/domain/_/createCredentials \
-H "Expect:" \
-H 'Content-Type: application/json; charset=utf-8' \
--data-binary @- << EOF \
{ \
  \"\": \"0\", \
  \"credentials\": { \
    \"scope\": \"GLOBAL\", \
    \"id\": \"apicredentias\", \
    \"username\": \"apicredentials\", \
    \"password\": \"pass\", \
    \"description\": \"apicredentials\", \
    \"stapler-class\": \"com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl\" \
  } \
} \
EOF "
}