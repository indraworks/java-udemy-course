package _01_a_Variable;

public class _01_FormatPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String barang ="keripik apple";
      int harga = 12550;
      System.out.printf("harga %20s =%8d%n",barang,harga);
      //harga tulisan harga  %20s mewakili urut variable string barang uurtan pertama
      //20 adalah positif sebanyuak 20 space character sting makan ruang 
      //utk %8d mewakili variable harga yg diinputkan ,angka 8 stlah % adalah positif
      //ambil ruang sbganyak 8 character kekanan positf 
      //utk notasi n mewakili 
      
      //1.% d integer decimal 
      //utk gunakana format intger angka didepan % adalah utk ambil character ruang! 
      System.out.println();
      System.out.printf("integer number %d%n",356);
      
      //2.%f flaoting number utk cetak angka decimal 
      System.out.println();
      System.out.printf("desimal number tanpa format %f%n",35.3498);
      
      //3.%.2 f flaoting number utk cetak angka decimal 
      //dgn dot dua atau .2 stlah % artinya 2 digit saja dibelakang koma fix!
      System.out.println();
      System.out.printf("desimal number %.2f%n",779.3498223);
      
      //10. Width and Alignment
      //You can specify the width and alignment of the output using numbers before the format specifier:

      //%5d: Right-aligns within a 5-character field.
      //%-5d: Left-aligns within a 5-character field.
      
      System.out.println();
      System.out.printf("ALign sisi-kanan  %5d%n",1230);
      System.out.printf("ALign sisi-kiri  %-5d%n",1230);
      
	}

}

/*
pada printf formatnya ada semacam begini :
System.out/prifntF("format string"[,arg1,arg2,...]) 
utk argument pertama printf mengandung format sgabi berikut:
formatnya : % [tanda] [lebar] [.prsisi] 
%[tanda] [lebar][.prsisi] karakter-konversi 
tanda didepan [] ini adalah format optionalnya  format tsb bisa ditulis + atau - ,nol,koma,spasi 

-tanda:
ukt tanda +  : bilangan yg ditampilkan akan ada tanda plus atau minus 
    tanda - : pengaturan rata kiri 
    Nol : bilanga akan diawali dgn sejumlah angaka nol kalau ruang yg disediakan masih tersisia.
          bawaaanya /defaul ruang sisa akan disi spasi 
    koma : bilangan akan dilengkapi dgn pemisah ribuan 
    spasi: jika bil positif maka bilangan akan diawali dgn 1 spasi 
           kalau negatif tanda negafif akan ditampilkan.
                 
-lebar :
        menyatakan ruang minumun yg akan di sesdiakan utk tampilkan data,
-presisi:utk tampilkan jumlah digit pecahan 

-karakter-konversi :
    tanda d: utk tampilkan bil buat 
    tanda s:utk tampilkan strung 
    tana f:utk tampilkan angka dec pecahan/koma 
    tanda c utk tampilkan 1 karater utk C utk huruf kapital 
    tanda h: utk kode hash
    tanda n :nyatakan pindah baris 
    ada pada sheet pdf yg dibantu oleh chatgpt utk format!
    

*/