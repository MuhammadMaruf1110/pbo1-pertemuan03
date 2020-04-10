package percabangkan;

public class switch1 {
    public  static void main(String[] args) {
        char pekerjaan='A';
        switch (pekerjaan) {
            case 'A':
                System.out.println("Pegawai : \"Terima kasih\"");
                System.out.println("Bos     : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Pegawai : \"kenapa saya anda beri hadiah ini untuk saya, pak?\"");
                System.out.println("Bos     : \"karena menurut saya anda berhak mendapatkan nya\"");
                break;
            case 'C':
                System.out.println("Pegawai : \"boleh tau, apa yang saya telah perbuat sehingga anda memberikan ini kepada saya\"");
                System.out.println("Bos     : \"karena menurut saya pekerjaan anda sangat bagus dan anda juga seorang yang rajin dan tekun\"");
                System.out.println("Pegawai : \"makasih ya pak atas hadiah ini\"");
                break;
            case 'D':
                System.out.println("Bos     : \"iya sama sama,terus semangat dalam bekerja dan jangan pantang menyerah ya\"");
                System.out.println("Pegawai : \"Oke pak, saya akan selalu bekerja sesuai perintah yang anda berikan\"");
                System.out.println("Bos     : \iya, kembali ketempat ruanganmu dan kembali bekerja\"");
                System.out.println("Pegawai : \"iya pak, siap laksanakan\"");
                break;
        }
    }
}
