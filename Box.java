
class Box {
    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
    return (width*height*depth);
    }
}
class BoxMain{
    public static void main(String args[]){
    Box obj1=new Box(2,2,2);
    System.out.print("The voulme is "+obj1.volume());
    }
}

