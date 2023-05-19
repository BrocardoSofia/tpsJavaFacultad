import modelo.Serie;
import modelo.Videojuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Serie> series = new ArrayList<>();
        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        int seriesEntregadas=0;
        int videojuegosEntregados=0;
        int masHoras=0;
        int masTemporadas=0;
        int posSerieConMasTemporadas=0;
        int posVideojuegoMasHoras=0;

        series.add(new Serie("The office", "Warner", 10, "Comedia"));
        series.add(new Serie("Friends", "Warner", 10, "Comedia"));
        series.add(new Serie("Loki", "Disney", 1, "Drama"));
        series.add(new Serie("Los Simpsons", "Fox", 34, "Comedia"));
        series.add(new Serie("Modern family", "Fox", 11, "Comedia"));

        videojuegos.add((new Videojuego("The last of us", 40, "Accion", "Sony")));
        videojuegos.add(new Videojuego("Minecraft", 1000, "Mundo Abierto", "Microsoft"));
        videojuegos.add(new Videojuego("Ori", 50, "Plataforma", "Moon"));
        videojuegos.add(new Videojuego("Buscaminas", 2, "2d", "Microsoft"));
        videojuegos.add(new Videojuego("GTA V", 60, "Accion", "RockStar"));

        videojuegos.get(2).entregar();
        videojuegos.get(4).entregar();
        series.get(0).entregar();
        series.get(3).entregar();
        series.get(4).entregar();

        System.out.println("SERIES:");
        for(int i=0; i<5; i++) {
            System.out.println(series.get(i) + "\n------------------------------\n");
            if(series.get(i).isEntregado())
            {
                seriesEntregadas++;
                series.get(i).devolver();
            }
            if(series.get(i).getNroTemporadas()>masTemporadas) {
                posSerieConMasTemporadas = i;
                masTemporadas = series.get(i).getNroTemporadas();
            }
        }
        System.out.println("\n\nSeries Entregadas: "+seriesEntregadas+"\n\n");

        System.out.println("VIDEOJUEGOS");
        for(int i=0; i<5; i++) {
            System.out.println(videojuegos.get(i) + "\n------------------------------\n");
            if(videojuegos.get(i).isEntregado())
            {
                videojuegosEntregados++;
                videojuegos.get(i).devolver();
            }
            if(videojuegos.get(i).getHorasEstimadas()>masHoras) {
                posVideojuegoMasHoras = i;
                masHoras = videojuegos.get(i).getHorasEstimadas();
            }
        }
        System.out.println("\n\nVideojuegos Entregados: "+seriesEntregadas+"\n\n");

        System.out.println("\n\nSerie con mas temporadas: ");
        System.out.println(series.get(posSerieConMasTemporadas));

        System.out.println("\n\nVideojuego con mas horas estimadas: ");
        System.out.println(videojuegos.get(posVideojuegoMasHoras));
    }
}