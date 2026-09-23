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
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Email
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemente.navlab.data.Students
import com.clemente.navlab.ui.components.CircularAvatar
import com.clemente.navlab.ui.components.ProfileInfoRow
import com.clemente.navlab.ui.components.SectionTitle
import com.clemente.navlab.ui.theme.AppColors
import com.clemente.navlab.ui.theme.AppDimensions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, itemId: Int) {

    val student = Students.getOrNull(itemId - 1) ?: Students.first()

    Scaffold(
        containerColor = AppColors.BackgroundLavender,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Expediente Académico",
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
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(AppColors.PrimaryPurple)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 92.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularAvatar(
                        size = AppDimensions.LargeAvatarSize,
                        background = AppColors.Lavender,
                        iconTint = AppColors.PrimaryPurple,
                        modifier = Modifier
                            .shadow(6.dp, CircleShape)
                            .border(4.dp, AppColors.CardWhite, CircleShape)
                    )
                    Spacer(Modifier.height(14.dp))
                    Text(
                        text = student.name,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.TextPrimary
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = student.career,
                        style = MaterialTheme.typography.bodyLarge,
                        color = AppColors.PrimaryPurple
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppDimensions.ScreenPadding),
                shape = RoundedCornerShape(AppDimensions.CardCornerRadius),
                colors = CardDefaults.cardColors(containerColor = AppColors.CardWhite),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(vertical = 6.dp)
                ) {
                    ProfileInfoRow(
                        icon = Icons.Filled.Badge,
                        label = "ID Estudiante",
                        value = student.id
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        color = AppColors.LightLavender
                    )
                    ProfileInfoRow(
                        icon = Icons.Filled.Email,
                        label = "Correo",
                        value = student.email
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        color = AppColors.LightLavender
                    )
                    ProfileInfoRow(
                        icon = Icons.Filled.Business,
                        label = "Facultad",
                        value = student.faculty
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            Column(
                modifier = Modifier.padding(horizontal = AppDimensions.ScreenPadding)
            ) {
                SectionTitle(text = "Biografía")
                Spacer(Modifier.height(12.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(AppDimensions.CardCornerRadius),
                    colors = CardDefaults.cardColors(containerColor = AppColors.LightLavender),
                    elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
                ) {
                    Text(
                        text = student.bio,
                        style = MaterialTheme.typography.bodyLarge,
                        color = AppColors.TextPrimary,
                        modifier = Modifier.padding(20.dp)
                    )
                }
                Spacer(Modifier.height(24.dp))
            }
        }
    }
}
