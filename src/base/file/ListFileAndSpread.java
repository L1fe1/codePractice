package base.file;

import java.io.File;

/**
 * 列出一个目录下所有的文件并对文件夹继续展开
 */
public class ListFileAndSpread {
    public static void main(String[] args) {
        showDirectory(new File("D:\\随笔集"));
    }

    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if(f.isDirectory()) {
            for(File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        }
        else {
            for(int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
}
