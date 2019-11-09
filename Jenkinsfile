node {
    stage('build') {
        sh "echo 'building...' >> /root/jenkins.out"
    }

    stage('deploy') {

        sh "echo 'deploying...' >> /root/jenkins.out"
//         slackSend color: '#BADA55', message: 'Hello, World!', channel: '#jenkins-slack-test'
                def scannerHome = tool 'idbank'
                withSonarQubeEnv('idbank01') {
                    def sonar_cli = """
                    ${scannerHome}/bin/sonar-scanner
                    -Dsonar.projectKey=ksy_sample01
//                     -Dsonar.projectName=clover
//                     -Dsonar.sources='src/main/java, src/main/resources/static/js'
//                     -Dsonar.java.libraries=target/*.jar
//                     -Dsonar.java.binaries=target/classes
//                     -Dsonar.junit.reportsPath=target/surefire-reports
//                     -Dsonar.cobertura.reportPath=target/site/cobertura/coverage.xml
//                     -Dsonar.dynamicAnalysis=reuseReports
//                     -Dsonar.java.coveragePlugin=plugin
                    """
                    sh sonar_cli.replaceAll('\n', ' ')
                }
    }
}