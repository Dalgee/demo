node {
    stage('build') {
        sh "echo 'building...' >> /root/jenkins.out"
    }

    stage('deploy') {
        sh "echo 'deploying...' >> /root/jenkins.out"
        sh "echo ${BUILD_URL} >> /root/jenkins.out"
        sh "echo ${JOB_URL} >> /root/jenkins.out"
        sh "echo ${JENKINS_HOME} >> /root/jenkins.out"
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
                withSonarQubeEnv('idbank01') {
                    sh "cd demo; gradle sonarqube;"
                }

    }
}