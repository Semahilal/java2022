public class Mini_Proje2 {
        public static void main(String[] args) {
            char harf = 'e';

            switch(harf){
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın Sesli Harf");
                    break;
                default:
                    System.out.println("İnce Sesli harf");
            }
        }
}
