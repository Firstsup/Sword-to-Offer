package N5;

public class N5Q1 {
    public static void main(String[] args) {
        String str = "We are happy.";
        StringBuffer sb = function(str);
        System.out.println(sb);
    }

    public static StringBuffer function(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.append(" ".repeat(Math.max(0, count * 2)));
        int p = str.length() - 1;
        int q = sb.length() - 1;
        while (p >= 0) {
            if (str.charAt(p) != ' ') {
                sb.setCharAt(q, str.charAt(p));
            } else {
                q -= 2;
                sb.delete(q, q + 3);
                sb.insert(q, "%20");
            }
            p--;
            q--;
        }
        return sb;
    }
}

//StringBuffer类如果不向里面添加内容，则为空，初始化给容量也不行，一定要添到足够大的容量
//StringBuffer类的delete函数包含start，不包含end！