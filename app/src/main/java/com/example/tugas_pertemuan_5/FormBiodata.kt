package com.example.tugas_pertemuan_5

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {

    // Menyimpan nilai input
    var namaDepan by remember { mutableStateOf("") }
    var namaBelakang by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }

    // Menyimpan pilihan checkbox.
    var skillAndroid by remember { mutableStateOf(false) }
    var skillUiUx by remember { mutableStateOf(false) }
    var skillWeb by remember { mutableStateOf(false) }

    var tampilPesan by remember { mutableStateOf(false) }

    // Mengambil warna dari resources.
    val putih = colorResource(R.color.background)
    val ungu = colorResource(R.color.primary)
    val warnaTeks = colorResource(R.color.text_primary)
    val warnaKeterangan = colorResource(R.color.text_secondary)

    var tampilPesan by remember { mutableStateOf(false) }



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

