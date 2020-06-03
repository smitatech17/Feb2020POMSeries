pipeline {
  agent any
  stages {
    stage('Test on Dev') {
      parallel {
        stage('Test on Dev') {
          steps {
            sh 'mvn clean install -DskipTests="true"'
          }
        }

        stage('chrome') {
          steps {
            sh 'mvn test -Denv="dev" -Dbrowser="chrome"'
          }
        }

      }
    }

    stage('Test on QA') {
      parallel {
        stage('Test on QA') {
          steps {
            sh 'mvn clean install -DskipTests="true"'
          }
        }

        stage('chrome') {
          steps {
            sh 'mvn test -Denv="qa" -Dbrowser="chrome"'
          }
        }

        stage('firefox') {
          steps {
            sh 'mvn test -Denv="qa" -Dbrowser="firefox"'
          }
        }

      }
    }

    stage('Test on Stage') {
      parallel {
        stage('Test on Stage') {
          steps {
            sh 'mvn clean install -DskipTests="true"'
          }
        }

        stage('firefox') {
          steps {
            sh 'mvn test -Denv="stage" -Dbrowser="firefox"'
          }
        }

        stage('chrome') {
          steps {
            sh 'mvn test -Denv="stage" -Dbrowser="chrome"'
          }
        }

      }
    }

    stage('Test on PROD') {
      steps {
        sh 'mvn test -Dbrowser="chrome"'
      }
    }

  }
}