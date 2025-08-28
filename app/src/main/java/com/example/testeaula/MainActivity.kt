package com.example.testeaula


import android.os.Bundle
import androidx.compose.ui.graphics.Color
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import android.content.Intent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.platform.LocalContext
import com.example.testeaula.ui.theme.TesteaulaTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.RoundedCornerShape


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
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally, // centraliza horizontalmente
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "🏃‍♂️STRAVA",
                fontSize = 28.sp,
                fontWeight = FontWeight.W800,
                color = MaterialTheme.colorScheme.primary
            )

            topbar("️\uD83D\uDD0DPesquisar", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)



            Spacer(modifier = Modifier.height(20.dp)) // espaço entre título e blocos
            val context = LocalContext.current

            // Coluna para os blocos no meio da tela
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp) // espaçamento entre linhas
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(19.dp),
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically

                ) {


                    Button(
                        onClick = {

                            val intent = Intent(context, SegundaTela::class.java)
                            context.startActivity(intent)
                        },

                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                    ) {
                        bloco(
                            "GRUPOS",
                            "Se junte em grupos de corrida.",
                            MaterialTheme.colorScheme.primary
                        )
                    }

                    Button(
                        onClick = {

                        },

                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                    ) {
                        bloco("INICIAR", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)
                    }


                    }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(19.dp),
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column()
                    {


                    Row(
                        horizontalArrangement = Arrangement.spacedBy(19.dp),
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        linha("INICIAR", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)



                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(19.dp),
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        linha("INICIAR", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)
                    }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(19.dp),
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            linha("INICIAR", "Clique aqui para iniciar sua corrida.", MaterialTheme.colorScheme.primary)                        }



                    Column()
                    {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(19.dp),
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            lateral("INFO", "\uD83D\uDC93170", MaterialTheme.colorScheme.primary)

                            Spacer(modifier = Modifier.width(50.dp))

                            Button(
                                onClick = {

                                },

                                colors = ButtonDefaults.buttonColors(containerColor = Color.White)

                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.voce), // substitua pelo nome do seu arquivo
                                    contentDescription = "Imagem do usuário",
                                    modifier = Modifier
                                        .size(100.dp) // ajusta o tamanho
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
                        text = "Inicio",
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
fun bloco(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier
            .width(110.dp)
            .height(150.dp)
            .padding(5.dp),
        color = color,


        //border = BorderStroke(0.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
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

@Composable
fun linha(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier.width(380.dp)
            .height(80.dp)
            .padding(5.dp),
        color = color,
        shadowElevation = 6.dp,
        tonalElevation = 6.dp,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(18.dp)
    )
    {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = desc,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )
        }
    }
}

@Composable
fun lateral(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier.width(100.dp)
            .height(220.dp)
            .padding(5.dp),
        color = color,
        shadowElevation = 6.dp,
        tonalElevation = 6.dp,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(17.dp)

    )
    {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = desc,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )
        }
    }
}

@Composable
fun topbar(titulo: String, desc: String, color: Color) {
    Surface(
        modifier = Modifier.width(380.dp)
            .height(50.dp)
            .padding(5.dp),
        color = color,
        shadowElevation = 6.dp,
        tonalElevation = 6.dp,
        border = BorderStroke(2.dp, Color.Black),
        shape = RoundedCornerShape(17.dp)
    )
    {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))

        }
    }
}