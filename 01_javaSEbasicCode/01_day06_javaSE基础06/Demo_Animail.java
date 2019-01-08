
public class Demo_Animail{
    public static void main(String[] args) {
        Animail a=new Animail();
        a.setBreed("dog");
        a.setLeg(4);
        a.setaMaxAge(20);
        a.setMaxHeight(30);
        System.out.println("Animal:"+a.getBreed()+" leg:"+a.getLeg()+" maxAge:"+a.getMaxAge()+" maxHeight:"+a.getMaxHeight());
        a.play();
    }
}

class Animail{
    private String breed;         //动物种类
    private int leg;              //动物腿数
    private int maxAge;           //最大存活年龄
    private float maxHeight;      //最大身高

    public void setBreed(String breed){     //设置种类
        this.breed=breed;
    }
    public String getBreed(){              //获取种类
        return breed;
    }

    public void setLeg(int leg){           //设置腿数
        this.leg=leg;
    }
    public int getLeg(){               //获取腿数
        return leg;
    }

    public void setaMaxAge(int maxAge){   //设置最大年龄
        this.maxAge=maxAge;
    }
    public int getMaxAge(){               //获取最大年龄
        return maxAge;
    }

    public void setMaxHeight(float maxHeight){   //设置最大身高
        this.maxHeight=maxHeight;
    }
    public float getMaxHeight(){         //获取最大身高
        return maxHeight;
    }

     public void play(){
         System.out.println("play");
     }

}