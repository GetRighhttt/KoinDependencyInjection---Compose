package com.example.koinexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.koinexample.ui.theme.KoinExampleTheme
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

/*
Koin vs Dagger and Dagger-Hilt

Dagger and dagger-hilt -> compile time (fast), uses annotations and has a lot of boilerplate code,
has a ton of code generation and dependencies that are necessary in order to get it working. Dagger
and Dagger-Hilt also depend on Java. AOT compilation.

Koin -> runtime (slower), no annotations and doesn't involve code regeneration or generation,
completely depends on kotlin programming. JIT compilation.
 */

class MainActivity : ComponentActivity(), AndroidScopeComponent {

//    private val viewModel by viewModel<MainViewModel>()

    override val scope: Scope by activityScope()
    private val hello by inject<String>(named("bye"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(hello)
        setContent {
            KoinExampleTheme {
                val viewModel = getViewModel<MainViewModel>()
                viewModel.doNetworkCall()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KoinExampleTheme {
        Greeting("Android")
    }
}