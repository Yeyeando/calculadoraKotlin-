package com.example.calculadorasuma

import android.R.bool
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadorasuma.ui.theme.CalculadoraSumaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraSumaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Content(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Calculadora Suma",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        InputForm()
    }
}

@Composable
fun InputForm() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    var errorNum1 by remember { mutableStateOf(false) }
    var errorNum2 by remember { mutableStateOf(false) }

    Column {
        OutlinedTextField(
            value = num1,
            onValueChange = { input ->
                num1 = input
                errorNum1 = input.isNotEmpty() && input.toFloatOrNull() == null
            },
            label = { Text("Número 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            isError = errorNum1
        )
        if (errorNum1) {
            Text(
                text = "Ingrese un número entero o decimal.",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        OutlinedTextField(
            value = num2,
            onValueChange = { input ->
                num2 = input
                errorNum2 = input.isNotEmpty() && input.toFloatOrNull() == null
            },
            label = { Text("Número 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            isError = errorNum2
        )
        if (errorNum2) {
            Text(
                text = "Ingrese un número entero o decimal.",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Button(
            onClick = {
                val n1 = num1.toFloatOrNull() ?: 0f
                val n2 = num2.toFloatOrNull() ?: 0f
                if (!errorNum1 && !errorNum2) {
                    result = (n1 + n2).toString()
                } else {
                    result = "Error en los números ingresados."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Calcular Suma")
        }

        Text(
            text = "Resultado: $result",
            modifier = Modifier.padding(top = 16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculadoraSumaTheme {
        Content()
    }
}
