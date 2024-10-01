public class Apple extends Fruit implements IPeelabie,IWashable {
    /*String color="Red";
    public Apple(){
        //super();-вызывает конструктор класса родительского
        super();
        name=name+" Яблоко";
        weight=300;}

     */
    public Apple() {
        //super();-вызывает конструктор класса родительского
        super();
        setName(getName() + " Яблоко");
        setWeight(300);
    }


//полиморфизм
    @Override
    public void sayNameandate() {
        System.out.println("This is polimorfizm");
        System.out.println("My name" + getName() + "and my weight " + weight);


    }
    @Override
    public void cookFruit(){
        setName("cooke and wash");

    }
    @Override
    public void peelandit(){

    }
    @Override
    public void wash(){

    }
}
