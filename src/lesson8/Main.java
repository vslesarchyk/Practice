package lesson8;
//Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
//        Использовать Reader, Writer
//1. Записать его в файл прописал относительный путь.
//2. Записать его в файл прописав абсолютный путь.
//3. Вычитать текст из первого файла.
//4. Вычитать текст из второго файла
//5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)
//
//1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 5 случайных целых чисел и выводит на экран. Потоки решать двумя способоами через класс Thread и интерфейс Runnable


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
    }


    public static void first() {
        File file = new File("File.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e) {
            System.out.println("какой-то текст");
        }
    }

    public static void second() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("С:\\Users\\VeroNiKA\\Desktop\\File.txt");
            //fileReader.read();
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
        }
    }

    public static void third() {
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 11);
        ArrayList ferms = new ArrayList<>();
        ferms.add(ferma1);
        ferms.add(ferma2);
        try
                (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream
                        ("FileSerialized"))) {
            FileOutputStream fos = new FileOutputStream("FileSerialized");
            ObjectOutputStream a1 = new ObjectOutputStream(fos);
            a1.writeObject(ferms);
            a1.writeObject(ferma1);
            a1.writeObject(ferma2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void fourth () {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileSerialized"))) {
                FileInputStream fis = new FileInputStream("FileSerialized");
                ObjectInputStream a = new ObjectInputStream(fis);
                System.out.println(objectInputStream.readObject());
                List<Ferma> returnListFerma = (List<Ferma>) objectInputStream.readObject();
                returnListFerma.get(0);
                System.out.println(objectInputStream.readObject());
                System.out.println(objectInputStream.readObject());
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
