
/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
    public static int shift=0;
    
    public static String word="";
    
    public static String resultWord= ""; 
    
    public static String encrypt(int theShift, String theWord /*String theResult*/)
    {
        shift=theShift;
        word=theWord;
        //resultWord=theResult;
        for(int i=0;i<theWord.length();i++)
        { 
            int theValue;
            theValue=(int)theWord.charAt(i);
            theValue+=shift; 
            resultWord+=(char)theValue;
        }
        return resultWord;
    } 
    
    
    
    public static String decrypt(int theShift, String theWord/*, String theResult*/)
    {
        shift=theShift;
        word=theWord;
        //resultWord=theResult;
        resultWord="";
        for(int i=0;i<theWord.length();i++)
        { 
            int theValue;
            theValue=(int)theWord.charAt(i);
            theValue-=shift; 
            resultWord+=(char)theValue;
        }
        return resultWord;
    }
    
    
    public static String encrypt2(int theShift, String theWord)
    {
        shift=theShift;
        word=theWord;
        //resultWord=theResult;
        int a=10; 
        int b=15; 
        int result; 
        resultWord="";
        if(shift==a)
        {
            shift-=1;
        }
        else if(shift>a)
        {
           shift%=a;  
        }
        if(shift==b)
        {
            shift-=1;
        }
        else if(shift>b)
        {
            shift%=b; 
        }
        a=a-shift; 
        b=b-shift; 
        int wordHalf1;
        int wordHalf2; 
        if(((theWord.length()/2)%2)==0)
        {
            wordHalf1=theWord.length()/2;
            wordHalf2=wordHalf1; 
        }
        else
        {
            wordHalf1=(theWord.length()/2)+1;
            wordHalf2=wordHalf1-1; 
        }
        
        for(int i=0;i<wordHalf1;i++)
        { 
            int theValue=0;
            theValue=(int)theWord.charAt(i);
            theValue+=a; 
            resultWord+=(char)theValue;
        }
        for(int i=wordHalf1;i<=(wordHalf1+wordHalf2-1);i++)
        { 
            int theValue=0;
            theValue=(int)theWord.charAt(i);
            theValue+=b; 
            resultWord+=(char)theValue;
        }
        return resultWord;
    }
    
    
    public static String decrypt2(int theShift, String theWord)
    {
        shift=theShift;
        word=theWord; 
        resultWord="";
        int wordHalf1;
        int wordHalf2; 
        if(((theWord.length()/2)%2)==0)
        {
            wordHalf1=theWord.length()/2;
            wordHalf2=wordHalf1; 
        }
        else
        {
            wordHalf1=(theWord.length()/2)+1;
            wordHalf2=wordHalf1-1; 
        }
        int a= 10;
        int b= 15;
        a=a-shift; 
        b=b-shift; 
        for(int i=0;i<wordHalf1;i++)
        { 
            int theValue=0;
            theValue=(int)theWord.charAt(i);
            theValue-=a; 
            resultWord+=(char)theValue;
        }
        for(int i=wordHalf1;i<=(wordHalf1+wordHalf2-1);i++)
        { 
            int theValue=0;
            theValue=(int)theWord.charAt(i);
            theValue-=b; 
            resultWord+=(char)theValue;
        }
        return resultWord;
    }
           
    
}
