package practice;

public class PracticeForEach {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String[] names = {
                "山田一郎", "山田二郎", "山田三郎", "碧棺左馬刻", "入間銃兎",
                "毒島メイソン理鶯", "簓白膠木", "神宮寺寂雷", "飴村乱数", "夢野幻太郎",
                "有栖川帝統", "伊弉冉一二三", "観音坂独歩", "躑躅森蘆笙", "天谷零"
        };
        System.out.println();
        int count = 0;
        for (String list : names) {
            System.out.println(list);
            count++;
            if(count >= 10) {
                break;
            }
        }
    }

}
