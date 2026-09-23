package com.clemente.navlab.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemente.navlab.Navigation.Screen
import com.clemente.navlab.ui.components.CircularAvatar
import com.clemente.navlab.ui.components.LogoutButton
import com.clemente.navlab.ui.components.ProfileInfoRow
import com.clemente.navlab.ui.components.SectionTitle
import com.clemente.navlab.ui.theme.AppColors
import com.clemente.navlab.ui.theme.AppDimensions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    Scaffold(
        containerColor = AppColors.BackgroundLavender,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Configuración de Perfil",
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.PrimaryDarkPurple
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver",
                            tint = AppColors.PrimaryDarkPurple
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AppColors.BackgroundLavender
                )
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(AppColors.PrimaryPurple, AppColors.WarmPurple)
                        )
                    )
                    .padding(vertical = 40.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularAvatar(
                        size = 96.dp,
                        background = AppColors.Lavender,
                        iconTint = AppColors.PrimaryPurple,
                        modifier = Modifier.border(
                            4.dp, AppColors.CardWhite, CircleShape
                        )
                    )
                    Spacer(Modifier.height(14.dp))
                    Text(
                        text = "Nilton Clemente Huaraka",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = AppColors.CardWhite
                    )
                }
            }

            Column(
                modifier = Modifier.padding(horizontal = AppDimensions.ScreenPadding)
            ) {
                Spacer(Modifier.height(20.dp))

                SectionTitle(text = "Información Personal")
                Spacer(Modifier.height(12.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(AppDimensions.CardCornerRadius),
                    colors = CardDefaults.cardColors(containerColor = AppColors.CardWhite),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 6.dp)
                    ) {
                        ProfileInfoRow(
                            icon = Icons.Filled.Person,
                            label = "Nombre Completo",
                            value = "Nilton Javier"
                        )
                        HorizontalDivider(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            color = AppColors.LightLavender
                        )
                        ProfileInfoRow(
                            icon = Icons.Filled.Email,
                            label = "Correo",
                            value = "nilton.clemente@tecsup.edu.pe"
                        )
                        HorizontalDivider(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            color = AppColors.LightLavender
                        )
                        ProfileInfoRow(
                            icon = Icons.Filled.Phone,
                            label = "Teléfono",
                            value = "+51 987 654 321"
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                SectionTitle(text = "Académico")
                Spacer(Modifier.height(12.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(AppDimensions.CardCornerRadius),
                    colors = CardDefaults.cardColors(containerColor = AppColors.CardWhite),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 6.dp)
                    ) {
                        ProfileInfoRow(
                            icon = Icons.Filled.School,
                            label = "Carrera",
                            value = "Diseño y desarrollo de Software"
                        )
                        HorizontalDivider(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            color = AppColors.LightLavender
                        )
                        ProfileInfoRow(
                            icon = Icons.Filled.DateRange,
                            label = "Ciclo",
                            value = "VI Ciclo"
                        )
                    }
                }

                Spacer(Modifier.height(32.dp))

                LogoutButton(
                    text = "Cerrar Sesión",
                    onClick = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo(Screen.Home.route) { inclusive = true }
                        }
                    }
                )

                Spacer(Modifier.height(24.dp))
            }
        }
    }
}
