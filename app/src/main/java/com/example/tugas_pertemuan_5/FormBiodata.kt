package com.example.tugas_pertemuan_5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

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

    // Mengambil ukuran dari resources.
    val jarakKecil = dimensionResource(R.dimen.space_small)
    val jarakBesar = dimensionResource(R.dimen.space_large)
    val paddingForm = dimensionResource(R.dimen.form_padding)
    val sudutForm = dimensionResource(R.dimen.form_corner)
    val sudutInput = dimensionResource(R.dimen.input_corner)

    // Bobot yang sama membuat kedua kolom memiliki lebar yang sama.
    val formLengkap =
    namaDepan.isNotBlank() &&
            namaBelakang.isNotBlank() &&
            email.isNotBlank() &&
            tanggalLahir.isNotBlank() &&
            experience.isNotBlank() &&
            (skillAndroid || skillUiUx || skillWeb)


    Box(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
    ) {

        // Scaffold sebagai lapisan belakang.
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = putih
        ) { innerPadding ->

            Image(
                painter = painterResource(R.drawable.background_form),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
                    .height(
                        dimensionResource(R.dimen.header_height)
                    )
            )
        }

        // Box ini ditulis setelah Scaffold sehingga berada di atasnya.
        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(
                    top = dimensionResource(R.dimen.form_top_offset),
                    bottom = paddingForm
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = dimensionResource(R.dimen.form_shadow),
                        shape = RoundedCornerShape(
                            topStart = sudutForm,
                            topEnd = sudutForm
                        )
                    )
                    .background(
                        color = putih,
                        shape = RoundedCornerShape(
                            topStart = sudutForm,
                            topEnd = sudutForm
                        )
                    )
                    .padding(paddingForm)
            ) {

                // Judul
                Text(
                    text = stringResource(R.string.form_title),
                    color = ungu,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(
                    modifier = Modifier.height(jarakKecil)
                )

                // Keterangan.
                Text(
                    text = stringResource(R.string.form_description),
                    color = warnaKeterangan,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(
                    modifier = Modifier.height(jarakBesar)
                )

            }
}

