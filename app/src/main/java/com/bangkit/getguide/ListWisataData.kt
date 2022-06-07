package com.bangkit.getguide

object ListWisataData {

    private val ListWisataDataNames = arrayOf(
        "PANTAI PANDAWA",
        "PANTAI MENGANTI",
        "PANTAI PARANGTRITIS",
        "PANTAI BARON",
        "PANTAI KUTA"
    )

    private val ListWisataDataAlamat = arrayOf(
        "Kuta selatan, Kabupaten Badung, Bali.",
        "Desa Karangduwur, Kecamatan Ayah, Kabupaten Kebumen, Jawa Tengah.",
        "Desa Parangtritis, Kapanéwon Kretek, Kabupaten Bantul, Daerah Istimewa Yogyakarta.",
        "Desa Kemadang, Kecamatan Tanjungsari, Kabupaten Gunungkidul, Daerah Istimewa Yogyakarta.",
        "kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia."
    )

    private val ListWisataDataPhoto = intArrayOf(
        R.drawable.pandawa,
        R.drawable.menganti,
        R.drawable.parangtritis,
        R.drawable.baron,
        R.drawable.kuta
    )

    private val ListWisataDataRating1 = arrayOf(
        "4.6",
        "4.6",
        "4.6",
        "4.6",
        "4.6"
    )

    private val ListWisataDataRating2 = intArrayOf(
        R.drawable.ic_baseline_star_rate_24,
        R.drawable.ic_baseline_star_rate_24,
        R.drawable.ic_baseline_star_rate_24,
        R.drawable.ic_baseline_star_rate_24,
        R.drawable.ic_baseline_star_rate_24
    )

    val listData: ArrayList<ListWisata>
    get() {
        var list = arrayListOf<ListWisata>()
        for (position in ListWisataDataNames.indices){
            val listWisata = ListWisata()
            listWisata.name = ListWisataDataNames[position]
            listWisata.alamat = ListWisataDataAlamat[position]
            listWisata.photo = ListWisataDataPhoto[position]
            listWisata.rating1 = ListWisataDataRating1[position]
            listWisata.rating2 = ListWisataDataRating2[position]
            list.add(listWisata)
        }
        return list
    }
}