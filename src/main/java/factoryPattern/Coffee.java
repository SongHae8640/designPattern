package factoryPattern;

public abstract class Coffee {

    String menu;
    String base;

    void grindBean() {
        System.out.printf("%s 베이스의 %s :: 커피빈 갈기\n", base, menu);
    }

    void extract() {
        System.out.printf("%s 베이스의 %s :: 커피 추출\n", base, menu);
    }

    void pureCup() {
        System.out.printf("%s 베이스의 %s :: 물에 따르기\n", base, menu);
    }
}
