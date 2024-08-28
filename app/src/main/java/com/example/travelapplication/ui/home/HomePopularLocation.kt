package com.example.travelapplication.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.travelapplication.ui.components.GapCompose

@Composable
fun HomePopularLocation() {
    lateinit var courseList: List<String>
    courseList = ArrayList<String>()

    Column {
        Text(
            text = "Popular Location",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        GapCompose(isRow = false)
        LazyRow {
            itemsIndexed(courseList) { index, item ->

            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomePrev() {
    HomeScreen()
}
