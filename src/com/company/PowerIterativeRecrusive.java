package com.company;

public class PowerIterativeRecrusive {
    public static void main(String[] args) {
        //Iternative
        int y = 3, x = 5;

        int res = 1;
        while(y > 0) {
            if(y % 2 != 0) {
                res = res * x;
            }
            y = y / 2;
            x = x * x;
        }
    }

    private static float calcPower(int x, int y) {
        float temp = 0;

        if(y == 0)
            return 1;
        temp = calcPower(x, y/2);
        if(y % 2 == 0) {
            return temp * temp;
        }else {
            if(y > 0) {
                return x*temp*temp;
            }else {
                return (temp*temp)/x;
            }
        }

    }
}
