public class StringBufferExample 
{
    
    public static void main(String[] args) 
	{
        
        StringBuffer sb = new StringBuffer("hello");
        
        
        sb.append(" world");
        System.out.println(sb); 
       
        sb.insert(5, ", ");
        System.out.println(sb); 
        
      
        sb.delete(5, 7);
        System.out.println(sb); 
       
        sb.reverse();
        System.out.println(sb); 
        
        
        int length = sb.length();
        System.out.println(length); 
        
        
        int capacity = sb.capacity();
        System.out.println(capacity); 
    }
}