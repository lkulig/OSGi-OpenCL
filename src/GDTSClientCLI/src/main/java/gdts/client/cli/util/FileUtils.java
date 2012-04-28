package gdts.client.cli.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class FileUtils
{
  private static final String DOT = "\\.";

  public static String loadFileTypeFrom(String fileName)
  {
    String[] strings = fileName.split(DOT);
    return strings[(strings.length - 1)];
  }

  public static String parseFileName(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if ((!file.exists()) || (file.isDirectory())) {
      throw new FileNotFoundException();
    }
    return file.getName();
  }

  public static byte[] loadFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if ((!file.exists()) || (file.isDirectory())) {
      throw new FileNotFoundException();
    }
    byte[] fileContent = new byte[(int)file.length()];
    InputStream fileInput = new FileInputStream(file);
    try
    {
      fileInput.read(fileContent);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return fileContent;
  }
}