#!/usr/bin/env groovy

def call(String repoName, String branch) {
    if (repoName == null || branch == null)
        throw new RuntimeException("Cannot fetch repo!")

    withEnv(["REPO_NAME=${repoName}", "BRANCH=${branch}"]) {
        sh '''
       set +e
	   echo "INFO Checking out repo: ${REPO_NAME}"
	   echo "INFO Branch:            ${BRANCH}"
	   
	   git branch: '${BRANCH}', changelog: false, poll: false, url: '${REPO_NAME}'
       
      '''
    }

}

