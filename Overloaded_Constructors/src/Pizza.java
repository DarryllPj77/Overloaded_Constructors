public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza(String bread,String sauce,String cheese,String toppings){ //First Construtor with 4 parameters
        
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;

    }

    Pizza(String bread,String sauce,String cheese){ //Second Constructor with 3 parameters
        
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
       

    }

    Pizza(String bread,String sauce){ //Third Constructor with 2 parameters
        
        this.bread = bread;
        this.sauce = sauce;
       

    }
    Pizza(String bread){ //Fourth Constructor with 1 parameters
        
        this.bread = bread;
        
    }

    Pizza(){ //Fifth Constructor with 0 parameters
        
        
    }
}
