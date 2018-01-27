#!groovy

node('node') {

    currentBuild.result = "SUCCESS"

    try {

        stage('Checkout'){
            checkout scm
        }

        stage ('Build') {
            sh 'mvn clean install'
        }

    } catch (err) {

        currentBuild.result = "FAILURE"

        mail body: "${env.BUILD_URL}" ,
        from: 'psimonski@localhost',
        replyTo: 'psimonski@localhost',
        subject: 'Build failed',
        to: 'psimonski@localhost'

        throw err

    }

}