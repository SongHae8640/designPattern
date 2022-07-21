package factoryPattern;

class Affogato implements Coffee{
    String name = "아포가토";

    @Override
    public void grindBean() {
        System.out.printf("%s :: 커피빈 갈기\n",this.name);
    }

    @Override
    public void extract() {
        System.out.printf("%s :: 커피 추출\n",this.name);
    }

    @Override
    public void pureCup() {
        System.out.printf("%s :: 아이스크림에 따르기\n",this.name);
    }
}
