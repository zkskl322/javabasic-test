public class Exam3 {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다

        a붉은오리 .날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}

class 오리 {
    String 오리이름;
    날개 a날개;

    오리(String 오리이름, 날개 a날개) {
        this.오리이름 = 오리이름;
        this.a날개 = a날개;
        System.out.println(오리이름 + "가 만들어집니다");
    }
    void 날다() {
        System.out.print(오리이름 + "가 ");
        a날개.사용();
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        super("청둥오리", new 기본날개());
    }
}

class 흰오리 extends 오리 {
    흰오리() {
        super("흰오리", new 불사조날개());
    }
}

class 붉은오리 extends 오리 {
    붉은오리() {
        super("붉은오리", new 로켓날개());
    }
}

abstract class 날개 {
    abstract void 사용();
}

class 기본날개 extends 날개 {
    void 사용() {
        System.out.println("날개로 천천히 날아갑니다.");
    }
}

class 불사조날개 extends 날개 {
    void 사용() {
        System.out.println("불사조 날개로 불타오르며 날아갑니다.");
    }
}

class 로켓날개 extends 날개 {
    void 사용() {
        System.out.println("로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다");
    }
}