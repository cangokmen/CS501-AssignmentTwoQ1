package com.example.assignmenttwoq1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmenttwoq1.ui.theme.AssignmentTwoQ1Theme

// MainActivity is the app's entry point and sets up the initial UI.
class MainActivity : ComponentActivity() {
    // onCreate defines the activity's layout when it's first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent defines the UI using Jetpack Compose.
        setContent {
            AssignmentTwoQ1Theme {
                // A Surface container using the background color from the theme.
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // A Column to arrange items vertically, centered on the screen.
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        // First card with a light gray background applied via the modifier.
                        ColorCard(
                            color = Color.Red,
                            label = "Card 1",
                            modifier = Modifier
                                .size(width = 250.dp, height = 150.dp)
                                .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                                .padding(bottom = 10.dp)
                        )

                        // Spacer for vertical separation between cards.
                        Spacer(modifier = Modifier.height(25.dp))

                        // Second card with a black border.
                        ColorCard(
                            color = Color.Green,
                            label = "Card 2",
                            modifier = Modifier
                                .size(width = 300.dp, height = 120.dp)
                                .padding(bottom = 10.dp)
                                .border(width=2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        // Third card with padding on all sides.
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

/**
 * A reusable Composable for displaying a card with a specific color and label.
 *
 * @param color The background color of the card.
 * @param label The text to display inside the card.
 * @param modifier The Modifier to be applied to this card.
 */
@Composable
fun ColorCard(
    color: Color,
    label: String,
    modifier: Modifier = Modifier
) {
    // A Material Design container with rounded corners.
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(30.dp)
    ) {
        // Box is used to center the Text within the Card.
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
