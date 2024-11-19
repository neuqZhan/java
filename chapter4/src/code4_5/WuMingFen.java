package code4_5;

public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;
    //构造方法（三个参数）
    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.theMa=theMa;
        this.quantity=quantity;
        this.likeSoup=likeSoup;

    }

    //构造方法（两个参数）
    public WuMingFen(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity =quantity;
        this.likeSoup = false;

    }

    //无参构造 方法
    public WuMingFen(){
        this.theMa = "酸辣";
        this.quantity=2;
        this.likeSoup=true;
    }

    //检查方法
        public  void check(){
            System.out.println("面码："+theMa+"，粉的份量："+quantity+"两，是否带汤："+likeSoup);
        }
}
