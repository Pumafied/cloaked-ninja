package Function;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Pick a valid operation");
			System.out.println("1.Area");
			System.out.println("2.Perimeter");
			System.out.println("3.Volume");
			System.out.println("4.Formulas");
			System.out.println("5.Interest");
			System.out.println("6.Coordinate");
			String menu = in.nextLine();
			if (menu.equals("Disco")) {
				// TODO: Implement Disco mode
			}
			int input = Integer.parseInt(menu);
			switch (input) {
			case 1: {

				System.out.println("1.Area of a Square");
				System.out.println("2.Area of a rectangle");
				System.out.println("3.Area of a triangle");
				System.out.println("4.Area of a circle");
				System.out.println("5.Area of a ellipse");
				System.out.println("6.Back to menu");

				menu = in.nextLine();
				input = Integer.parseInt(menu);
				switch (input) {
				case 1: {
					System.out.println("You have selected Area of a square ");
					System.out
							.println("Please enter the side value of the square ");
					double side = Double.parseDouble(in.nextLine());
					System.out.println("Your area will be " + Main.area(side));
				}
				case 2: {
					System.out.println("You have selected Area of a rectangle");
					System.out
							.println("Please enter the length value of the rectangle");
					double length = Double.parseDouble(menu);
					System.out
							.println("Please enter the side value of the rectangle");
					double side = Double.parseDouble(in.nextLine());
					System.out.println(("Your area will be " + Main.area(side,
							length)));
				}
				case 3: {
					System.out.println("You have selected Area of a triangle");
					System.out.println("Is it an Equilateral triangle ");
					String option = in.nextLine();
					if (option.equals("no")) {
						System.out
								.println("Please enter the base value of the triangle");
						double base = Double.parseDouble(in.nextLine());
						System.out
								.println("Please enter the height value of the triangle");
						double height = Double.parseDouble(in.nextLine());
						System.out.println(("Your area will be " + Main
								.areaTriangle(base, height)));

					}
					System.out
							.println("Please enter the side value of the triangle");
					double side = Double.parseDouble(in.nextLine());
					System.out.println(("Your area will be " + Main
							.areaTriangle(side)));
				}
				case 4: {
					System.out.println("You have selected Area of a circle");
					System.out
							.println("Please enter the side value of the circle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 5: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 6: {
					// Back to menu
					break;
				}
				default: {
					System.out
							.print("What dont you understand about entering one number?");
				}
				}
			}
			case 2: {

				System.out.println("Pick a valid operation");
				System.out.println("1.Perimeter of a square");
				System.out.println("2.Perimeter of a rectangle");
				System.out.println("3.Perimeter of a triangle");
				System.out.println("4.Perimeter of a circle");
				System.out.println("5.Perimeter of a ellipse");
				System.out.println("6.Perimeter of a parallelogram");
				System.out.println("7.Perimeter of a trapezoid");
				System.out.println("8.Back to menu");

				menu = in.nextLine();
				input = Integer.parseInt(menu);
				switch (input) {
				case 1: {
					System.out
							.println("You have selected Perimeter of a square ");
					System.out
							.println("Please enter the side value of the square ");
					double side = Double.parseDouble(in.nextLine());
				}
				case 2: {
					System.out.println("You have selected Area of a rectangle");
					System.out
							.println("Please enter the side value of the rectangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 3: {
					System.out.println("You have selected Area of a triangle");
					System.out
							.println("Please enter the side value of the triangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 4: {
					System.out.println("You have selected Area of a circle");
					System.out
							.println("Please enter the side value of the circle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 5: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 6: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 7: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 8: {
					// Back to menu
					break;
				}
				default: {
					System.out
							.print("What dont you understand about entering one number?");
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

				menu = in.nextLine();
				input = Integer.parseInt(menu);
				switch (input) {
				case 1: {
					System.out.println("You have selected Area of a square ");
					System.out
							.println("Please enter the side value of the square ");
					double side = Double.parseDouble(in.nextLine());
				}
				case 2: {
					System.out.println("You have selected Area of a rectangle");
					System.out
							.println("Please enter the side value of the rectangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 3: {
					System.out.println("You have selected Area of a triangle");
					System.out
							.println("Please enter the side value of the triangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 4: {
					System.out.println("You have selected Area of a circle");
					System.out
							.println("Please enter the side value of the circle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 5: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 6: {
					// Back to menu
					break;
				}
				default: {
					System.out
							.print("What dont you understand about entering one number?");
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

				menu = in.nextLine();
				input = Integer.parseInt(menu);
				switch (input) {
				case 1: {
					System.out.println("You have selected Area of a square ");
					System.out
							.println("Please enter the side value of the square ");
					double side = Double.parseDouble(in.nextLine());
				}
				case 2: {
					System.out.println("You have selected Area of a rectangle");
					System.out
							.println("Please enter the side value of the rectangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 3: {
					System.out.println("You have selected Area of a triangle");
					System.out
							.println("Please enter the side value of the triangle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 4: {
					System.out.println("You have selected Area of a circle");
					System.out
							.println("Please enter the side value of the circle");
					double side = Double.parseDouble(in.nextLine());
				}
				case 5: {
					System.out.println("You have selected Area of a ellipse");
					System.out
							.println("Please enter the side value of the ellipse");
					double side = Double.parseDouble(in.nextLine());
					break;
				}
				case 6: {
					// Back to menu
					break;
				}
				default: {
					System.out
							.print("What dont you understand about entering one number?");
				}
				}
			}
			case 5: {

			}
			case 6:
			case 7:
			case 8:
			case 9:
			default:

			}

		}
	}
}
