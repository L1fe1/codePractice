package base.file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * 使用Java 7中的NIO.2的API来列出文件夹下的文件
 */
public class ListFileInNIO {
    public static void main(String[] args) throws IOException {
        Path initPath = Paths.get("D:\\随笔集");
        Files.walkFileTree(initPath, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }

        });
    }
}
