class Switch {
    public static void main(String args[])
    {
        int n = 2;

        // if(n == 1)
        //     System.out.println("Monday");
        // else if(n == 2)
        //     System.out.println("tuesday");
        // else if(n == 3)
        //     System.out.println("Wednesday");
        // else if(n == 4)
        //     System.out.println("Thrusday");
        // else if(n == 5)
        //     System.out.println("Friday");
        // else if(n == 6)
        //     System.out.println("Saturday");
        // else
        //     System.out.println("Sunday");

        switch(n = 8){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thrusday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("enter a valid number");

        }
    }
}