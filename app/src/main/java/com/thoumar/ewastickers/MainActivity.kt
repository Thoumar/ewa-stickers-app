package com.thoumar.ewastickers

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.appindexing.FirebaseAppIndex
import com.google.firebase.appindexing.Indexable
import com.google.firebase.appindexing.builders.Indexables
import com.google.firebase.appindexing.builders.StickerBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FirebaseAppIndex.getInstance().update(Indexable.Builder("StickerPack")
            .setName("Ewa")
            .setUrl("ewastickers://sticker/pack/ewa")
            .setDescription("A sticker pack of Snoopy")
            .put("hasSticker",
                    Indexable.Builder("Sticker")
                            .setName("Sticker 1")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_1").toString())
                            .setDescription("Sticker 1")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 2")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_2").toString())
                            .setDescription("Sticker 2")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 3")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_3").toString())
                            .setDescription("Sticker 3")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 4")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_4").toString())
                            .setDescription("Sticker 4")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 5")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_5").toString())
                            .setDescription("Sticker 5")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 6")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_6").toString())
                            .setDescription("Sticker 6")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 7")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_7").toString())
                            .setDescription("Sticker 7")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 8")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_8").toString())
                            .setDescription("Sticker 8")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 9")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_9").toString())
                            .setDescription("Sticker 9")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 10")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_10").toString())
                            .setDescription("Sticker 10")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 11")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_11").toString())
                            .setDescription("Sticker 11")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 12")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_12").toString())
                            .setDescription("Sticker 12")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 13")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_13").toString())
                            .setDescription("Sticker 13")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 14")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_14").toString())
                            .setDescription("Sticker 14")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 15")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_15").toString())
                            .setDescription("Sticker 15")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 16")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_16").toString())
                            .setDescription("Sticker 16")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 17")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_17").toString())
                            .setDescription("Sticker 17")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 18")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_18").toString())
                            .setDescription("Sticker 18")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 19")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_19").toString())
                            .setDescription("Sticker 19")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 20")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_20").toString())
                            .setDescription("Sticker 20")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 21")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_21").toString())
                            .setDescription("Sticker 21")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 22")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_22").toString())
                            .setDescription("Sticker 22")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 23")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_23").toString())
                            .setDescription("Sticker 23")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 24")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_24").toString())
                            .setDescription("Sticker 24")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 25")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_25").toString())
                            .setDescription("Sticker 25")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 26")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_26").toString())
                            .setDescription("Sticker 26")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 27")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_27").toString())
                            .setDescription("Sticker 27")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 28")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_28").toString())
                            .setDescription("Sticker 28")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 29")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_29").toString())
                            .setDescription("Sticker 29")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 30")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_30").toString())
                            .setDescription("Sticker 30")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 31")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_31").toString())
                            .setDescription("Sticker 31")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 32")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_32").toString())
                            .setDescription("Sticker 32")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 33")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_33").toString())
                            .setDescription("Sticker 33")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 34")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_34").toString())
                            .setDescription("Sticker 34")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 35")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_35").toString())
                            .setDescription("Sticker 35")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 36")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_36").toString())
                            .setDescription("Sticker 36")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 37")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_37").toString())
                            .setDescription("Sticker 37")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 38")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_38").toString())
                            .setDescription("Sticker 38")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 39")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_39").toString())
                            .setDescription("Sticker 39")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 40")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_40").toString())
                            .setDescription("Sticker 40")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 41")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_41").toString())
                            .setDescription("Sticker 41")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 42")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_42").toString())
                            .setDescription("Sticker 42")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 43")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_43").toString())
                            .setDescription("Sticker 43")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 44")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_44").toString())
                            .setDescription("Sticker 44")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 45")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_45").toString())
                            .setDescription("Sticker 45")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 46")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_46").toString())
                            .setDescription("Sticker 46")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 47")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_47").toString())
                            .setDescription("Sticker 47")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 48")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_48").toString())
                            .setDescription("Sticker 48")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 49")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_49").toString())
                            .setDescription("Sticker 49")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 50")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_50").toString())
                            .setDescription("Sticker 50")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 51")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_51").toString())
                            .setDescription("Sticker 51")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 5")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_52").toString())
                            .setDescription("Sticker 52")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 53")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_53").toString())
                            .setDescription("Sticker 53")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 54")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_54").toString())
                            .setDescription("Sticker 54")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 55")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_55").toString())
                            .setDescription("Sticker 55")
                            .build(),
                    Indexable.Builder("Sticker")
                            .setName("Sticker 56")
                            .setImage(Uri.parse("android.resource://com.thoumar.ewastickers/drawable/sticker_56").toString())
                            .setDescription("Sticker 56")
                            .build(),
            ).build())
    }
}