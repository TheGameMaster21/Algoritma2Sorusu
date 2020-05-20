package avp2sorusu;

public class AvP2Sorusu {

    public String kelime1;
    private String kelime2;
    public String cümle;
    public char c;
    
    
     public static String sesli(String word) {

        String[] ses = {"a", "e", "ı", "i", "o", "ö", "u", "ü"};
        String tut = "";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < ses.length; j++) {
                if (word.charAt(i) == ses[j].charAt(0)) {
                    tut += word.charAt(i);
                }
            }
        }

        return tut;

    }
    
    public static String sesli(String word1,String word2)
    {
         String[] ses = {"a", "e", "ı", "i", "o", "ö", "u", "ü"};
        String tut = "";
        String word =word1+word2;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < ses.length; j++) {
                if (word.charAt(i) == ses[j].charAt(0)) {
                    tut += word.charAt(i);
                }
            }
        }

        return tut;
    }
   

    public static void sessiz(String kelime) {

        String[] sessiz = {"b", "c", "ç", "d", "f", "g", "ğ", "h", "j", "k", "l", "m", "n", "p", "r", "s", "ş", "t", "v", "y", "z"};
        String tut = "";
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < sessiz.length; j++) {
                if (kelime.charAt(i) == sessiz[j].charAt(0)) {
                    tut += kelime.charAt(i);
                }
            }
        }
        System.out.println("Sessiz harfler : "+tut);

    }

    private static void encokharfbul(String kelime, String kelime1) {
        int sayi = 0;
        int encokkactane = 0;
        int index = 0;
        for (int i = 0; i < kelime.length(); i++) {
            sayi = 0;
            for (int j = 0; j < kelime.length(); j++) {
                if (kelime.charAt(i) == kelime.charAt(j)) {
                    sayi++;
                }
            }
            if (sayi > encokkactane) {
                encokkactane = sayi;
                index = i;
            }
        }
        if (kelime.charAt(index) == ' ') {
            System.out.println("İlk kelimede en çok kullanılan harf: boşluk");
            System.out.println("Harfin tekrar sayısı:" + encokkactane);
        } else {
            System.out.println("İlk kelimede en çok kullanılan harf:" + kelime.charAt(index));
            System.out.println("Harfin tekrar sayısı:" + encokkactane);
        }

        int sayi1 = 0;
        int encok = 0;
        int index1 = 0;
        for (int i = 0; i < kelime1.length(); i++) {
            sayi1 = 0;
            for (int j = 0; j < kelime1.length(); j++) {
                if (kelime1.charAt(i) == kelime1.charAt(j)) {
                    sayi1++;
                }
            }
            if (sayi1 > encok) {
                encok = sayi1;
                index1 = i;
            }
        }
        if (kelime1.charAt(index1) == ' ') {
            System.out.println("İkinci kelimede en çok kullanılan harf: boşluk");
            System.out.println("Harfin tekrar sayısı:" + encok);
        } else {
            System.out.println("İkinci kelimede en çok kullanılan harf:" + kelime1.charAt(index1));
            System.out.println("Harfin tekrar sayısı:" + encok);
        }
    }

    public static void main(String[] args) {

        AvP2Sorusu soru = new AvP2Sorusu();

        soru.kelime1 = "naber  dostum";
        soru.kelime2 = "merhaba dünya";
        

        System.out.println("Sesli Harfler : "+sesli(soru.kelime1));
        

        sessiz(soru.kelime2);
        
        encokharfbul(soru.kelime1, soru.kelime2);

        System.out.println("Polimorfizm örneği : "+sesli(soru.kelime1,soru.kelime2));
    }

}

class AvP2Sorusu1 extends AvP2Sorusu {

    public static String sırala(String kelime3) {

        String[] sessiz = {"a", "b", "c", "ç", "d", "e", "f", "g", "ğ", "h", "ı", "i", "j", "k", "l", "m", "n", "o", "ö", "p", "r", "s", "ş", "t", "u", "ü", "v", "y", "z"};
        String tut = "";
        for (int i = 0; i < sessiz.length; i++) {
            for (int j = 0; j < kelime3.length(); j++) {
                if (kelime3.charAt(j) == sessiz[i].charAt(0)) {
                    tut += kelime3.charAt(j) + " ";
                }
            }
        }
        return tut;

    }

    public static int index(char c) {
        int sonuc = 0;
        String alfabe="abcçdefgğhıijklmnoçprsştuüvyz";
        for(int i=0;i<alfabe.length();i++)
        {
            if (alfabe.charAt(i)==c)
            {
                 sonuc=i;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        AvP2Sorusu nesne = new AvP2Sorusu1();
        nesne.cümle = "ramazan bayramınız kutlu olsun";
        nesne.c='a';
        System.out.println("harf indexi : "+(index(nesne.c)+1));
        System.out.println("Metnin harflerinin sıralı hali : " + sırala(nesne.cümle));
        
        
        
    }

}
