package com.ug4.soal1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class inputMusimTest {
    @Test
    public void testInputMusim() {
        Pohon pohonKehidupan = new Pohon(10, 10, 10, 10);

        String input = "kemarau\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set output stream untuk menangkap output program
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run method
        App.inputMusim(pohonKehidupan);

        String expectedOutput = "Masukan musim apa sekarang (Kemarau, Penghujan, Dingin): Berhasil menambahkan musim untuk pohonmu\n" +
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
        Assertions.assertEquals(expectedOutput, outputStream.toString().trim().replace("\r",""));
        assertEquals("kemarau", pohonKehidupan.getMusim().getName());

    }
}
