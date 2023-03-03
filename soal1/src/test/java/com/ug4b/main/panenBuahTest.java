package com.ug4.soal1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class panenBuahTest {
    @Test
    public void testPanenBuahTestMusimBelumAda() { //panen buah jika musimnya belum disetting
        //set inputan
        String input = "4\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        //test case 1, siapkan objek yang akan dibuat
        Pohon pohonKehidupan = new Pohon(10, 10, 10, 10);

        // set output stream untuk menangkap output program
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run method
        App.panenBuah(pohonKehidupan);

        String expectedOutput = "Maaf kamu belum mengatur musim apa yang akan berlangsung untuk pohon kehidupanmu\n" +
                "Atur musim dulu gih\n" +
                "\n" +
                "\n" +
                "\n" +
                "========================================================\n" +
                "Pohon kehidupan\n" +
                "Atur Pohon kamu agar menjadi pohon yang bermanfaat\n" +
                "========================================================\n" +
                "\n" +
                "1. Tampilkan informasi pohon\n" +
                "2. Masukan musim sekarang\n" +
                "3. Panen buah\n" +
                "4. Keluar\n" +
                "Pilihan kamu: Makasih sudah membuat pohon kehidupan\n" +
                "Sampai jumpa dilain waktu";
        assertEquals(expectedOutput, outputStream.toString().trim().replace("\r",""));

        boolean isMusimSet = true;
        if(pohonKehidupan.getMusim() == null){
            isMusimSet = false;
        }
        assertFalse(isMusimSet);


        //test case 2, jika musim sudah di atur menjadi kemarau
        Pohon pohonKehidupan2 = new Pohon(10, 10, 10, 10);
        Musim kemarau = new Musim("kemarau",10);
        pohonKehidupan2.setMusim(kemarau);

        // set output stream untuk menangkap output program
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream2));

        // run method
        App.panenBuah(pohonKehidupan2);

        String expectedOutput2 = "========================================================\n" +
                "Ayo panen buahnya\n" +
                "Tanggal musim : March 2, 2023\n" +
                "Tanggal hari ini : March 2, 2023\n" +
                "Tanggal panen: March 3, 2023\n" +
                "Hari sebelum masa panen: 1 hari\n" +
                "\n" +
                "Pohon kamu akan berbuah Apelsetiap  hari dan kamu dapat memetik buah tersebut dalam 7 hari sebelum buah Apel busuk\n" +
                "========================================================\n" +
                "\n" +
                "\n" +
                "\n" +
                "========================================================\n" +
                "Pohon kehidupan\n" +
                "Atur Pohon kamu agar menjadi pohon yang bermanfaat\n" +
                "========================================================\n" +
                "\n" +
                "1. Tampilkan informasi pohon\n" +
                "2. Masukan musim sekarang\n" +
                "3. Panen buah\n" +
                "4. Keluar\n" +
                "Pilihan kamu: Makasih sudah membuat pohon kehidupan\n" +
                "Sampai jumpa dilain waktu";
        assertEquals(expectedOutput2, outputStream2.toString().trim().replace("\r",""));
        assertEquals("kemarau", pohonKehidupan2.getMusim().getName());
    }
}
