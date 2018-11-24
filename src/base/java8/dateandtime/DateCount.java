package base.java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateCount {
    public static void main(String[] args) {
        // Java 8

        // 按格式打印今天的日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(formatter));

        // 打印上个月的每一天（只要求输出年月日）
        LocalDate localDate = LocalDate.now();
        int monthlen = localDate.minusMonths(1).lengthOfMonth();
        for (int i = 1;i <= monthlen;i ++){
            System.out.println(LocalDate.of(localDate.getYear(),localDate.minusMonths(1).getMonthValue(),i));
        }

        // 打印过去30天的每一天（只要求输出年月日）
        for (int i = 30;i > 0;i --){
            System.out.println(localDate.minusDays(i));
        }
    }
}
