node {
    stage('build') {
    }

    stage('deploy') {
        sh "echo ${BRANCH} >> /root/build.out"
        sh "echo ${BRANCH_NAME} >> /root/build.out"
        sh 'gradlew build'
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
                withSonarQubeEnv('idbank01') {
                    sh 'gradle sonarqube'
                }

    }
}