pipeline
{
	agent any
	stages
	{
		stage('Compile Stage')
		{
			steps
			{
			   	sh '${MAVEN_HOME}/bin/mvn clean compile'
			}
		}
		stage('Testing Stage')
		{
			steps
			{
				sh '${MAVEN_HOME}/bin/mvn test'
			}
		}
		
		stage('Deployment Stage')
		{
			steps
			{
				sh '${MAVEN_HOME}/bin/mvn package'
			}
		}
	}
}