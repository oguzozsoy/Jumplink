package co.icanteach.android.deeplinktester.home.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.icanteach.android.deeplinktester.R
import co.icanteach.android.deeplinktester.ui.ThemesPreview
import co.icanteach.android.deeplinktester.ui.theme.DeeplinkTesterTheme

@Composable
fun HomeScreenHeaderContent(
    enteredContent: String,
    onEnteredContent: (String) -> Unit,
    onTestDeeplinkClicked: () -> Unit,
    onClearDeeplinkClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        DeeplinkTextField(
            content = enteredContent,
            onEnteredContent = { enteredContent ->
                onEnteredContent.invoke(enteredContent)
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        DeepLinkActions(
            onTestDeeplinkClicked = {
                onTestDeeplinkClicked.invoke()
            },
            onClearDeeplinkClicked = {
                onClearDeeplinkClicked.invoke()
            }
        )
        Spacer(modifier = Modifier.height(32.dp))
    }
}


@ThemesPreview
@Composable
fun HomeScreenHeaderContent_Preview() {
    DeeplinkTesterTheme {
        HomeScreenHeaderContent(
            enteredContent = "DeepLink Content",
            onEnteredContent = {},
            onClearDeeplinkClicked = {},
            onTestDeeplinkClicked = {}
        )
    }
}