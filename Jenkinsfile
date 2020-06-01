pipeline {
  agent any
  stages {
    stage('Test Run on Dev') {
      steps {
        sh 'mvn clean install -Denv="dev"'
      }
    }

    stage('Test Run on QA') {
      steps {
        sh 'mvn clean install -Denv="qa"'
      }
    }

    stage('Test Run on Stage') {
      steps {
        sh 'mvn clean install -Denv="stage"'
      }
    }

    stage('Test Run on PROD') {
      steps {
        sh 'mvn clan install -Denv="dev"'
      }
    }

  }
}