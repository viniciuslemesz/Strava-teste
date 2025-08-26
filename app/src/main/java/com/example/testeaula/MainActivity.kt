package com.example.testeaula

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testeaula.ui.theme.TesteaulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesteaulaTheme {
                TelaInicial()
            }
        }
    }
}


// PARA LEVAR PARA SEGUNDA TELA
// Button(onclick = {
// val intent = Intent(context, SegundaTela::class.java)
//context.startActivity(intent)
//}

// PARA MUDAR TELA E APARECER UMA INFORMAÇÃO
// private fn MudarTelaComInfo(contex: Context){
// val nomeItem = "Batata Frita"
//
// Button(onClick = {
//val intent = Intent(context, SegundaTela::class.java)
//intent.putExtra("nome", nomeItem)
//context.starActivity(intent)
//
// NA SEGUNDA TELA
// val nomeItemRecebido = intent.getStringExtra("nome")
// if(nomeItemecebido != null){
//   Text("Nome recebido: $nomeItemRecebido")
// }else{
//     Text("Nenhum nome recebido")
//}

@Composable
fun TelaInicial() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "STRAVA",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {
                    Log.d("TelaInicial", "Corrida iniciada")
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Iniciar Corrida",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedButton(

// Button(onclick = {
// val intent = Intent(context, SegundaTela::class.java)
//context.startActivity(intent)
//}
                onClick = {

                },
                border = ButtonDefaults.outlinedButtonBorder.copy(
                    width = 2.dp
                )
            ) {
                Text(
                    text = "Ver Perfil",
                    style = MaterialTheme.typography.labelLarge.copy(
                        color = MaterialTheme.colorScheme.primary
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaInicialPreview() {
    TesteaulaTheme {
        TelaInicial()
    }
}
