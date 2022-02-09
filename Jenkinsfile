def gv
pipeline {
    agent any
    parameters{
        //yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
        string(name: 'START_DATE', defaultValue: '1970-01-31', description: 'Start date in YYYY-MM-DD format')
        string(name: 'START_TIME', defaultValue: '23:59:59', description: 'Start time in HH:mm:ss format')

        string(name: 'END_DATE', defaultValue: '1970-01-31', description: 'End date in YYYY-MM-DD format')
        string(name: 'END_TIME', defaultValue: '23:59:59', description: 'End time in HH:mm:ss format')

        
        choice(name: 'CLUSTER', choices: ['qe','prod'], description: 'deploy cluster details, it will be deployed in tlb-repair ns')
        
    }
    stages {
        stage("init"){
            steps{
                script{
                    gv= load "src/validate.groovy"
                }
            }
        }
        stage('Validate') {
            steps {
                script{
                    gv.validateTime()
                }
                
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
