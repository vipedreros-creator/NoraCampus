package cl.nora.campus.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.nora.campus.ui.theme.Theme // Asegúrate de ajustar a la clase de tu tema en ui.theme

@Composable
fun InicioDemo(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp) // Espaciado de 24 dp para el margen exterior
        ) {
            // 1. Título principal usando headlineMedium (sin fontSize fijo)
            Text(
                text = "Bienvenido a NORA Campus",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            // Espaciado vertical de 8 dp
            Spacer(modifier = Modifier.height(8.dp))

            // 2. Texto de ayuda/cuerpo usando bodyMedium
            Text(
                text = "Esta es una pantalla de prueba diseñada con la jerarquía de tipografía y colores de Material 3.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            // Espaciado vertical de 16 dp
            Spacer(modifier = Modifier.height(16.dp))

            // 3. Acción principal mediante Button
            Button(
                onClick = { /* Acción principal */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Continuar")
            }
        }
    }
}

// --- VISTAS PREVIAS (PREVIEWS) PARA TEMA CLARO Y OSCURO ---

@Preview(name = "Modo Claro", showBackground = true)
@Composable
fun InicioDemoPreviewLight() {
    // Reemplaza por el nombre de tu tema (ej. Theme, NORACampusTheme, etc.)
    MaterialTheme {
        InicioDemo()
    }
}

@Preview(
    name = "Modo Oscuro",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun InicioDemoPreviewDark() {
    MaterialTheme {
        InicioDemo()
    }
}