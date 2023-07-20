package uz.gita.starterprojectmvi.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.gita.starterprojectmvi.ui.theme.StarterProjectMVITheme

@Composable
fun PaymentItem(
    name:String,
    cost:Int
) {
    Surface {
      Row(modifier = Modifier
          .fillMaxWidth()
          .wrapContentHeight()
          .padding(horizontal = 16.dp, vertical = 20.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
          Text(text = name, modifier = Modifier.width(130.dp), maxLines = 1)
          Text(text = "===========================", modifier = Modifier.weight(1f).padding(horizontal = 10.dp), maxLines = 1)
          Text(text = "$$cost ", fontWeight = FontWeight.Bold, fontSize = MaterialTheme.typography.titleLarge.fontSize)
                    
      }
    }
    
}

@Preview
@Composable
fun prevPayment(){
    StarterProjectMVITheme {
        PaymentItem(name = "GITA bootcamp", cost = 2500)
    }
}