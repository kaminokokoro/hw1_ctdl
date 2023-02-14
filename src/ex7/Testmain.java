package ex7;

public class Testmain {
    public static void main(String[] args) {
        System.out.println("em dùng cấu trúc dữ liệu bài 7 nên em ko viết testmain cho bài 7 nữa ạ");
        SimpleArrayList<WordCount> list = new SimpleArrayList<>();
        String s="Tạo đối tượng là WordCount gồm 2 thuộc tính là word và count. Đối tượng" +
                "WordCount nạp chồng phương thức equals(Object o) để có thể sử dụng phương" +
                "thức isContain đã xây dựng ở các cấu trúc dữ liệu trên, hoặc có thể sử dụng phương" +
                "thức indexOf của các đối tượng cài đặt giao diện List";
        for (String s1 : s.split(" ")) {
            if(!checkWord(s1)){
                continue;
            }
            WordCount wordCount = new WordCount(s1);
            if (list.isContain(wordCount)) {
                list.get(list.indexOf(wordCount)).increment();
            } else {
                list.add(wordCount);
            }
        }
        System.out.println(list);
    }

    public static boolean checkWord(String s){
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
