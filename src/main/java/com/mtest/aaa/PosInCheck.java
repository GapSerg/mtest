package com.mtest.aaa;

public class PosInCheck {


    private Integer id;
    private int amount;
    public String name;
    public float price;
    public float sumLine;
    public float discount =0;
    public String bonusLine;
    public Integer discountPercent;


    public Integer getId() {
        return id;
    }


    public int getAmount() {
        return amount;
    }

    public PosInCheck(Integer id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public float calculateLine(int bonus){
        float rez=0;
        if (discountPercent !=null){
            if ((discountPercent !=0)&(amount>4)){
                rez=this.price*this.amount*(1-discountPercent /100);
                this.discount =this.price*this.amount* discountPercent /100;
                this.bonusLine="discount on promotional goods " +this.discount;
            } else if (bonus!=0){
                this.discount =this.price*this.amount*bonus/100;
                rez=this.price*this.amount-this.discount;

                this.bonusLine="discount on you bonus card " + this.discount;
            }




        }
        else rez=this.price*this.amount;

        this.sumLine=rez;
        return rez;
    }


}
