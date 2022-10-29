pipeline{
    
    agent any
    
    stages{
        
        stage("Build"){
            steps{
                echo("Build project")
            }
            
        }
        
        stage("Deploy to Dev"){
            steps{
                echo("Deploy to dev env")    
            }
            
        }    
        
        stage("Run UTs"){
            steps{
                echo("Run unit test cases")
            }
            
        }
        
        stage("Deploy to QA"){
            steps{
                echo("Deploy to QA env")
            }
            
        } 
        
        stage("Run Regression Automation test"){
            steps{
                echo("run regression automation test cases")
            }
            
        } 
        
        stage("Deploy to Stage"){
            steps{
                echo("Deploy to stage env")
            }
            
        }
        
        stage("Run Sanity Automation test"){
            steps{
                echo("run sanity automation test cases")
            }
            
        }
        
        stage("Deploy to prod"){
            steps{
                echo("Deploy to prod env")
            }
            
        }
        
    }
    
    
}