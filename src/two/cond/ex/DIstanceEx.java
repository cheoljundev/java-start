package two.cond.ex;

public class DIstanceEx {
    public static void main(String[] args) {
        int distance = 1000;
        String way;

        if (distance <= 1) {
            way = "도보";
        } else if (distance <= 10) {
            way = "자전거";
        } else if (distance <= 100) {
            way = "자동차";
        } else {
            way = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println(way + "를 이용하세요.");
    }
}
