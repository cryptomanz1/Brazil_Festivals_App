package com.example.brazilfestivals


data class TestDataItem(
    var id: String,
    var title: String,
    var url: String,
    var description: String
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

    val titlesList = listOf(
        "Rio de Janeiro Festival",
        "Sao Paulo Carnival",
        "Samba Parade",
        "Salvador Festival",
        "Parintins Folklore Festival",
        "Festa Junina",
        "Lollapalooza Chicago",
        "Festival de Cachaça"
    )

    val descriptionsList = listOf(
        "Rio's Carnival begins on the Friday preceding Lent and ends on Ash Wednesday, but the Winners' Parade happens on the Saturday after the carnival ends. The winning school and runners' up of the Special Group, as well as the A Series champion school, all march past one final time in front of their supporters on this night.",
        "Sao Paulo has come a long way in Carnival history. The Carnival was a small event with a few samba schools in the Fifties. However, the city’s Sambódromo do Anhembi now draws millions of visitors from all over to participate in the celebrations. Most spectators are avid supporters of a particular samba school, much like the loyalty towards Brazil’s soccer teams. Two of the most popular soccer teams, Corinthians, and Palmeiras soccer club are represented by Gaviões da Fiel, and Mancha Verde, respectively.",
        "King Momo, accompanied by her queen, opens Carnival on Friday, which will be the first day of parades. It starts with the Gold or Access Group parading on Friday and Saturday and then continues on Sunday and Monday with the Special Group Parade.",
        "Salvador, in the state of Bahia, is often thought of as Brazil’s happiest city, and it’s easy to see why. The city is also commonly referred to as Brazil’s party city. The real draw, however, isn’t the abundance of great clubs and bars, but the Festa de Iemanja, the country’s biggest Afro-Brazilian festival, taking place in early February. The festival celebrates the goddess of the sea and fertility, Iemanja. The festivities begin early in the morning on the white sand beaches of Praia Rio Vermelho with traditional offerings, blessings, dozens of flowers, and events. The beach is then taken over by big bands and parties lasting well into the night. 2019’s Festa de Iemanja will take place on February 2nd.",
        "Parintins Folklore Festival, or often also called Festival do Boi-Bumbá, Bumba Meu Boi, or simply Festival, is a popular annual celebration during three days in late June held in the Brazilian city of Parintins, Amazonas.",
        "Festas Juninas, also known as festas de São João for their part in celebrating the nativity of St. John the Baptist, are the annual Brazilian celebrations adapted from European Midsummer that take place in the southern midwinter.",
        "Lollapalooza is an annual American four-day music festival held in Grant Park in Chicago. It originally started as a touring event in 1991, but several years later, Chicago became its permanent location. Music genres include alternative rock, heavy metal, punk rock, hip hop, and electronic dance music.",
        "Festival de Cachaça is dedicated to the national liquor; cachaça, made from sugarcane. Popular as Festival de Pinga, this festival is celebrated with samba performances, forro, and reggae. Food trucks are stationed from where one can taste authentic local food and shops are installed selling typical Paraty handicrafts and souvenirs. This festival is a great opportunity to taste and rejoice various varieties of cachaça.",
    )

    val testItemsList = List(8) {
        TestDataItem(
            id = it.toString(),
            url = imagesList[it],
            title = titlesList.getOrElse(it) { "Default Title" },
            description = descriptionsList.getOrElse(it) { "Default Description" }
        )
    }
}
