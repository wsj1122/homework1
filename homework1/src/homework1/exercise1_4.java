package homework1;

public class exercise1_4 {
	    public static void main(String[] args){
	        String s1="a";	// ���� string ���͵����� 
	        String s2="a^2";
	        String s3="a^3";
	        System.out.printf("%-5s%-5s%-5s%n",s1,s2,s3);	// %s��Ӧ�ַ��� %n����
			/* 	%-5s ��������ռ����ַ��������ұ߿ո��롣*/
	        for(int i=1;i<5;i++)
	            System.out.printf("%-5d%-5d%-5d%n",i,i*i,i*i*i); //%d��Ӧ���� printf��ʽ�����
	    }
}
