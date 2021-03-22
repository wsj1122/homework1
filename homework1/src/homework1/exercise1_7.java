package homework1;

public class exercise1_7 {
	public static void main(String[] args) {
	double k = 1.0;			 
    double sum = 0.0;
	for(int i = 1; i < 7; i++)
        sum += k * 1.0 / (2 * i - 1);
        k *= -1.0;
    System.out.println(4.0*sum);
    
    double k1 = 1.0;			 
    double sum1 = 0.0;
	for(int i = 1; i < 8; i++)
        sum1 += k1 * 1.0 / (2 * i - 1);
        k *= -1.0;
    System.out.println(4.0*sum1);
  }
}

