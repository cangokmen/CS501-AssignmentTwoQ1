package com.example.assignmenttwoq1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmenttwoq1.ui.theme.AssignmentTwoQ1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentTwoQ1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        ColorCard(
                            color = Color.Red,
                            label = "Card 1",
                            modifier = Modifier
                                .size(width = 250.dp, height = 150.dp)
                                .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                                .padding(bottom = 10.dp)
                        )

                        Spacer(modifier = Modifier.height(25.dp))

                        ColorCard(
                            color = Color.Green,
                            label = "Card 2",
                            modifier = Modifier
                                .size(width = 300.dp, height = 120.dp)
                                .padding(bottom = 10.dp)
                                .border(width=2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        ColorCard(
                            color = Color.Blue,
                            label = "Card 3",
                            modifier = Modifier
                                .size(width = 200.dp, height = 170.dp)
                                .padding(all = 10.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ColorCard(
    color: Color,
    label: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(30.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(color)
        ) {
            Text(
                text = label,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}



