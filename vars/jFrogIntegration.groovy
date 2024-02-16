def call(){
    sh 'curl -X PUT -u admin:Harry@6123 -T /var/lib/jenkins/workspace/Java_app_3.0/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://18.205.27.195:8082/artifactory/example-repo-local-bash/'
}