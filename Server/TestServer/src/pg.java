import java.util.*;

public class pg {
    static void loading(int count) throws InterruptedException {
        System.out.print(String.join("", Collections.nCopies(count, "\n"))); // 初始化进度条所占的空间
        List<Integer> allProgress = new ArrayList<>(Collections.nCopies(count, 0));
        while (true) {
            Thread.sleep(10);

            // 随机选择一个进度条，增加进度
            List<Integer> unfinished = new LinkedList<>();
            for (int i = 0; i < allProgress.size(); i++) {
                if (allProgress.get(i) < 100) {
                    unfinished.add(i);
                }
            }
            if (unfinished.isEmpty()) {
                break;
            }
            int index = unfinished.get(new Random().nextInt(unfinished.size()));
            allProgress.set(index, allProgress.get(index) + 1); // 进度+1

            // 绘制进度条
            System.out.print("\u001b[1000D"); // 移动到最左边
            System.out.print("\u001b[" + count + "A"); // 往上移动
            for (Integer progress : allProgress) {
                int width = progress / 4;
                String left = "[" + String.join("", Collections.nCopies(width, "#"));
                String right = String.join("", Collections.nCopies(25 - width, " ")) + "]";
                System.out.println(left + right);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        loading(1);
//        System.out.print("Progress:");
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(i + "%");
//            Thread.sleep(100);
//
//            for (int j = 0; j <= String.valueOf(i).length(); j++) {
//                System.out.print("\b");
//            }
//        }
//        System.out.println();
    }
}
