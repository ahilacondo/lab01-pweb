
public class Calculator{
 public static void main(String[] args){
  
 }

 //Se creo metodo mod
 public static int mod(int a,int b){
    return a%b;   
 }
 //Se creo metodo sub
 public static int sub(int a, int b){
  return a - b;
 }
 //Se creo metodo div
 public static double div(double a, double b){
  if(b==0){
   System.out.println("No existe division entre 0");
   return 0;
  }
  else
   return a/b;
 }
//Se creo metodo mul
 public static double mul(double a, double b) {
  return a*b;
 }

  public static double add(double a, double b) {
  return a+b;
 }
}
