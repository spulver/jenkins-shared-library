void send(String channel, String message, String color) {
  send(
    channel: channel, 
    message: "${BUILD_URL}\n${message}",
    color: color
  )
}

void send(Map params=[:]) {

  Map defaultParams = [
    baseUrl: "https://tomboworkspacegroup.slack.com/services/hooks/jenkins-ci/",
    tokenCredentialId: "slack"
  ]

  slackSend(defaultParams << params)
}