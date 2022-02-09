pipeline {
    agent any
    parameters{
        string(name: 'START_TIME', defaultValue: '', description: 'Start time in epoch format')
        string(name: 'END_TIME', defaultValue: '', description: 'End time in epoch format')
        choice(name: 'CLUSTER', choices: ['qe','prod'], description: 'deploy cluster details, it will be deployed in tlb-repair ns')
        
    }
    stages {
        stage('Validate') {
            steps {
                echo 'Validating the parameters'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying tlb-repair in environment'
            }
        }
        stage('Monitor') {
            steps {
                echo 'Monitoring the job....'
            }
        }
    }
}
