public class JAVA3{
    public static void main(String[] args) {
        int x , y , z ;
        x=y=z=2;

        x+=y;

        y-=z;

        z/=(x+y);

        System.out.print(x+" "+y+" "+z);
    }
}