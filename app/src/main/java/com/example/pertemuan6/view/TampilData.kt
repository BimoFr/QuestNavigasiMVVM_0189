package com.example.pertemuan6.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.pertemuan6.R

@Composable
fun TampilData(
    onBackBtnCLick:()->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
    )
}