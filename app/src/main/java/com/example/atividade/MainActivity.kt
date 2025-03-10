package com.example.atividade // Declara o pacote onde a classe está localizada

import android.os.Bundle // Importa a classe Bundle, que é usada para passar dados entre atividades
import androidx.activity.ComponentActivity // Importa a classe ComponentActivity, que é a base para atividades que usam Jetpack Compose
import androidx.activity.compose.setContent // Importa a função setContent, que permite definir a interface do usuário usando Compose
import androidx.compose.foundation.Image // Importa o componente Image, que é usado para exibir imagens
import androidx.compose.foundation.clickable // Importa o modificador clickable, que permite adicionar ações de clique
import androidx.compose.foundation.layout.* // Importa todos os componentes de layout do Compose
import androidx.compose.material3.MaterialTheme // Importa o tema Material 3 para estilização
import androidx.compose.material3.Text // Importa o componente Text, que é usado para exibir texto
import androidx.compose.runtime.Composable // Importa a anotação Composable, que indica que a função pode ser usada para construir a interface do usuário
import androidx.compose.ui.Alignment // Importa a classe Alignment para alinhar elementos
import androidx.compose.foundation.background // Importa o modificador background
import androidx.compose.ui.graphics.Color // Importa a classe Color
import androidx.compose.ui.Modifier // Importa a classe Modifier, que é usada para modificar o comportamento e a aparência dos componentes
import androidx.compose.ui.layout.ContentScale // Importa a enumeração ContentScale, que define como o conteúdo deve ser escalado
import androidx.compose.ui.res.painterResource // Importa a função painterResource, que carrega recursos de imagem
import androidx.compose.ui.tooling.preview.Preview // Importa a anotação Preview, que permite visualizar a interface do usuário no Android Studio
import androidx.compose.ui.unit.dp // Importa a função dp, que é usada para definir dimensões em densidade independente de pixels
import androidx.compose.ui.unit.sp // Importa a função sp, que é usada para definir tamanhos de texto
import com.example.atividade.ui.theme.AtividadeTheme // Importa o tema personalizado do aplicativo

// Define a classe MainActivity, que herda de ComponentActivity
class MainActivity : ComponentActivity() {
    // Método chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Chama o método da superclasse para inicializar a atividade
        setContent { // Define o conteúdo da atividade usando Jetpack Compose
            AtividadeTheme { // Aplica o tema personalizado ao conteúdo
                CartaoDeVisita() // Chama a função que define a interface do usuário do cartão de visita
            }
        }
    }
}

