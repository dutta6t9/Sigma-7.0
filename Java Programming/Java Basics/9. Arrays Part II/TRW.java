public class TRW {
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5};

        System.out.println();
        System.out.print("Trapped water stored :");
        System.out.print(TrappedRainwater(height));
        System.out.println();
        System.out.println();
    }

    public static int TrappedRainwater(int height[]){
        int n = height.length;
        // Calculate Leftmax -> Array ( Auxiliary Array)
        int leftmax[]=new int[n];

        leftmax[0] = height[0];
        for(int i = 1 ; i< n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //  Calculate RihtMax --> array (Auxiliary Array)
        //  Calculate Array from right side 
        int rightmax[] = new int[n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2 ; i>= 0 ; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);

        }

        //  Trpped rain water 

        int trappeRaindwater = 0 ;
        for (int i = 0 ; i < n ; i++){
            // water level MINIMUM calculate and initialize water level 

            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // TrappedRainWater = water level - height[i]

            trappeRaindwater += waterLevel - height[i];
        }

        return trappeRaindwater;
    }
}
