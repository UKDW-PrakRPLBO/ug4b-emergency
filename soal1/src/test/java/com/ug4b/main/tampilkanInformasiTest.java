package com.ug4.soal1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



public class tampilkanInformasiTest {
    @Test
    public void testTampilkanInformasi() {
        Pohon pohonKehidupan = new Pohon(10, 10, 10, 10);

        // set stream input
        // input akan mengetest semua percabangan If,Else if, Else
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set output stream untuk menangkap output program
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run method
        App.tampilkanInformasi(pohonKehidupan);

        //ekspetasi hasil
        String expectedOutput = "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Jumlah daun pohon kamu sebanyak 10 helai\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Jumlah akar pohon kamu sebanyak 10 akar\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Jumlah dahan pohon kamu sebanyak 10 buah dahan\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Umur pohon kamu sekarang 10 tahun\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Rentang masa hidup pohon kamu selama 10 tahun\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Maaf kamu belum mengatur musim apa yang akan berlangsung untuk pohon kehidupanmu\n" +
                "Atur musim dulu gih\n" +
                "\n" +
                "\n" +
                "\n" +
                "Intip Pohonmu Yuk\n" +
                "1. Tampilkan jumlah daun\n" +
                "2. Tampilkan jumlah akar\n" +
                "3. Tampilkan jumlah dahan\n" +
                "4. Tampilkan umur pohon kamu sekarang\n" +
                "5. Tampilkan rentang hidup pohon kamu\n" +
                "6. Tampilkan musim apa sekarang\n" +
                "7. Tampilkan berapa banyak buah yang sudah dipanen\n" +
                "8. Kembali\n" +
                "Pilihan kamu: \n" +
                "Kamu sudah memanen sebanyak 0 buah emtpy saat ini";

        Assertions.assertEquals(expectedOutput, outputStream.toString().trim().replace("\r",""));
        Assertions.assertEquals(10, pohonKehidupan.getDaun());
        Assertions.assertEquals(10, pohonKehidupan.getAkar());
        Assertions.assertEquals(10, pohonKehidupan.getDahan());
        Assertions.assertEquals(10, pohonKehidupan.getUmur());

    }
}
