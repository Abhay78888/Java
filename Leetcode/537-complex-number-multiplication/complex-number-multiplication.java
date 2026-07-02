class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1=num1.split("\\+|i");
        String[] s2=num2.split("\\+|i");

        int r1=Integer.parseInt(s1[0]);
        int imag1=Integer.parseInt(s1[1]);
        int r2=Integer.parseInt(s2[0]);
        int imag2=Integer.parseInt(s2[1]);
        
        int real = r1*r2-imag1*imag2;
        int imag=r2*imag1+imag2*r1;

        return real + "+" + imag + "i";


        
    }
}