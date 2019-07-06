#!/usr/bin/env groovy

def call(String repoName, String branch, String dirName) {
    if (repoName == null || branch == null)
        throw new RuntimeException("Cannot fetch repo!")

    if (!fileExists "${dirName}") {
        new File(dirName).mkdir()
    }
    dir(dirName) {
        git branch: "${branch}", changelog: false, poll: false, url: "${repoName}"
    }

//    withEnv(["REPO_NAME=${repoName}", "BRANCH=${branch}"]) {
//        sh '''
//       set +e
//	   echo "INFO Checking out repo: ${REPO_NAME}"
//	   echo "INFO Branch:            ${BRANCH}"
//
//	   git branch: '${BRANCH}', changelog: false, poll: false, url: '${REPO_NAME}'
//
//      '''
//    }

}

