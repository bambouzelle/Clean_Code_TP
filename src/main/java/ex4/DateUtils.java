package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * Formate une date selon le modèle spécifié. Si aucun modèle n'est fourni,
     * utilise un modèle par défaut.
     */
    public static String format(Date date, String pattern) {
        if (pattern == null || pattern.isEmpty()) {
            pattern = "dd/MM/yyyy HH:mm:ss"; // Modèle par défaut
        }
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    // Formate une date en utilisant le modèle par défaut "dd/MM/yyyy HH:mm:ss".

    public static String formatDefaut(Date date) {
        return format(date, "dd/MM/yyyy HH:mm:ss");
    }
}

