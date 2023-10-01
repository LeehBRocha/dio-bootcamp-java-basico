package projeto_smartv;
public class usuario {
    public static void main(String[] args) throws Exception {
        smartv smarTv = new smartv ();

        System.out.println("TV Ligada? " + smarTv.ligada);
        System.out.println("Qual o canal atual? " + smarTv.canal);
        System.out.println("Qual o volume atual? " + smarTv.volume);

        smarTv.ligar();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();
        smarTv.mudarCanal(10);

        System.out.println("NOVO STATUS - TV Ligada? " + smarTv.ligada);
        System.out.println("NOVO STATUS - Qual o volume atual? " + smarTv.volume);
        System.out.println("NOVO STATUS - Qual o volume atual? " + smarTv.volume);

        smarTv.desligar(); 

    }
}