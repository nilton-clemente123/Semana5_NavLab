package com.clemente.navlab.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemente.navlab.Navigation.Screen
import com.clemente.navlab.data.Students
import com.clemente.navlab.ui.components.StudentCard
import com.clemente.navlab.ui.theme.AppColors
import com.clemente.navlab.ui.theme.AppDimensions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(navController: NavController) {

    Scaffold(
        containerColor = AppColors.BackgroundLavender,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Directorio de Alumnos",
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

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(AppColors.BackgroundLavender),
            contentPadding = PaddingValues(
                start = AppDimensions.ScreenPadding,
                end = AppDimensions.ScreenPadding,
                top = AppDimensions.ElementSpacing,
                bottom = AppDimensions.SectionSpacing
            ),
            verticalArrangement = Arrangement.spacedBy(AppDimensions.CardSpacing)
        ) {
            itemsIndexed(Students) { index, student ->
                StudentCard(
                    name = student.name,
                    career = student.career,
                    onClick = {
                        navController.navigate(
                            Screen.Detail.createRoute(index + 1)
                        )
                    }
                )
            }
        }
    }
}
