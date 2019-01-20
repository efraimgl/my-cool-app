node {
    stage("My Stage") {
        echo "Checkout repository"
        git 'https://github.com/efraimgl/my-cool-app'
    }
}
