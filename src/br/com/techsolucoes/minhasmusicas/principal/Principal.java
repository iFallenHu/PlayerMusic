package br.com.techsolucoes.minhasmusicas.principal;
import br.com.techsolucoes.minhasmusicas.modelos.MinhasPreferidas;
import br.com.techsolucoes.minhasmusicas.modelos.Musica;
import br.com.techsolucoes.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever ");
        minhaMusica.setCantor("Kiss ");

        for (int i = 0; i < 2500; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev ");
        meuPodcast.setHost("Marcus Mendes ");

        for (int i = 0; i < 200; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 150; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
