package com.example.testeaula

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            text = "STRAVA",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        topbar("🔍 Pesquisar", "", MaterialTheme.colorScheme.primary)

        Spacer(modifier = Modifier.height(80.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(19.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                bloco("GRUPOS", "Se junte em grupos de corrida.", MaterialTheme.colorScheme.primary)
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                bloco("INICIAR", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        linha("RANKING", "Clique aqui ver os melhores corredores!", MaterialTheme.colorScheme.primary)
        linha("AJUDA", "Clique aqui para tirar duvidas.", MaterialTheme.colorScheme.primary)

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(19.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            lateral("INFO", "💗170", MaterialTheme.colorScheme.primary)

            Spacer(modifier = Modifier.width(50.dp))

            Button(
                onClick = {
                    val intent = Intent(context, SegundaTela::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.voce),
                    contentDescription = "Imagem do usuário",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(2.dp)
                )

                Text(
                    text = "VOCÊ",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun bloco(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .padding(5.dp),
        color = color
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.titleLarge, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(desc, style = MaterialTheme.typography.bodyMedium, color = Color.White)
        }
    }
}

@Composable
fun linha(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(380.dp)
            .height(80.dp)
            .padding(5.dp),
        color = color,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(18.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.titleLarge, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(desc, style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold), color = Color.White)
        }
    }
}

@Composable
fun lateral(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(100.dp)
            .height(220.dp)
            .padding(5.dp),
        color = color,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(17.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.titleLarge, color = Color.Green)
            Spacer(modifier = Modifier.height(8.dp))
            Text(desc, style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold), color = Color.White)
        }
    }
}

@Composable
fun topbar(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(380.dp)
            .height(50.dp)
            .padding(5.dp),
        color = color,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(17.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.bodyMedium, color = Color.White)
        }
    }
}
