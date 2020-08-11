package com.dicoding.picodiploma.laligasantander

object ClubData {
    private val clubNames = arrayOf(
        "Atlético de Madrid",
        "FC Barcelona",
        "Getafe CF",
        "RCD Espanyol",
        "Real Betis",
        "Real Madrid C.F.",
        "Sevilla FC",
        "Real Sociedad",
        "Valencia C.F",
        "Villareal CF"
    )

    private val clubLogo = intArrayOf(
        R.drawable.atm,
        R.drawable.barca,
        R.drawable.getafe,
        R.drawable.espanyol,
        R.drawable.betis,
        R.drawable.real,
        R.drawable.sevilla,
        R.drawable.sociedad,
        R.drawable.valencia,
        R.drawable.villareal
    )

    private val clubDetails = arrayOf(
        "Atlético de Madrid adalah tim sepak bola Spanyol yang bermain di La Liga Santander. Bermarkas di Madrid. Tim yang berdiri tahun 1903 memiliki prestasi yang baik dipercaturan sepak bola Spanyol. Klub ini juga memiliki rivalitas dengan tetangganya Real Madrid, yang dikenal dengan Derbi Madrid.",
        "Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol. Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\".",
        "Getafe CF adalah nama tim sepak bola Spanyol. Bermarkas di Madrid. Tim ini berdiri tahun 1983. Klub ini memainkan pertandingan di Stadion Coliseum Alfonso Pérez yang berkapasitas 16.000 penonton.",
        "Reial Club Deportiu Espanyol de Barcelona, S.A.D. adalah sebuah klub sepak bola Spanyol yang bermain di La Liga Spanyol. Klub ini adalah rival sekota FC Barcelona. Periquitos bermarkas di Estadi Olímpic Lluís Companys, Barcelona, Spanyol. Seragam mereka berwarna biru-putih. ",
        "Real Betis Balompié, S.A.D., mengarah ke Betis merupakan tim sepak bola profesional yang berbasis di Sevilla. Real Betis Balompié bermain di La Liga dan menempati posisi ke-10 dalam klasifikasi historik liga Spanyol, sampai tahun 2007 telah mengikuti 45 kali musim kompetisi Divisi I, meraih 3 gelar juara resmi, 1 gelar juara liga, 2 gelar juara Piala Raja Spanyol dan 4 kali tampil sebagai finalis Piala raja.",
        "Real Madrid Club de Fútbol adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (\"dari kerajaan\") Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub.",
        "Sevilla FC adalah nama tim sepak bola Spanyol. Berbasis di Sevilla. Tim ini didirikan tahun 1890. Sevilla hanya sekali menjuarai Liga Spanyol (La Liga), yaitu pada tahun 1946. Pada tahun 2006 mereka menjuarai Piala UEFA pertama mereka setelah mengalahkan Middlesbrough F.C. 4-0 di final dan di ajang Piala Super Eropa mereka bisa menjuarainya untuk pertama kali dalam sejarah mereka dengan mengalahkan FC Barcelona 3-0.",
        "Real Sociedad de Fútbol  adalah sebuah klub sepak bola Spanyol yang berbasis di kota San Sebastián, Basque, didirikan pada 7 September 1909. Stadion kandang mereka adalah Anoeta, yang berkapasitas 32.200 penonton. Prestasi Real Sociedad di La Liga adalah menjadi juara pada tahun 1980-81 dan 1981-82, serta terakhir kali menjadi juara kedua pada tahun 2002-03.",
        "Valencia Club de Fútbol merupakan sebuah klub sepak bola Spanyol yang bermain di Divisi Primera Spanyol, La Liga. Tim ini bermarkas di Valencia, Spanyol. Didirikan pada tahun 1919.",
        "Villarreal CF adalah nama tim sepak bola Spanyol yang bermarkas di kota Villarreal. Tim ini berdiri pada tahun 1932 dengan stadion kandang di El Madrigal."
    )

    private val clubGround = arrayOf(
        "Metropolitano Stadium",
        "Camp Nou",
        "Coliseum Alfonso Pérez",
        "RCDE Stadium",
        "Estadio Benito Villamarín",
        "Estadio Santiago Bernabéu",
        "Estadio Ramón Sánchez Pizjuán",
        "Anoeta",
        "Mestalla",
        "Estadio de la Cerámica"
    )
    private val clubCoach = arrayOf(
        "Diego Simeone",
        "Quique Setién",
        "José Bordalás",
        "Vicente Moreno",
        "Manuel Pellegrini",
        "Zinadine Zidane",
        "Julen Lopetegui",
        "Imanol Alguacil",
        "Javi Gracia",
        "Unai Emery"
    )

    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices) {
                val club = Club()
                club.name = clubNames[position]
                club.photo = clubLogo[position]
                club.detail = clubDetails[position]
                club.ground = clubGround[position]
                club.coach = clubCoach[position]
                list.add(club)
            }
            return list
        }
}