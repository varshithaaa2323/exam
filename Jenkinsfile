pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'javac Fact.java TestFact.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFact'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'set PATH=C:\\Program Files\\Java\\jdk-17\\bin;%PATH% && jar cfm factorial.jar manifest.txt Fact.class TestFact.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, successful!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}
