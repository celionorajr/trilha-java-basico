public class Usuario {
    public static void main(String[] args)  {
        
        SmartTv smarttv = new SmartTv();

        System.out.println("A Smart TV está ligada? " + smarttv.ligada);
        System.out.println("Canal: " + smarttv.canal);
        System.out.println("Volume: " + smarttv.volume);

        smarttv.ligar();
        smarttv.aumentarVolume();
        System.out.println("A Smart TV está ligada? " + smarttv.ligada);
        System.out.println("Volume: " + smarttv.volume);
        smarttv.mudarCanal(10);
        System.out.println("Canal: " + smarttv.canal);
        smarttv.aumentarCanal();
        System.out.println("Canal: " + smarttv.canal);
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();
        System.out.println("Canal: " + smarttv.canal);

    }
}
