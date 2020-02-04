// DANIEL ALEXANDER CARTAGENA FERNANDEZ - MEC - 1803690 
package suma.impares;

public class SUMAIMPARES {

    public static void main(String[] args) {
     long s=0;
System.out.println("PROGRAMA QUE SUMA LOS NUMEROS IMPARES DE 1 A 100'000.000");
for (int i=1;i<=100000000;i+=2)
{
    s+=i;
}
System.out.println("suma: "+ s);
    }
    
}
