package com.ug4.soal1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class inisialisasiPohonTest {
    @Test
    public void testMenuPohon() { // mengecek apakah program dapat menampilkan output sepeti pada ekspetasi string
        String input = "10\n10\n10\n10\n1\n1\n8\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set output stream untuk menangkap output program
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run method
        App.inisialisasiPohon();

        String expectedOutput = "========================================================\n" +
                "Pohon kehidupan\n" +
                "Mari menyiapkan pohon kehidupanmu\n" +
                "========================================================\n" +
                "Berapa banyak daun yang akan dimiliki: Berapa banyak akar yang akan tumbuh: Berapa banyak dahan yang akan dimiliki: Masa hidup pohon kamu adalah 10 tahun\n" +
                "Berapa umur mulai pohon kamu (tahun): Pohon kehidupan kamu sudah tumbuh\n" +
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
                "Pilihan kamu: Intip Pohonmu Yuk\n" +
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

        Assertions.assertEquals(expectedOutput, outputStream.toString().trim().replace("\r", ""));

    }
}
