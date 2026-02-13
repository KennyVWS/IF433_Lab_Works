package oop_00000136177_KennyValentWinaldaSembiring.week02

class student ( new*
        val name:String,
        val nim:String,
        val major:String
) { new*
        init { new*
        if(nim.length != 5 ) {
                println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
                println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        }else {
                println("LOG: Objek Student $name berhasil dialokasikan di memory.")
                }
        }
}