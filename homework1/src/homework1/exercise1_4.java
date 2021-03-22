package homework1;

public class exercise1_4 {
	    public static void main(String[] args){
	        String s1="a";	// 创建 string 类型的数据 
	        String s2="a^2";
	        String s3="a^3";
	        System.out.printf("%-5s%-5s%-5s%n",s1,s2,s3);	// %s对应字符串 %n换行
			/* 	%-5s 从左往右占五个字符，不足右边空格补齐。*/
	        for(int i=1;i<5;i++)
	            System.out.printf("%-5d%-5d%-5d%n",i,i*i,i*i*i); //%d对应整数 printf格式化输出
	    }
}
