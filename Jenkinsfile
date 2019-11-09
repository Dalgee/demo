node {
    stage('build') {
    }
    tools {
        gradle '4.10'
    }

    stage('deploy') {
        sh './gradlew build'
        sh "echo ${BUILD_URL} >> /root/jenkins.out"
        sh "echo ${JOB_URL} >> /root/jenkins.out"
        sh "echo ${JENKINS_HOME} >> /root/jenkins.out"
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
                withSonarQubeEnv('idbank01') {
                    sh 'gradle sonarqube'
                }

    }
}