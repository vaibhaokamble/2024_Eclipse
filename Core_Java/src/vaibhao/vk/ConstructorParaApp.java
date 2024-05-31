package vaibhao.vk;

import java.util.Scanner;

public class ConstructorParaApp {
    private String name;
    private int id;

    public ConstructorParaApp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        
        ConstructorParaApp person = new ConstructorParaApp(name, id);
        
        System.out.println("Name: " + person.getName());
        System.out.println("ID: " + person.getId());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
