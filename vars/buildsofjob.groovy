def call(){
sh "curl -XGET http://18.219.210.127:8080//job/paratest/api/json?tree=builds[number,status,timestamp,id,result] -u admin:119767fb81f22e2f10d8594e4201717e53"
}