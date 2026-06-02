class Solution {
    public double[] internalAngles(int[] sides) {
        int [] arr = sides.clone();
        Arrays.sort(arr);

        double a = arr[0];
        double b=arr[1];
        double c=arr[2];

        if(a+b<=c){
            return new double[0];
        }

        double angleA=Math.acos((b*b+c*c-a*a)/(2*b*c))*180.0/Math.PI;
        double angleB=Math.acos((a*a+c*c-b*b)/(2*a*c))*180.0/Math.PI;

        return new double [] {angleA,angleB,180.0-angleA-angleB};

    }
}