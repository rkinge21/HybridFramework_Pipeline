pipeline
{
	agent any
	stages
	{
		stage('Compile Stage')
		{
			steps
			{
				withMaven(maven : 'maven3_5_3')
				{
			   	   sh 'mvn clean compile'
			   	}
			}
		}
		stage('Testing Stage')
		{
			steps
			{
				withMaven(maven : 'maven3_5_3')
				{
				   sh 'mvn test -DthreadPoolSize="3" -Dremotewebdriver="ilde16570.eaas.amdocs.com:4448"'
				}
			}
		}
		
		stage('Deployment Stage')
		{
			steps
			{
				withMaven(maven : 'maven3_5_3')
				{
					sh 'mvn package -DthreadPoolSize="3" -Dremotewebdriver="ilde16570.eaas.amdocs.com:4448"'
				}
			}
		}
	}
}
