package training;

class nested_if
{
public static void main(String arg[])
 {
int i=20,j=12,k=8;

if(i>j)
   {
       if(i>k)
        {
          System.out.println(i+"is big");
        }
        else
        {
        System.out.println(k+"is big");
        }
    }
else
    {
if(j>i)
         {
        if(j>k)
         {
          System.out.println(j+"is big");
         }
         else
         {
          System.out.println(k+"is big");
         }
         }
else
    {
    System.out.println(i+"is big");
    }
   }
  }
}


   
