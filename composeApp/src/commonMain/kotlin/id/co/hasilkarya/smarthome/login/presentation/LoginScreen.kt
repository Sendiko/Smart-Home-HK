package id.co.hasilkarya.smarthome.login.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import id.co.hasilkarya.smarthome.core.theme.BlueGradient
import id.co.hasilkarya.smarthome.core.theme.BrokenWhite
import id.co.hasilkarya.smarthome.core.theme.SmartHomeTheme
import id.co.hasilkarya.smarthome.login.presentation.components.CustomTextField
import id.co.hasilkarya.smarthome.login.presentation.components.PrimaryButton
import id.co.hasilkarya.smarthome.login.presentation.components.SecureTextField
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import smarthomehasilkarya.composeapp.generated.resources.Res
import smarthomehasilkarya.composeapp.generated.resources.app_name
import smarthomehasilkarya.composeapp.generated.resources.email
import smarthomehasilkarya.composeapp.generated.resources.email_icon
import smarthomehasilkarya.composeapp.generated.resources.forgot_password
import smarthomehasilkarya.composeapp.generated.resources.image
import smarthomehasilkarya.composeapp.generated.resources.lock
import smarthomehasilkarya.composeapp.generated.resources.lock_icon
import smarthomehasilkarya.composeapp.generated.resources.login_header
import smarthomehasilkarya.composeapp.generated.resources.login_subheader

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        Image(
            modifier = Modifier.size(300.dp),
            painter = painterResource(Res.drawable.image),
            contentDescription = stringResource(Res.string.app_name),
        )
        Text(
            text = stringResource(Res.string.login_header),
            style = MaterialTheme.typography.headlineMedium,
            color = BrokenWhite,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(Res.string.login_subheader),
            color = BrokenWhite,
            style = MaterialTheme.typography.labelMedium,
        )
        Card(
            modifier = Modifier.fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .background(BlueGradient),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent,
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
            ) {
                CustomTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {  },
                    hint = "Email",
                    leadingIcon = {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(Res.drawable.email),
                            contentDescription = stringResource(Res.string.email_icon)
                        )
                    }
                )
                SecureTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = {  },
                    onVisibilityChange = {  },
                    hint = "Password",
                    isVisible = true,
                    leadingIcon = {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(Res.drawable.lock),
                            contentDescription = stringResource(Res.string.lock_icon)
                        )
                    }
                )
                Surface(
                    color = Color.Transparent,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(Res.string.forgot_password),
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.End,
                        color = BrokenWhite,
                    )
                }
                PrimaryButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {  },
                    text = "Login"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    SmartHomeTheme {
        LoginScreen()
    }
}