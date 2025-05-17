pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Git operations') {
            steps {
                bat 'git branch'
                bat 'git checkout main'
                bat 'git merge origin/RamaPrueba'
            }
        }

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
