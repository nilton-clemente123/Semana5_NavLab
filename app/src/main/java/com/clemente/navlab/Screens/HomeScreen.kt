package com.clemente.navlab.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemente.navlab.Navigation.Screen
import com.clemente.navlab.ui.components.ActionCard
import com.clemente.navlab.ui.components.LogoutButton
import com.clemente.navlab.ui.theme.AppColors
import com.clemente.navlab.ui.theme.AppDimensions

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.BackgroundLavender)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = AppColors.PrimaryPurple,
                    shape = RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp)
                )
                .statusBarsPadding()
                .padding(horizontal = 24.dp, vertical = 40.dp)
        ) {
            Column {
                Text(
                    text = "Bienvenido,",
                    style = MaterialTheme.typography.titleLarge,
                    color = AppColors.Lavender
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = "Nilton Clemente",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.CardWhite
                )

                Spacer(Modifier.height(10.dp))

                Text(
                    text = "¿Qué deseas gestionar hoy?",
                    style = MaterialTheme.typography.bodyLarge,
                    color = AppColors.Lavender
                )
            }
        }

        Column(
            modifier = Modifier.padding(horizontal = AppDimensions.ScreenPadding)
        ) {
            Spacer(Modifier.height(AppDimensions.SectionSpacing))

            ActionCard(
                icon = Icons.Filled.Group,
                title = "Directorio de Alumnos",
                description = "Ver y gestionar estudiantes",
                onClick = { navController.navigate(Screen.List.route) }
            )

            Spacer(Modifier.height(AppDimensions.CardSpacing))

            ActionCard(
                icon = Icons.Filled.Person,
                title = "Mi Perfil Académico",
                description = "Datos personales y progreso",
                onClick = { navController.navigate(Screen.Profile.route) }
            )

            Spacer(Modifier.height(32.dp))

            LogoutButton(
                text = "Cerrar Sesión Segura",
                onClick = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Home.route) { inclusive = true }
                    }
                }
            )

            Spacer(Modifier.height(24.dp))
        }

        Spacer(Modifier.navigationBarsPadding())
    }
}
