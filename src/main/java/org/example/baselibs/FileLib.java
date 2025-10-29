package org.example.baselibs;

import java.io.File;
import java.io.IOException;

public class FileLib {
    // Класс File используется для работы с файлами и директориями из java.io.File.
    // В современных проектах могут использовать API java.nio.file.

    private static final String FILE_NAME = "Test.txt";
    private static final String FILE_DIR = "C:\\Users\\exfue\\Desktop\\my_projects\\java-basics\\src\\test\\java";

    // 1 способ (директория и имя файла отдельно):
    public static File firstFile = new File(FILE_DIR, FILE_NAME);
    // 2 способ (весь путь целиком):
    public static File secondFile = new File(FILE_DIR + "\\" + FILE_NAME);
    // 3 способ (создать файл в директории):
    public static File directory = new File(FILE_DIR);
    public static File thirdFile = new File(directory, "NewTestFile.txt");

    public static void useFileMethods() {
        // Метод "getAbsolutePath" возвращает абсолютный путь до целевого файла от корневой директории.
        System.out.printf("Путь до файла firstFile: %s\n", firstFile.getAbsolutePath());
        // Методы "canWrite"/"canRead"/"canExecute" проверяют доступность файла для записи/чтения.
        System.out.printf(
                "\nФайл firstFile доступен для чтения/записи/исполнения?\nОтвет: %b/%b/%b\n",
                firstFile.canWrite(),
                firstFile.canRead(),
                firstFile.canExecute()
        );
        // Методы "exists" проверяет содержание файла на диске.
        System.out.printf("\nФайл thirdFile содержится на диске?\nОтвет: %b\n", thirdFile.exists());
        // Метод "getName" возвращает имя файла/директории.
        System.out.printf("\nИмя файла firstName - %s.\n", firstFile.getName());
        // Метод "getParent" возвращает путь к родительскому каталогу.
        System.out.printf("\nРодительский каталог для firstFile - %s.\n", firstFile.getParent());
        // Метод "getPath" возвращает путь к файлу (если был передан абстрактный, то вернет один в один).
        System.out.printf("\nПуть к файлу firstFile - %s.", firstFile.getPath());
        // Метод "lastModified" возвращает дату последнего изменения файла в миллисекундах.
        System.out.printf("\nПоследнее изменение firstFile было: %s.\n", firstFile.lastModified());
        // Метод "isFile" проверяет: является ли объект файлом?
        System.out.printf("\nЯвляется ли файл thirdFile файлом?\nОтвет: %b.\n", thirdFile.isFile());
        // Метод "isDirectory" проверяет: является ли объект каталогом?
        System.out.printf("\nЯвляется ли directory каталогом?\nОтвет: %b.\n", directory.isDirectory());
        // Метод "mkdir" создаст директорию по адресу, который был передан в конструкторе File, вернет boolean.
        // При создании впервые - вернет true, если уже существует - false.
        boolean isCreatedThirdFileDirectory = thirdFile.mkdir();
        System.out.printf("\nБыла ли создана директория для thirdFile?\nОтвет: %b.\n", isCreatedThirdFileDirectory);
        // Метод "delete" аналогичен "mkdir" только предназначен для удаления. Можно удалить только пустую.
        boolean isDeletedThirdFileDirectory = thirdFile.delete();
        System.out.printf("\nБыла ли создана директория для thirdFile?\nОтвет: %b.\n", isDeletedThirdFileDirectory);
        // Метод "length" возвращает размер файла в байтах.
        System.out.printf("\nРазмер файла firstFile (Test.txt) в байтах - %d.\n", firstFile.length());
        // Метод "createNewFile" создает новый файл (требует обработку исключений).
        boolean isCreatedThirdFile = false;
        try {
            isCreatedThirdFile = thirdFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\nБыл ли создан новый файл для thirdFile?\nОтвет: %b.\n", isCreatedThirdFile);
        // Метод "list" возвращает массив с именами файлов.
        String[] fileNames = directory.list();
        System.out.println("\nФайлы находящиеся по пути ...\\src\\test\\java:");
        for (var item : fileNames) {
            System.out.println(" " + "Файл - \"" + item + "\"");
        }
    }
}
