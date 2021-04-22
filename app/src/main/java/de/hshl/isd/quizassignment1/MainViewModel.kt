package de.hshl.isd.quizcompose

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val questions = listOf(
        Pair("Das Videospiel Donkey Kong sollte ursprünglich Popeye als Hauptfigur haben.", true),
        Pair("Die Farbe Orange wurde nach der Frucht benannt.", true),
        Pair("In der griechischen Mythologie ist Hera die Göttin der Ernte.", false),
        Pair("Liechtenstein hat keinen eigenen Flughafen.", true),
        Pair("Die meisten Subarus werden in China hergestellt.", false)
    )

    // TODO: Implement the ViewModel
}
