package project.achsan.praktikum11.data

import com.google.firebase.Timestamp


data class Quote {
    var id: String? = null,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var date: Timestamp? = null

} : Parcelable