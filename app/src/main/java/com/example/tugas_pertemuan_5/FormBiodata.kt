package com.example.tugas_pertemuan_5

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.form_title)
        )
    }
}

