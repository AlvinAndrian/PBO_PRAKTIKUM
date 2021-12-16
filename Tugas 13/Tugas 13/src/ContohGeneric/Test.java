package ContohGeneric;

class Generic<T>
{
    T obj;
    Generic(T obj) {  this.obj = obj;  }  
    public T getObject()  { return this.obj; }
}
   
public class Test
{
    public static void main (String[] args)
    {
        Generic <Integer> iObj = new Generic<Integer>(15);
        System.out.println(iObj.getObject());
   
        Generic <String> sObj =
                          new Generic<String>("Hello Semua !!!");
        System.out.println(sObj.getObject());
    }
}

