/*
买煎饼果子
1.下楼
2.去一个卖煎饼果子的老大妈那里
3.交流,告诉她我要买煎饼果子
4.等待大妈煎煎饼果子
5.给她钱
6.拿着煎饼果子返回
*/
public class BuyBing{
    public static void main(String[] args) {
        //1.下楼
        goDownstairs();
        goToMom();
    }

    /*
    1.下楼
        1.到电梯处
        2.点击电梯下楼按钮,触发电梯事件
        3.当电梯门打开后,进入电梯,否则等待
        4.在电梯中观察电梯开门状态,如果不是1层,继续等待,如果是1层,走出电梯
        参数列表:无
        返回值类型:无
    */
    public static void goDownstairs(){
        System.out.println("I went to the elevator");
        clickElevator(12);     //模拟电梯当前所在层数
        
    }

    //触发电梯,等待电梯到达本层--12层
    public static void clickElevator(int olddisplay){
        System.out.println("I click the elevator button");
        boolean door;
        /*
        判断电梯状态,如果电梯层大于12层,电梯层数--,如果小于12层,电梯层数++
        当电梯层数达到12层时,电梯门开
        */
        while(olddisplay>12){
            olddisplay--;
            System.out.println("wait...");
        }
        while(olddisplay<12){
            olddisplay++;
            System.out.println("wait...");
        }
        door=true;
        if(door){
            System.out.println("wait the door open");
        }
        System.out.println("I went to the elevator");    
    }

    //2.去一个卖煎饼果子的老大妈那里
    public static void goToMom(){
        System.out.println("I take out my map");
        System.out.println("...");
    }
}