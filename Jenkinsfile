node {
    stage('build') {
        sh "echo 'building...' >> /root/jenkins.out"
    }

    stage('deploy') {

        sh "echo 'deploying...' >> /root/jenkins.out"
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
                def scannerHome = tool 'id-bank'
                withSonarQubeEnv('idbank01') {
                    def sonar_cli = """
                    ${scannerHome}/bin/sonar-scanner
                    -Dsonar.projectKey=ksy_sample01
                    -Dsonar.sources='src/main/java'
                    """
                    sh sonar_cli.replaceAll('\n', ' ')
                }
    }
}