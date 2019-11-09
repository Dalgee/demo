node {
    stage('build') {
    }
    stage('deploy') {
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
        withSonarQubeEnv('idbank01') {
            sh '/root/.jenkins/workspace/demo/gradlew sonarqube'
        }

    }
}