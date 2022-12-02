void send(String channel, String message) {
  send(channel: channel, message: message)
}

void send(Map params=[:]) {

  Map defaultParams = [
    baseUrl: "https://tomboworkspacegroup.slack.com/services/hooks/jenkins-ci/",
    tokenCredentialId: "slack"
  ]

  slackSend(defaultParams << params)
}