package de.hshl.isd.quizcompose

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun QuizScreen(navController: NavController, viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Quiz") })
        })
    {
        Text(viewModel.questions[0].first)
    }
}