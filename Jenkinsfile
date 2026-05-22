pipeline {
    agent any

    tools {
        maven 'maven3.8.4'
        jdk 'jdk21'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/yourname/java-maven-demo.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo " Build Successful"
        }
        failure {
            echo " Build Failed"
        }
    }
}

