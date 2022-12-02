void send(String channel, String message, String color) {
  send(
    channel: channel, 
    message: "${BUILD_URL}\n${message}",
    color: color
  )
}

void send(String channel, String message) {
  send(channel: channel, message: "${BUILD_URL}\n${message}")
}

void send(Map params=[:]) {

  Map defaultParams = [
    baseUrl: "https://tomboworkspacegroup.slack.com/services/hooks/jenkins-ci/",
    tokenCredentialId: "slack"
  ]

  slackSend(defaultParams << params)
}

void call(String channel = "#general", String message = "", String color = "") {
  send(channel, message, color)
}