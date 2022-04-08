import java.util.Arrays;
class Main
{
  public static void main(String[] args)
  {
    double sre,suma=0;
    double[] tablica = new double[10];
    for(int i=0;i<10;i++)
    {
      tablica[i]=Math.random();
      suma+=tablica[i];
      }
    System.out.print(Arrays.toString(tablica)+"\nSrednia tych losowych liczb to: ");
    System.out.print(sre=suma/10);
    }
}