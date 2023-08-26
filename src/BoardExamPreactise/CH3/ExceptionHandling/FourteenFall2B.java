package BoardExamPreactise.CH3.ExceptionHandling;

import java.util.Scanner;

public class FourteenFall2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Input is not an integer.");
        }
    }
}

/*
 * In Java, the concept of streams is a fundamental part of the Java I/O
 * (Input/Output) system, which allows you to read from or write to different
 * data sources or destinations. Streams provide an abstract view of data that
 * can be of any type, making it easy to perform I/O operations regardless of
 * the underlying source or destination. There are two main types of streams:
 * byte streams and character streams. Let's explore various stream classes
 * available in Java for both types:
 * 
 * Byte Streams:
 * 
 * InputStream and OutputStream: These are the abstract base classes for reading
 * and writing bytes, respectively. They provide the foundation for other byte
 * stream classes.
 * 
 * FileInputStream and FileOutputStream: These classes allow reading from and
 * writing to files as streams.
 * 
 * ByteArrayInputStream and ByteArrayOutputStream: These classes deal with
 * reading from and writing to byte arrays in memory.
 * 
 * BufferedInputStream and BufferedOutputStream: These classes add buffering
 * functionality to input and output streams, which improves performance by
 * reducing the number of physical read and write operations.
 * 
 * DataInputStream and DataOutputStream: These classes provide methods for
 * reading and writing primitive data types as binary values.
 * 
 * ObjectInputStream and ObjectOutputStream: These classes enable serialization
 * and deserialization of Java objects, allowing objects to be written to
 * streams and then reconstructed from streams.
 * 
 * Character Streams:
 * 
 * Reader and Writer: These are the abstract base classes for reading and
 * writing characters, respectively.
 * 
 * FileReader and FileWriter: These classes provide character-based I/O
 * operations for reading from and writing to files.
 * 
 * CharArrayReader and CharArrayWriter: These classes allow reading from and
 * writing to character arrays in memory.
 * 
 * BufferedReader and BufferedWriter: Similar to their byte stream counterparts,
 * these classes add buffering capabilities to character streams.
 * 
 * InputStreamReader and OutputStreamWriter: These classes bridge byte streams
 * and character streams by converting bytes to characters using a specified
 * character encoding.
 * 
 * PrintWriter: This class provides methods for writing formatted text to
 * character output streams.
 * 
 * StringReader and StringWriter: These classes allow reading from and writing
 * to strings as if they were character streams.
 * 
 * These stream classes provide a flexible and consistent way to perform I/O
 * operations in Java, regardless of the source or destination. They offer
 * different levels of abstraction and functionality, making it possible to
 * handle various types of data and I/O requirements efficiently.
 * 
 */