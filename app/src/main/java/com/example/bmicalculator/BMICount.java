package com.example.bmicalculator;

public class BMICount {

    public float result;
    public float height;
    public float weight;

    public BMICount(float height, float weight){
        this.height=height/100;
        this.weight=weight;
    }
    public float bmiCount(){
        result = weight/(height*height);

        System.out.println(weight);
        System.out.println(height);
        System.out.println("hasil"+result);
        return result;
    }
    public String category(){
        if (result  < 14.9){
            return "Berat badan sangat kurang";
        }else if (result>=15&&result<=18.4){
            return "Berat badan kurang";
        }else  if (result >=18.5&&result<=22.9){
            return "Berat badan normal";
        }else if (result >=23&&result<=27.5){
            return "Berat badan anda berlebih";
        }else if (result >=27.6&&result<=40) {
            return "Berat badan anda sangat berlebih";
        }else if (result >40) {
            return "OBESITAS BOSSS";
        }
        return "anda kurang makan";
    }
}
