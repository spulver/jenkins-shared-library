void send(String channel, String message) {
  send(channel: channel, message: "${BUILD_URL}\n${message})
}

void send(Map params=[:]) {

  Map defaultParams = [
    baseUrl: "https://tomboworkspacegroup.slack.com/services/hooks/jenkins-ci/",
    tokenCredentialId: "slack"
  ]

  slackSend(defaultParams << params)
}