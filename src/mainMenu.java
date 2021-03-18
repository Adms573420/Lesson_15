public class mainMenu {
    public static void main(String[] args) {
      /*  //int sonuc= cember.Cevre(3,5);
        // System.out.println("Cemberin cevresi: "+sonuc);

        // int cevap=cember.Alan(3,5);
        //  System.out.println("Cemberin Alanı:"+cevap);

        Cember cember = new Cember();
        cember.yarıcap = 5;
        cember.pi = 3;
        int alan_cember = cember.AlanHesapla();
        int cevre_cember=cember.CevreHesapla();

        System.out.println("Cemberin alanı: " + alan_cember);
        System.out.println("Cemberin cevre: " + cevre_cember);

        Kare kare=new Kare();
        kare.kenar_uzunlugu=10;
        int cevre_kare=kare.CevreHesapla();
        int alan_kare=kare.AlanHesapla();
        System.out.println("Karenin alanı: "+alan_kare);
        System.out.println("Karenin cevresi: "+cevre_kare);

        Dikdörtgen dikdörtgen=new Dikdörtgen();
        dikdörtgen.uzun_kenar=15;
        dikdörtgen.kısa_kenar=10;

        int cevre_dikdortgen=dikdörtgen.CevreHesapla();
        int alan_dikdörtgen=dikdörtgen.AlanHesapla();

        System.out.println("Dikdortgenin alanı: "+alan_dikdörtgen);
        System.out.println("Dikdortgenin cevresi: "+cevre_dikdortgen);
        */
       Bilgisayar bilgisayar1=new Bilgisayar(2,"i3",15);
       Bilgisayar bilgisayar2=new Bilgisayar(4,"i5",15);
       Bilgisayar bilgisayar3=new Bilgisayar(6,"i5",14);
       Bilgisayar bilgisayar4=new Bilgisayar(8,"i3",12);
       Bilgisayar bilgisayar5=new Bilgisayar(8,"i7",13);

       int[] array={bilgisayar1.ekran_kartı,bilgisayar2.ekran_kartı,bilgisayar3.ekran_kartı,bilgisayar4.ekran_kartı,bilgisayar5.ekran_kartı};

        for (int i = 0; i <array.length ; i++) {
            if(array[i]>13){
                System.out.println("Ekran Kartı 13 ten buyuk olanlar: "+(i+1));
            }
            
        }


    }
}
