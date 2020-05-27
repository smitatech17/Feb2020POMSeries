pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "deploy"'
      }
    }

    stage('QA Testing') {
      parallel {
        stage('QA Testing') {
          steps {
            sh 'echo "QA Testing"'
          }
        }

        stage('API Test on QA') {
          steps {
            sh 'echo "API test on QA"'
          }
        }

      }
    }

    stage('Deploy on Stage') {
      steps {
        sh 'echo "deploy on stage"'
      }
    }

    stage('Stage Testing') {
      steps {
        sh 'echo "stage testing"'
      }
    }

    stage('Deploy PROD') {
      parallel {
        stage('Deploy PROD') {
          steps {
            sh 'echo "deployment on PROD"'
          }
        }

        stage('BE Deployment') {
          steps {
            sh 'echo "BE deployment"'
          }
        }

        stage('ENV Config') {
          steps {
            sh 'echo "setup Env Config"'
          }
        }

      }
    }

    stage('Sanity Test on PROD') {
      steps {
        sh 'echo "sanity on PROD"'
      }
    }

  }
}