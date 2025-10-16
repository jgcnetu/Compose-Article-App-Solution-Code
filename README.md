Compose Article - Solution Code
This project contains solution code for Compose Article practice problem. In the exercise, you need to build a screen which displays article about Jetpack Compose Tutorial.

Solution
Download the image from the URL given in practice problem

Import the image in the ComposeArticle project

Use Column composable function to arrange the components vertically:
Column(){
    // Load image using painterResource()
    Image(...)
    // Load text using stringResource()
    Text(...)
    // Load text using stringResource()
    Text(...)
}

Note:
The solution code uses the basic composables covered in Unit 1, Pathway 3 for Android Basics in Compose.
There's a lot of room for improvement, so feel free to experiment and try different things.