// Função Composable que define a interface do cartão de visita
@Composable
fun CartaoDeVisita() {
    // Definindo os dados do cartão de visita
    val nomeUsuario = "João da Silva" // Nome do usuário
    val cargoUsuario = "Desenvolvedor de Software" // Cargo do usuário
    val telefoneUsuario = "(11) 98765-4321" // Telefone do usuário
    val redeSocialUsuario = "@joaoGTAbomgg" // Nome da rede social do usuário
    val emailUsuario = "joao.silva@exemplo.com" // Email do usuário
    val backgroundcolor = Color(0XEE000033)

    // Cor do texto
    val textoCor = Color.Black // Cor que pode ser alterada conforme necessário
    val textDiff = Color(61, 180, 132)

    // Layout do cartão de visita
    Column( // Usamos um Column para empilhar os elementos verticalmente
        modifier = Modifier // Modificador para aplicar estilos e comportamentos
            .fillMaxSize() // Faz o Column ocupar todo o espaço disponível
            .background(Color(144, 238, 144)) // Define a cor de fundo como verde claro
            .padding(15.dp, top = 200.dp, end = 15.dp), // Adiciona um preenchimento de 15 dp ao redor do Column
        horizontalAlignment = Alignment.CenterHorizontally // Alinha os elementos horizontalmente ao centro
    ) {
        // Logo
        Box (modifier = Modifier
            .background(backgroundcolor)){
            Image(
                painter = painterResource(id = R.drawable.android_logo), // Carrega a imagem da logo a partir dos recursos
                contentDescription = "Logo", // Descrição da imagem para acessibilidade
                modifier = Modifier.size(100.dp), // Define o tamanho da imagem como 100 dp
                contentScale = ContentScale.Crop // Escala a imagem para preencher o espaço disponível

            )
        }

        // Nome do Usuário
        Text(
            text = nomeUsuario,
            style = MaterialTheme.typography.titleLarge.copy(color = textoCor, fontSize = 35.sp) // Exibe o nome do usuário com cor e tamanho personalizados
        )

        Spacer(modifier = Modifier.height(4.dp)) // Adiciona um espaço de 8 dp entre os elementos

        // Cargo do Usuário
        Text(
            text = cargoUsuario,
            style = MaterialTheme.typography.bodyMedium.copy(color = textDiff, fontSize = 20.sp) // Exibe o cargo do usuário com cor e tamanho personalizados
        )

        Spacer(modifier = Modifier.height(4.dp)) // Adiciona um espaço de 8 dp entre os elementos

        // Telefone
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 220.dp, start = maxOf(100.dp)/*105.dp*/) // Adiciona um preenchimento vertical de 4 dp
        ) {
            Image(
                painter = painterResource(id = R.drawable.phone_24dp_1f1f1f), // Carrega o ícone de telefone a partir dos recursos
                contentDescription = "Telefone", // Descrição do ícone para acessibilidade
                modifier = Modifier
                    .size(20.dp) // Define o tamanho do ícone como 24 dp
            )
            Text(
                text = telefoneUsuario,
                style = MaterialTheme.typography.bodyMedium.copy(color = textoCor, fontSize = 15.sp), // Exibe o telefone do usuário com cor e tamanho personalizados
                modifier = Modifier.padding(start = 15.dp) // Adiciona um preenchimento à esquerda do texto
            )
        }

        Spacer(modifier = Modifier.height(4.dp)) // Adiciona um espaço de 8 dp entre os elementos

        // Rede Social
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp, start = maxOf(100.dp)) // Adiciona um preenchimento vertical de 4 dp
        ) {
            Image(
                painter = painterResource(id = R.drawable.share_24dp_1f1f1f), // Carrega o ícone da rede social a partir dos recursos
                contentDescription = "Rede Social", // Descrição do ícone para acessibilidade
                modifier = Modifier
                    .size(20.dp) // Define o tamanho do ícone como 24 dp
            )
            Text(
                text = redeSocialUsuario,
                style = MaterialTheme.typography.bodyMedium.copy(color = textoCor, fontSize = 15.sp), // Exibe o nome da rede social do usuário com cor e tamanho personalizados
                modifier = Modifier.padding(start = 15.dp) // Adiciona um preenchimento à esquerda do texto
            )
        }

        Spacer(modifier = Modifier.height(4.dp)) // Adiciona um espaço de 8 dp entre os elementos

        // Email
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp, start = maxOf(100.dp)) // Adiciona um preenchimento vertical de 4 dp
        ) {
            Image(
                painter = painterResource(id = R.drawable.email_24dp_1f1f1f), // Carrega o ícone de email a partir dos recursos
                contentDescription = "Email", // Descrição do ícone para acessibilidade
                modifier = Modifier
                    .size(20.dp) // Define o tamanho do ícone como 24 dp
            )
            Text(
                text = emailUsuario,
                style = MaterialTheme.typography.bodyMedium.copy(color = textoCor, fontSize = 15.sp), // Exibe o email do usuário com cor e tamanho personalizados
                modifier = Modifier.padding(start = 15.dp) // Adiciona um preenchimento à esquerda do texto
            )
        }
    }
}

// Função de pré-visualização para visualizar a interface do usuário no Android Studio
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AtividadeTheme { // Aplica o tema personalizado na pré-visualização
        CartaoDeVisita() // Chama a função que define a interface do usuário do cartão de visita
    }
}
