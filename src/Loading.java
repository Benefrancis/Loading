import java.io.IOException;

public class Loading {

    public static void main(String[] args) throws IOException, InterruptedException {

            //Limpa a tela no windows, no linux e no MacOS
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear").waitFor();

        int percentual = 10;

        while (percentual <= 100) {
            loading(percentual);
            Thread.sleep(500);
            percentual++;
            //Limpa a tela no windows, no linux e no MacOS
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear").waitFor();
        }

    }

    private static void loading(int percentual) throws IOException, InterruptedException {
        char a = '\u2591';
        char b = '\u2593';
        System.out.print(String.valueOf(b).repeat(percentual ));
        System.out.print(String.valueOf(a).repeat(100 - percentual) + System.lineSeparator());
        System.out.println(" ".repeat(percentual - 1) + percentual + "%");
    }
}
