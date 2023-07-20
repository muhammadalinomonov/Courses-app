package uz.gita.starterprojectmvi.presentation.screen.payment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.starterprojectmvi.R
import uz.gita.starterprojectmvi.ui.components.PaymentItem
import uz.gita.starterprojectmvi.ui.theme.MyColor1
import uz.gita.starterprojectmvi.utils.navigation.MyScreen

class PaymentScreen : MyScreen() {
    @Composable
    override fun Content() {
        val viewModel: PaymentContract.Model = getViewModel<PaymentModel>()
        val uiState = viewModel.collectAsState().value

        PayContent(uiState, viewModel::eventDispatcher)
    }

    @Composable
    fun PayContent(
        uiState: PaymentContract.UiState,
        eventDispatcher: (PaymentContract.Intent) -> Unit
    ) {
        Surface {
            when (uiState) {
                PaymentContract.UiState.Loading -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(100.dp),
                            strokeWidth = 10.dp,
                            color = MyColor1
                        )
                    }
                    eventDispatcher.invoke(PaymentContract.Intent.LoadList)
                }

                PaymentContract.UiState.Empty -> {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.no_course),
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            contentDescription = null
                        )
                        Text(
                            text = "Unpurchased course not Found",
                            fontSize = MaterialTheme.typography.titleLarge.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }

                is PaymentContract.UiState.GetList -> {
                    var sum = 0
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        LazyColumn {
                            items(uiState.list) {
                                val name = it.name
                                val cost = it.price.removeRange(0, 1).toInt()
                                PaymentItem(name = name, cost = cost)
                                sum += cost
                            }
                            item {
                                Spacer(modifier = Modifier.weight(1f))
                                Button(
                                    onClick = {
                                        eventDispatcher.invoke(
                                            PaymentContract.Intent.ClickPayButton(
                                                sum
                                            )
                                        )
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight()
                                        .padding(vertical = 8.dp),
                                    colors = ButtonDefaults.buttonColors(MyColor1)
                                ) {
                                    Text(text = "$sum$ pay now".uppercase())
                                }
                            }
                        }

                    }
                }
            }
        }

    }

    @Preview
    @Composable
    fun prevPay() {
        Surface {
            PayContent(uiState = PaymentContract.UiState.Loading) {

            }
        }
    }
}