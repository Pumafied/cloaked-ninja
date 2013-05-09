while(True){
    System.out.println("Pick a valid operation");
    System.out.println("1.Area");
    System.out.println("2.Perimeter");
    System.out.println("3.Volume");
    System.out.println("4.Formulas");
    System.out.println("5.Interest");
    System.out.println("6.Coordinate");
    String menu = in.nextLine();
    if(string.equals("Disco")){
        //TODO: Implement Disco mode
    }
    int input = Integer.parseInt(menu);
    switch(input){
        case 1:{

                   System.out.println("1.Area of a Square");
                   System.out.println("2.Area of a rectangle");
                   System.out.println("3.Area of a triangle");
                   System.out.println("4.Area of a circle");
                   System.out.println("5.Area of a ellipse");
                   System.out.println("6.Back to menu");

                    menu = in.nextLine();
                    int input = Integer.parseInt(menu);
                    switch(menu){
                        case 1: {
                            System.out.println("You have selected Area of a square ");
                            System.out.println("Please enter the side value of the square ");
                            int side = in.nextLine();
                        }
                        case 2: {
                            System.out.println("You have selected Area of a rectangle");
                            System.out.println("Please enter the length value of the rectangle");
                            String menu = in.nextLine();
                            int input = Integer.parseInt(menu);
                            System.out.println("Please enter the side value of the rectangle");
                            int side = in.nextLine();
                            System.out.println();
                        }
                        case 3: {
                            System.out.println("You have selected Area of a triangle");
                            System.out.println("Please enter the side value of the triangle");
                            int side = in.nextLine();
                        }
                        case 4: {
                            System.out.println("You have selected Area of a circle");
                            System.out.println("Please enter the side value of the circle");
                            int side = in.nextLine();
                        }
                        case 5: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 6: {
                            //Back to menu
                            break;
                        }
                        default:{
                            System.out.print("What dont you understand about entering one number?");
                        }
                    }
        }
        case 2:{

                   System.out.println("Pick a valid operation");
                   System.out.println("1.Perimeter of a square");
                   System.out.println("2.Perimeter of a rectangle");
                   System.out.println("3.Perimeter of a triangle");
                   System.out.println("4.Perimeter of a circle");
                   System.out.println("5.Perimeter of a ellipse");
                   System.out.println("6.Perimeter of a parallelogram");
                   System.out.println("7.Perimeter of a trapezoid");
                   System.out.println("8.Back to menu");

                    switch(menu){
                        case 1: {
                            System.out.println("You have selected Perimeter of a square ");
                            System.out.println("Please enter the side value of the square ");
                            int side = in.nextLine();

                        }
                        case 2: {
                            System.out.println("You have selected Area of a rectangle");
                            System.out.println("Please enter the side value of the rectangle");
                            int side = in.nextLine();
                        }
                        case 3: {
                            System.out.println("You have selected Area of a triangle");
                            System.out.println("Please enter the side value of the triangle");
                            int side = in.nextLine();
                        }
                        case 4: {
                            System.out.println("You have selected Area of a circle");
                            System.out.println("Please enter the side value of the circle");
                            int side = in.nextLine();
                        }
                        case 5: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 6: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 7: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 8: {
                            //Back to menu
                            break;
                        }
                        default:{
                            System.out.print("What dont you understand about entering one number?");
                        }
                    }
        }
        case 3: {
                   System.out.println("Pick a valid operation");
                   System.out.println("1.Volume of a Rectangle Prism");
                   System.out.println("2.Volume of a cube");
                   System.out.println("3.Volume of a sphere");
                   System.out.println("4.Volume of a cylinder");
                   System.out.println("5.Volume of a cone");
                   System.out.println("6.Volume of a elipsoid");
                   System.out.println("6.Back to menu");

                    switch(menu){
                        case 1: {
                            System.out.println("You have selected Area of a square ");
                            System.out.println("Please enter the side value of the square ");
                            int side = in.nextLine();
                        }
                        case 2: {
                            System.out.println("You have selected Area of a rectangle");
                            System.out.println("Please enter the side value of the rectangle");
                            int side = in.nextLine();
                        }
                        case 3: {
                            System.out.println("You have selected Area of a triangle");
                            System.out.println("Please enter the side value of the triangle");
                            int side = in.nextLine();
                        }
                        case 4: {
                            System.out.println("You have selected Area of a circle");
                            System.out.println("Please enter the side value of the circle");
                            int side = in.nextLine();
                        }
                        case 5: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 6: {
                            //Back to menu
                            break;
                        }
                        default:{
                            System.out.print("What dont you understand about entering one number?");
                        }
                    }
        }
        case 4: {
                   System.out.println("Pick a valid operation");
                   System.out.println("1.Volume of a Rectangle Prism");
                   System.out.println("2.Volume of a cube");
                   System.out.println("3.Volume of a sphere");
                   System.out.println("4.Volume of a cylinder");
                   System.out.println("5.Volume of a cone");
                   System.out.println("6.Volume of a elipsoid");
                   System.out.println("7.Back to menu");

                    switch(menu){
                        case 1: {
                            System.out.println("You have selected Area of a square ");
                            System.out.println("Please enter the side value of the square ");
                            int side = in.nextLine();
                        }
                        case 2: {
                            System.out.println("You have selected Area of a rectangle");
                            System.out.println("Please enter the side value of the rectangle");
                            int side = in.nextLine();
                        }
                        case 3: {
                            System.out.println("You have selected Area of a triangle");
                            System.out.println("Please enter the side value of the triangle");
                            int side = in.nextLine();
                        }
                        case 4: {
                            System.out.println("You have selected Area of a circle");
                            System.out.println("Please enter the side value of the circle");
                            int side = in.nextLine();
                        }
                        case 5: {
                            System.out.println("You have selected Area of a ellipse");
                            System.out.println("Please enter the side value of the ellipse");
                            int side = in.nextLine();
                            break;
                        }
                        case 6: {
                            //Back to menu
                            break;
                        }
                        default:{
                            System.out.print("What dont you understand about entering one number?");
                        }
                    }
        }
        case 5:{

        }
        case 6:
        case 7:
        case 8:
        case 9:
        default:

    }


        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        System.out.println("3.Perimeter of a square ");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();

        System.out.println("4.Perimeter of a rectangle ");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
        System.out.println("5.Perimeter of a triangle");
        System.out.println("Please enter the length");
        int length = in.nextLine();
        System.out.println("Please enter the width");
        int width= in.nextLine();
    }
}
