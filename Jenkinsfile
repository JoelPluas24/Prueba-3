pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Git operations') {
            steps {
                bat 'git config user.email "jenkins@example.com"'
                bat 'git config user.name "Jenkins CI"'

                bat 'git checkout main'
                bat 'git pull origin main' // ← actualiza main con lo remoto
                bat 'git merge origin/RamaPrueba' // ← fusiona la rama de prueba

                // Opción segura: hacer push normal (fallará si hay cambios remotos nuevos)
                bat 'git push origin main'

                // ⚠️ Opción alternativa si sabes que puedes sobrescribir: usar --force
                // bat 'git push origin main --force'
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
