node {
    stage("My Stage") {
        echo "My first stage"
        git 'https://github.com/efraimgl/my-cool-app'
    }
}
