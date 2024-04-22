package bertoti;

public class SpotifyTest {

    public static void main(String[] args) {
        testGetters();
    }

    public static void testGetters() {
        // Cria uma instância de Spotify para teste
        Spotify spotify = new Spotify("Imagine", 123, 1);

        // Testa o método getMusica()
        if (spotify.getMusica().equals("Imagine")) {
            System.out.println("Teste getMusica(): PASSOU");
        } else {
            System.out.println("Teste getMusica(): FALHOU");
        }

        // Testa o método getUsuario()
        if (spotify.getUsuario() == 123.45) {
            System.out.println("Teste getUsuario(): PASSOU");
        } else {
            System.out.println("Teste getUsuario(): FALHOU");
        }

        // Testa o método getPlaylist()
        if (spotify.getPlaylist() == 1) {
            System.out.println("Teste getPlaylist(): PASSOU");
        } else {
            System.out.println("Teste getPlaylist(): FALHOU");
        }
    }
}

