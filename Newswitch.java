public class Newswitch {
    public static void main(String args[])
    {
//  This switch statement evaluates the 'operation' variable
//  and executes code based on the mathematical operation selected
        String day = "monday";
        String result = " ";

        // switch(day)
        // {
        //     case "monday":
        //         System.out.println("6am");
        //         break;
        //     case "saturday", "sunday":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");

        // }

            // switch(day){
            //     case "monday" -> System.out.println("6am");

            //     case "saturday", "sunday" -> System.out.println("8am");

            //     default -> System.out.println("7am");

            // }

            // result = switch(day){
            //     case "monday" -> "6am";

            //     case "saturday", "sunday" -> "8am";

            //     default ->"7am";

            // };


            result = switch(day){
                case "monday": yield"6am";

                case "saturday", "sunday" : yield "8am";

                default : yield "7am";

            };
            System.out.println(result);
    }
}
