package com.example.tugas4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas4.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                MainScreen()
            }
        }
    }
}

@Composable
fun InfoCard(
    backgroundColor: Color,
    nameResId: Int,
    phoneResId: Int?,
    phoneColor: Color?,
    locationResId: Int,
    locationColor: Color
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.umylogo),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    text = stringResource(id = nameResId),
                    color = colorResource(id = R.color.text_white),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                if (phoneResId != null && phoneColor != null) {
                    Text(
                        text = stringResource(id = phoneResId),
                        color = phoneColor,
                        fontSize = 14.sp
                    )
                }

                Text(
                    text = stringResource(id = locationResId),
                    color = locationColor,
                    fontSize = 14.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.umylogo),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}
