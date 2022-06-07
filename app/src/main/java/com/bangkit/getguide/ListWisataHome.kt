package com.bangkit.getguide

object ListWisataHome {

    private val ListWisataDataLogo = intArrayOf(
        R.drawable.ic_baseline_beach_access_24,
        R.drawable.mount,
        R.drawable.boro,
        R.drawable.musium,
        R.drawable.taman
    )

    private val ListWisataDataTipe = arrayOf(
        "WISATA PANTAI",
        "PEGUNUNGAN DAN PEDESAAN",
        "SITUS HISTORI DAN RELIGIUS",
        "MUSIUM",
        "WISATA KOTA"
    )

    private val ListWisataDataPhoto = intArrayOf(
        R.drawable.pandawa,
        R.drawable.menganti,
        R.drawable.parangtritis,
        R.drawable.baron,
        R.drawable.kuta
    )

    private val ListWisataDataNames = arrayOf(
        "PANTAI PANDAWA",
        "PANTAI MENGANTI",
        "PANTAI PARANGTRITIS",
        "PANTAI BARON",
        "PANTAI KUTA"
    )

    private val ListWisataDataLokasi = intArrayOf(
        R.drawable.ic_baseline_location_on_24,
        R.drawable.ic_baseline_location_on_24,
        R.drawable.ic_baseline_location_on_24,
        R.drawable.ic_baseline_location_on_24,
        R.drawable.ic_baseline_location_on_24,
    )

    private val ListWisataDataAlamat = arrayOf(
        "Kuta selatan, Kabupaten Badung, Bali.",
        "Desa Karangduwur, Kecamatan Ayah, Kabupaten Kebumen, Jawa Tengah.",
        "Desa Parangtritis, Kapanéwon Kretek, Kabupaten Bantul, Daerah Istimewa Yogyakarta.",
        "Desa Kemadang, Kecamatan Tanjungsari, Kabupaten Gunungkidul, Daerah Istimewa Yogyakarta.",
        "kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia."
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

    val listData: ArrayList<ListHome>
        get() {
            var list = arrayListOf<ListHome>()
            for (position in ListWisataDataNames.indices){
                val listWisata = ListHome()
                listWisata.logo = ListWisataDataLogo[position]
                listWisata.tipe = ListWisataDataTipe[position]
                listWisata.name = ListWisataDataNames[position]
                listWisata.lokasi = ListWisataDataLokasi[position]
                listWisata.alamat = ListWisataDataAlamat[position]
                listWisata.photo = ListWisataDataPhoto[position]
                listWisata.rating1 = ListWisataDataRating1[position]
                listWisata.rating2 = ListWisataDataRating2[position]
                list.add(listWisata)
            }
            return list
        }
}