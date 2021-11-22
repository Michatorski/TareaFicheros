package org.iesfm.ficheros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerUtils {
    static final Logger log = LoggerFactory.getLogger(Main.class);

    private static Scanner scanner = new Scanner(System.in);

    static String pideNombre() {
        log.info("Introduce tu nombre de usuario");
        return scanner.nextLine();
    }

    static File pidePath() throws IOException {
        log.info("Introduce la ruta al archivo de usuarios");
        File file = new File(scanner.nextLine());

        while (file.isDirectory()) {
            log.info("No puede ser un directorio, introduza el archivo");
            file = new File(scanner.nextLine());
        }

        file.createNewFile();

        return file;
    }
}
