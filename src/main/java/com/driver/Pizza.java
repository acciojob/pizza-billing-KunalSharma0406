package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addcheese;
    private boolean addtopping;
    private int addextracheese;
    private int addextratopping;
    private boolean takeaway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(this.isVeg==true){
           this.price=300;
           this.addextracheese=80;
           this.addextratopping=70;// your code goes here
       }
       else{
           this.price=400;
           this.addextracheese=80;
           this.addextratopping=120;

       }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if (!addcheese) {
            this.price+=80;
            this.addcheese=true;

        }
    }

    public void addExtraToppings() {
        if (!addtopping) {
            this.price+=this.addextratopping; // your code goes here
            this.addtopping=true;
        }
    }

    public void addTakeaway() {
        if (!takeaway) {
            this.price += 20;
            this.takeaway = true;
            // your code goes here
        }
    }

        public String getBill () {
            if (isVeg) {
                this.bill = "Base Price Of The Pizza: " + 300 + "\n"; // your code goes here
                //return this.bill;
            } else {
                this.bill = "Base Price Of The Pizza: " + 400 + "\n";
            }
            if (addcheese) {
                this.bill = this.bill + "Extra Cheese Added: " + 80 + "\n";
            }
            if (addtopping) {
                this.bill = this.bill + "Extra Toppings Added: " + addextratopping + "\n";
            }
            if (takeaway) {
                this.bill = this.bill + "Paperbag Added: " + 20 + "\n";
            }
            return this.bill+ "Total Price: " + this.price;
        }
    }
