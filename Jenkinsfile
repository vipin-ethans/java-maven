pipeline {
    agent any

   

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/vipin-ethnas/java-maven-demo.git'
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

