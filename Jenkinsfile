pipeline {
    agent any

    tools {
        maven 'Maven' // Asegúrate de que este nombre esté definido en "Global Tool Configuration"
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Jacoco Report') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
