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
import androidx.compose.foundation.BorderStroke
import com.example.testeaula.ui.theme.TesteaulaTheme

class GruposActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesteaulaTheme {
                TelaGrupos()
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
fun TelaGrupos() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally, // centraliza horizontalmente
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "STRAVA",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(100.dp)) // espaço entre título e blocos

            // Coluna para os blocos no meio da tela
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(80.dp) // espaçamento entre linhas
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(19.dp),
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TelaInicio("Título 1", "Descrição 1", color = MaterialTheme.colorScheme.primary)
                }

            }

            Spacer(modifier = Modifier.weight(1f)) // empurra os botões para baixo

            // Linha dos botões na parte inferior
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        text = "Iniciar",
                        style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                    )
                }

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        text = "Perfil",
                        style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                    )
                }

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        text = "Mapas",
                        style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                    )
                }
            }
        }
    }
}

@Composable
fun TelaInicio(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .padding(5.dp),
        color = color,
        shadowElevation = 6.dp,
        tonalElevation = 6.dp,
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.Green
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = desc,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}