package com.example.testeaula

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testeaula.ui.theme.TesteaulaTheme

class SegundaTela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesteaulaTheme {
                TelaPerfil()
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
fun TelaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "PERFIL",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .size(160.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.voce),
                contentDescription = "Foto do usuário",
                modifier = Modifier
                    .size(150.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        InformacaoCard(titulo = "Nome", descricao = "Vinicius")
        InformacaoCard(titulo = "Idade", descricao = "18 anos")
        InformacaoCard(titulo = "Altura", descricao = "1.79m")
        InformacaoCard(titulo = "Peso", descricao = "71kg")

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Editar Perfil",
                fontSize = 18.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        val context = LocalContext.current

        Button(
            onClick = {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Inicio",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun InformacaoCard(titulo: String, descricao: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(8.dp),
        color = Color(0xFFFF5722), // Laranja
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = titulo,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White
            )
            Text(
                text = descricao,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}

