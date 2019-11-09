node {
    sh 'gradlew build'
    stage('build') {
    }
    stage('deploy') {
        sh 'gradlew build'
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
//                 def scannerHome = tool 'id-bank'
        withSonarQubeEnv('idbank01') {
            sh 'gradle sonarqube'
        }

    }
}