package com.example.brazilfestivals


data class TestDataItem(
    var id: String,
    var title: String,
    var url: String,
)

object TestData {
    private val imagesList = listOf(
        "https://api.time.com/wp-content/uploads/2016/02/rio-carnival.jpg?quality=85&w=1600",
        "https://res.cloudinary.com/rainforest-cruises/images/c_fill,g_auto/f_auto,q_auto/w_1120,h_732,c_fill,g_auto/v1622488520/shutterstock_593488676-carnivaljpg1120/shutterstock_593488676-carnivaljpg1120-1120x732.jpg",
        "https://res.cloudinary.com/rainforest-cruises/images/c_fill,g_auto/f_auto,q_auto/v1625772243/Carnival-In-Brazil-Street/Carnival-In-Brazil-Street.jpg",
        "https://bookers.s3.amazonaws.com/pages/foto-5-mangueira-alexandre-macieira-riotur-1.jpg",
        "https://bookers.s3.amazonaws.com/pages/21-bloco-ceu-na-terra-foto-gabriel-monteiro-riotur.jpg",
        "https://bookers.s3.amazonaws.com/pages/foto-90-imperio-serrano-marcos-terranova-riotur-1.jpg",
        "https://bookers.s3.amazonaws.com/pages/foto-85-imperio-serrano-alex-ferro-riotur-1.jpg",
        "https://bookers.s3.amazonaws.com/pages/foto-64-grande-rio-gabriel-monteiro-riotur-1.jpg"
    )

    val testItemsList = List(8) {
        TestDataItem(
            id = it.toString(),
            url = imagesList[it],
            title = "Title $it"
        )
    }

}