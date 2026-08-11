class Solution {
    public int carFleet(int target, int[] position, int[] speed){
        int n = position.length;
        double cars[][] = new double[n][2];
        for(int i=0; i<n; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        int count = 1;
        double prevTime = cars[0][1];
        for(int i=1; i<n; i++)
        {
            if(cars[i][1] > prevTime)
            {
                count++;
                prevTime = cars[i][1];
            }
        }
        return count;
    }
}
