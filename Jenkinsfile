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
					sh 'mvn clean compile -DthreadPoolSize="3" -Dremotewebdriver="0.0.0.0:4448"'
				}
			}
		}
		stage('Testing Stage')
		{
			steps
			{
				withMaven(maven : 'maven3_5_3')
				{
					sh 'mvn test -DthreadPoolSize="3" -Dremotewebdriver="0.0.0.0:4448"'
				}
			}
		}
		
		stage('Deployment Stage')
		{
			steps
			{
				withMaven(maven : 'maven3_5_3')
				{
					sh 'mvn package -DthreadPoolSize="3" -Dremotewebdriver="0.0.0.0:4448"'
				}
			}
		}
	}
}