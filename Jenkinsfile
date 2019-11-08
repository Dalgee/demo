node {
    stage('build') {
        sh "echo 'building...' >> /root/jenkins.out"
    }

    stage('deploy') {
        sh "echo 'deploying...' >> /root/jenkins.out"
        slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
    }
}