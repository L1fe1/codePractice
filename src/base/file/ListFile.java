package base.file;

import java.io.File;

/**
 * 列出当前文件夹下的文件
 */
public class ListFile {
    public static void main(String[] args) {
        File f = new File("D:\\随笔集");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }
    }
}
