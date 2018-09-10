package com.company.misc;

public class Power {

    public double Pow(double n, int pow){//2^3 == 2*2*2
        double output = n;
        if(pow==0)return 1.0;
        else if(pow>0){
            for(int i = 1; i<=pow; i++){
                output = output*n;
            }
            return output;
        }
        else {
            for(int i = pow; i<=0; i++){
                output = output/n;
            }
            return output;
        }
    }
}
