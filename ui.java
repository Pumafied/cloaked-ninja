while(True){
    System.out.println("Pick a valid operation");
    System.out.println("1.Area of a Square");
    System.out.println("2.Area of a rectangle");
    System.out.println("2.Area of a triangle");
    System.out.println("3.Area of a circle");
    System.out.println("2.Area of a ellipse");
    System.out.println("4.Perimeter of a rectangle");
    System.out.println("5.Perimeter of a triangle");
    System.out.println("5.Perimeter of a triangle");
    System.out.println("5.Perimeter of a triangle");
    System.out.println("5.Perimeter of a triangle");
    //TODO: Parse to ints
    String menu = in.nextLine();
    int input = Integer.parseInt(menu);
    if (input == 1) {
        System.out.println("You have selected Area of a square ");
        System.out.println("Please enter the side value of the square ");
        int side = in.nextLine();
        //area(side , side)
    } else if (input == 2) {
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        //System.out.println(area(side , side));
    } else if (input == 3) {
        System.out.println("3.Perimeter of a square ");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();

    } else if (input == 4) {
        System.out.println("4.Perimeter of a rectangle ");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    } else if (input == 5) {
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    } else if (input == 6) {
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    } else if (input == 7) {
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    } else if (input == 8) {
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    } else if (input == 9) {
        //continue to the next menu structure
    } else {
        System.out.print("What dont you understand about entering one number?");
    }
}
