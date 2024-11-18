public class Skytale {
    

    // Erste Aufgabe wandelt Text in ein char um
    private static char[][] zeilenweiseInRasterSchreiben(String text) {
        char[][] raster = new char[4][7];
        for (int i = 0; i < text.length(); i++) {
            raster[i / 7][i % 7] = text.charAt(i);
        }
        return raster;
    }
    
    
    

    //Teil zwei
    private static String rasterSpaltenweiseAblesen(char[][] array) {
        String result = "";
        int zeilen = array.length;
        int spalten = array[0].length;
    
        for (int spalte = 0; spalte < spalten; spalte++) {
            for (int zeile = 0; zeile < zeilen; zeile++) {
                result = result + array[zeile][spalte];
            }
        }
        return result;

       
        
        }

        //ruft Methode auf
        // wird in Array geschrieben
        // Vergiss nicht daas ist Ausgabe 3
        
        private static String verschluesseln(String text) {
            char[][] raster = zeilenweiseInRasterSchreiben(text);
            return rasterSpaltenweiseAblesen(raster);
        }
        
        
    }
    

