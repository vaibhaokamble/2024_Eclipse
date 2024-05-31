package vaibhao.vk;

import java.util.Scanner;

class Product {
    private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	private String name;
    private double price;
    private int qty;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}

class Shop {
    private String custName;
    private Product[] products;

    public void setProducts(String custName, Product... p) {
        this.custName = custName;
        this.products = p;
    }

    public void calBill(boolean includeGST) {
        double total = 0;

        System.out.println("Customer Name: " + custName);
        System.out.println("--------------------------------------");
        System.out.println("ID\tName\tPrice\tQty\tTotal");

        for (Product product : products) {
            double productTotal = product.getPrice() * product.getQty();
            total += productTotal;
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice() + "\t" + product.getQty() + "\t" + productTotal);
        }

        System.out.println("--------------------------------------");
        System.out.println("Total: " + total);

        if (includeGST) {
            double gstAmount = total * 0.18;
            double totalWithGST = total + gstAmount;
            System.out.println("GST (18%): " + gstAmount);
            System.out.println("Total with GST: " + totalWithGST);
        }
    }
}

public class BillingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        Shop shop = new Shop();

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product[] products = new Product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            products[i] = new Product(id, name, price, qty);
        }

        shop.setProducts(custName, products);

        System.out.println("Choose billing option:");
        System.out.println("1. Bill with GST");
        System.out.println("2. Bill without GST");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                shop.calBill(true);
                break;
            case 2:
                shop.calBill(false);
                break;
            default:
                System.out.println("Invalid option. Exiting...");
        }

    }
}
