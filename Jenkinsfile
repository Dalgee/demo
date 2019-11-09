node {
    stage('build') {
        sh "echo 'building...' >> /root/jenkins.out"
    }

    stage('deploy') {
        sh "echo 'deploying...' >> /root/jenkins.out"
        sh "pwd >> /root/jenkins.out"
        sh "ls >> /root/jenkins.out"
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
                withSonarQubeEnv('idbank01') {
                    sh ./gradlew sonarqube
                }

    }
}