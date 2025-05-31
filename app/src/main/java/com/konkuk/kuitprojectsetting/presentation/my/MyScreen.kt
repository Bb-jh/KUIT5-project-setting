package com.konkuk.kuitprojectsetting.presentation.my

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.konkuk.kuitprojectsetting.R
import com.konkuk.kuitprojectsetting.core.component.KuitTitle
import com.konkuk.kuitprojectsetting.core.util.context.adjustLightness
import com.konkuk.kuitprojectsetting.core.util.modifier.noRippleClickable

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        KuitTitle(title = "My Screen")
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(R.drawable.ic_my),
            contentDescription = "my screen image",
            modifier = Modifier
                .size(50.dp)
                .noRippleClickable { }
//                .clickable { }
        )
        Text("원래 색상", color = Color.Blue)
        Text("밝은 색상", color = Color.Blue.adjustLightness(1.5f))
        Text("어두운 색상", color = Color.Blue.adjustLightness(0.5f))
    }
}