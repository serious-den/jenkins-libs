
def call(String command) {
    ansiColor('xterm') {
        timestamps {
            sh command
        }
    }
}