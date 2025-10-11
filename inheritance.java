class A{
    public void hello(){
        System.out.println("From hello");
    }

}
class B extends class A{
    public void hi(){
        System.out.println("from hi");
    }
}
class C extends class A{
    public void bye(){
        System.out.println("From bye");
    }
}
class Main{
    public static void main(String args[]){
        B sc= new B;
        c sc1= new C;
        B.hello();
        B.hi();
        c.bye();
    }
}
