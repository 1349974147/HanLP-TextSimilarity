package cm.eg;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class TxtTest {

    /**
     * 将多文本文件合为一个
     * @param args
     */
    public static void main(String[] args) {
        List<File> files = FileUtil.loopFiles("txt/wlys_url");
        List<String> lines = files.stream().map(file -> FileUtil.readLines(file, CharsetUtil.CHARSET_UTF_8))
                .flatMap(List::stream).collect(Collectors.toList());
        FileUtil.writeLines(lines,"D:\\data\\HanLP-TextSimilarity\\src\\test\\resource\\txt\\wlys.txt",CharsetUtil.CHARSET_UTF_8,true);
        System.out.println();
    }
}
