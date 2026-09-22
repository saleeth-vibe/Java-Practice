import java.util.Scanner;

class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful ");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials! Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked ");
        }

        sc.close();
    }
}

import java.util.Scanner;

class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " - " + marks[i] + " - Grade: ");

            if (marks[i] >= 75)
                System.out.println("A");
            else if (marks[i] >= 60)
                System.out.println("B");
            else if (marks[i] >= 50)
                System.out.println("C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}

import java.util.Scanner;

class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } 
        else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);

        sc.close();
    }
}


import java.util.Scanner;

class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } 
        else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);

        sc.close();
    }
}

import java.util.Scanner;

class ContactManager {

    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[50];
    static String[] phones = new String[50];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== CONTACT MANAGER ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }

    static void addContact() {
        System.out.print("Enter name: ");
        names[count] = sc.next();

        System.out.print("Enter phone: ");
        phones[count] = sc.next();

        count++;
        System.out.println("Contact added!");
    }

    static void viewContacts() {
        if (count == 0) {
            System.out.println("No contacts found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + phones[i]);
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String search = sc.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + names[i] + " - " + phones[i]);
                return;
            }
        }

        System.out.println("Contact not found.");
    }
    }


import java.util.Random;
import java.util.Scanner;

class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Press Enter to roll the dice...");
        sc.nextLine();

        int user = rand.nextInt(6) + 1;
        int computer = rand.nextInt(6) + 1;

        System.out.println("You rolled: " + user);
        System.out.println("Computer rolled: " + computer);

        if (user > computer) {
            System.out.println("You Win! ");
        } else if (user < computer) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("It's a Draw!");
        }

        sc.close();
    }
}


import java.util.Scanner;

class ATMSystem {

    static Scanner sc = new Scanner(System.in);
    static int pin = 1234;
    static double balance = 1000;

    public static void main(String[] args) {

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong PIN ❌");
            return;
        }

        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    balance += dep;
                    System.out.println("Deposit successful!");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();

                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println("Please collect cash 💵");
                    } else {
                        System.out.println("Insufficient balance ❌");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature:");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.2f %s", newTemp, unit);

        sc.close();

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        boolean isFound = false;
        String target;
        
        System.out.println("Enter a target fruit to search for:");
        target = sc.nextLine();
        

        for(int i = 0; i < fruits.length; i++) {
                if(fruits[i].equals(target)) {
                    System.out.println("Target found at index: " + i);
                    isFound = true;
                    break;
                }
            }

            if(!isFound) {
                System.out.println("Target not found in the array.");

            }   


            sc.close();
        }
    }

abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args){

        Dog d1 = new Dog();

        d1.sound();
    }
}

abstract class Employee {
    abstract void salary();
}
class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary is 80000");
    }
}
public class Main {
    public static void main(String[] args){
       Employee e1 = new Manager ();
       e1.salary();
        
       
    }
}

import java.util.*;
class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public double calaculateSalary(){
        return salary;
    }
}
class Developer extends Employee {
    private double bonus;

    Developer(String name, double salary, double bonus) {

        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calaculateSalary() {
        return getSalary() + bonus;
    }
}

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        Employee d1 = new Developer(name, salary, bonus);

        System.out.println("Name: " + d1.getName());
        System.out.println("Total Salary: " + d1.calaculateSalary());
        
        sc.close();
    }
}
        
import java.util.Scanner;

class ShoppingBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("\n===== SHOPPING BILL =====");
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Total Bill: ₹" + total);

        sc.close();
    }
}

import java.util.Scanner;

class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Attended Classes: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / totalClasses;

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Student Name      : " + name);
        System.out.println("Total Classes     : " + totalClasses);
        System.out.println("Classes Attended  : " + attended);
        System.out.println("Attendance %      : " + percentage);

        if (percentage >= 75) {
            System.out.println("Status: Eligible for Exam ");
        } else {
            System.out.println("Status: Not Eligible ");
        }

        sc.close();
    }
}

import { useState, useReducer, useRef } from "react";

// Reducer Function
function reducer(state, action) {

  switch(action.type) {

    case "add":

      return [
        ...state,
        {
          id: Date.now(),
          text: action.payload,
          hidden: false
        }
      ];

    case "toggle":

      return state.map((task) =>

        task.id === action.payload

          ? { ...task, hidden: !task.hidden }

          : task
      );

    default:
      return state;
  }
}

function App() {

  // useState for input
  const [task, setTask] = useState("");

  // useReducer for tasks
  const [tasks, dispatch] = useReducer(reducer, []);

  // useRef for input focus
  const inputRef = useRef();

  // Add Task
  function addTask() {

    if(task.trim() !== "") {

      dispatch({
        type: "add",
        payload: task
      });

      setTask("");
    }
  }

  // Focus Input
  function focusInput() {
    inputRef.current.focus();
  }

  return (
    <div>

      <h1>Task Manager</h1>

      <input
        ref={inputRef}
        type="text"
        value={task}
        placeholder="Enter task"
        onChange={(e) => setTask(e.target.value)}
      />

      <button onClick={addTask}>
        Add Task
      </button>

      <button onClick={focusInput}>
        Focus Input
      </button>

      <hr />

      {tasks.map((task) => (

        <div key={task.id}>

          <p>
            {task.hidden ? "Content Hidden" : task.text}
          </p>

          <button
            onClick={() =>
              dispatch({
                type: "toggle",
                payload: task.id
              })
            }
          >
            Toggle
          </button>

        </div>

      ))}
    </div>
  );
}

export default App;

import java.util.Scanner;

class LibrarySystem {

    static Scanner sc = new Scanner(System.in);

    static String[] books = new String[50];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== LIBRARY MENU ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }

    static void addBook() {

        System.out.print("Enter book name: ");
        books[count] = sc.nextLine();

        count++;

        System.out.println("Book added successfully!");
    }

    static void viewBooks() {

        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    static void searchBook() {

        System.out.print("Enter book name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].equalsIgnoreCase(search)) {
                System.out.println("Book Found: " + books[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}

import java.util.Scanner;

class RailwayBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sleeper = 250;
        int ac = 600;
        int firstClass = 1000;

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.println("\n===== TRAIN CLASSES =====");
        System.out.println("1. Sleeper - ₹250");
        System.out.println("2. AC - ₹600");
        System.out.println("3. First Class - ₹1000");

        System.out.print("Choose Class: ");
        int choice = sc.nextInt();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        int total = 0;
        String trainClass = "";

        switch(choice) {

            case 1:
                trainClass = "Sleeper";
                total = sleeper * tickets;
                break;

            case 2:
                trainClass = "AC";
                total = ac * tickets;
                break;

            case 3:
                trainClass = "First Class";
                total = firstClass * tickets;
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.println("\n===== TICKET DETAILS =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Train Class    : " + trainClass);
        System.out.println("No. of Tickets : " + tickets);
        System.out.println("Total Fare     : ₹" + total);

        System.out.println("\nTicket Booked Successfully ");

        sc.close();
    }
}

import java.util.Scanner;

class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Attended Classes: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / totalClasses;

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Student Name      : " + name);
        System.out.println("Total Classes     : " + totalClasses);
        System.out.println("Classes Attended  : " + attended);
        System.out.println("Attendance %      : " + percentage);

        if (percentage >= 75) {
            System.out.println("Status: Eligible for Exam ");
        } else {
            System.out.println("Status: Not Eligible ");
        }

        sc.close();
    }
}

import java.util.Scanner;

class HospitalAppointment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String patient = sc.nextLine();

        System.out.println("\n===== DOCTORS AVAILABLE =====");
        System.out.println("1. Dr. Smith - General");
        System.out.println("2. Dr. John - Dentist");
        System.out.println("3. Dr. Sarah - Eye Specialist");

        System.out.print("Choose Doctor: ");
        int choice = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Appointment Day: ");
        String day = sc.nextLine();

        String doctor = "";

        switch(choice) {

            case 1:
                doctor = "Dr. Smith";
                break;

            case 2:
                doctor = "Dr. John";
                break;

            case 3:
                doctor = "Dr. Sarah";
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.println("\n===== APPOINTMENT DETAILS =====");
        System.out.println("Patient Name : " + patient);
        System.out.println("Doctor       : " + doctor);
        System.out.println("Day          : " + day);

        System.out.println("\nAppointment Booked Successfully ");

        sc.close();
    }
}

import java.util.Scanner;

class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double bonus = salary * 0.10; // 10% bonus
        double finalSalary = salary + bonus;

        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : ₹" + salary);
        System.out.println("Bonus         : ₹" + bonus);
        System.out.println("Final Salary  : ₹" + finalSalary);

        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("\nGenerated Password: " + password);

        sc.close();
    }
}
import java.util.Scanner;

class LoanEMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter Loan Period (Years): ");
        int years = sc.nextInt();

        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("\n===== EMI DETAILS =====");
        System.out.println("Loan Amount : ₹" + principal);
        System.out.println("Interest Rate : " + annualRate + "%");
        System.out.println("Loan Period : " + years + " Years");
        System.out.printf("Monthly EMI : ₹%.2f%n", emi);

        sc.close();
    }
}

import java.util.Scanner;

class HospitalAppointment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String patient = sc.nextLine();

        System.out.println("\n===== DOCTORS AVAILABLE =====");
        System.out.println("1. Dr. Smith - General");
        System.out.println("2. Dr. John - Dentist");
        System.out.println("3. Dr. Sarah - Eye Specialist");

        System.out.print("Choose Doctor: ");
        int choice = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Appointment Day: ");
        String day = sc.nextLine();

        String doctor = "";

        switch(choice) {

            case 1:
                doctor = "Dr. Smith";
                break;

            case 2:
                doctor = "Dr. John";
                break;

            case 3:
                doctor = "Dr. Sarah";
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.println("\n===== APPOINTMENT DETAILS =====");
        System.out.println("Patient Name : " + patient);
        System.out.println("Doctor       : " + doctor);
        System.out.println("Day          : " + day);

        System.out.println("\nAppointment Booked Successfully ");

        sc.close();
    }
}

import java.util.Scanner;

class SupermarketBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        double total = quantity * price;
        double discount = 0;

        if (total > 1000) {
            discount = total * 0.10; // 10% discount
        }

        double finalBill = total - discount;

        System.out.println("\n===== BILL RECEIPT =====");
        System.out.println("Product      : " + product);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Amount : ₹" + total);
        System.out.println("Discount     : ₹" + discount);
        System.out.println("Final Bill   : ₹" + finalBill);

        sc.close();
    }
}

import java.util.Scanner;

public class ATMPinSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Login Successful ");
                System.out.println("Welcome to ATM!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong PIN ");
                System.out.println("Attempts Left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked ");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class ParkingManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSpaces = 20;
        int occupied = 0;
        int choice;

        do {
            System.out.println("\n===== PARKING MANAGEMENT =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Parking Status");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < totalSpaces) {
                        occupied++;
                        System.out.println("Vehicle Parked Successfully ");
                    } else {
                        System.out.println("Parking Full ");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle Removed Successfully ");
                    } else {
                        System.out.println("No Vehicles in Parking.");
                    }
                    break;

                case 3:
                    System.out.println("\n===== PARKING STATUS =====");
                    System.out.println("Total Spaces     : " + totalSpaces);
                    System.out.println("Occupied Spaces  : " + occupied);
                    System.out.println("Available Spaces : " + (totalSpaces - occupied));
                    break;

                case 4:
                    System.out.println("Thank You! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

import java.util.Scanner;

class Parallelogram {

    private double base;
    private double height;
    private static int totalParallelograms = 0;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
        totalParallelograms++;
    }

    public double calculateArea() {
        return base * height;
    }

    public void display(int number) {
        System.out.printf(
            "Parallelogram %d: Base: %.2f, Height: %.2f, Area: %.2f%n",
            number, base, height, calculateArea()
        );
    }

    public static int getTotalParallelograms() {
        return totalParallelograms;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Parallelogram[] arr = new Parallelogram[3];

        for (int i = 0; i < 3; i++) {

            double base = sc.nextDouble();
            double height = sc.nextDouble();

            arr[i] = new Parallelogram(base, height);
        }

        for (int i = 0; i < 3; i++) {
            arr[i].display(i + 1);
        }

        System.out.println("Total Parallelograms: " +
                Parallelogram.getTotalParallelograms());

        sc.close();
    }
}
import java.util.Scanner;

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountHolder;
        double balance = 0;

        System.out.println("===== BANK ACCOUNT SYSTEM =====");
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful!");
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== ACCOUNT DETAILS =====");
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You for Using Our Bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int mark1, mark2, mark3;

    Student(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayResult() {

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + calculateTotal());
        System.out.println("Percent : " + calculatePercentage() + "%");

        if(calculatePercentage() >= 75) {
            System.out.println("Grade   : A");
        }
        else if(calculatePercentage() >= 50) {
            System.out.println("Grade   : B");
        }
        else {
            System.out.println("Grade   : Fail");
        }
    }
}


public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();


        Student s1 = new Student(roll, name, m1, m2, m3);

        s1.displayResult();

        sc.close();
    }
}
import java.util.Scanner;

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountHolder;
        double balance = 0;

        System.out.println("===== BANK ACCOUNT SYSTEM =====");
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful!");
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== ACCOUNT DETAILS =====");
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You for Using Our Bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName = "";
        int bookedTickets = 0;
        int availableSeats = 50;
        boolean booked = false;

        int choice;

        do {

            System.out.println("\n===== MOVIE TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Tickets");
            System.out.println("2. View Booking");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (!booked) {

                        System.out.print("Enter Customer Name: ");
                        customerName = sc.nextLine();

                        System.out.print("Enter Number of Tickets: ");
                        int tickets = sc.nextInt();

                        if (tickets <= availableSeats) {

                            bookedTickets = tickets;
                            availableSeats -= tickets;
                            booked = true;

                            System.out.println("Booking Successful!");

                        } else {

                            System.out.println("Not Enough Seats Available.");
                        }

                    } else {

                        System.out.println("Booking Already Exists.");
                    }

                    break;

                case 2:

                    if (booked) {

                        System.out.println("\nCustomer Name : " + customerName);
                        System.out.println("Booked Tickets : " + bookedTickets);
                        System.out.println("Total Amount : ₹" + (bookedTickets * 200));

                    } else {

                        System.out.println("No Booking Found.");
                    }

                    break;

                case 3:

                    if (booked) {

                        availableSeats += bookedTickets;
                        bookedTickets = 0;
                        booked = false;

                        System.out.println("Booking Cancelled Successfully.");

                    } else {

                        System.out.println("No Booking Found.");
                    }

                    break;

                case 4:

                    System.out.println("Available Seats : " + availableSeats);

                    break;

                case 5:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}
import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String patientName = "";
        int patientAge = 0;
        String disease = "";
        boolean admitted = false;

        int choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Admit Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Update Patient Age");
            System.out.println("4. Discharge Patient");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (!admitted) {
                        System.out.print("Enter Patient Name: ");
                        patientName = sc.nextLine();

                        System.out.print("Enter Patient Age: ");
                        patientAge = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Disease: ");
                        disease = sc.nextLine();

                        admitted = true;

                        System.out.println("Patient Admitted Successfully!");
                    } else {
                        System.out.println("Patient Already Admitted!");
                    }
                    break;

                case 2:
                    if (admitted) {
                        System.out.println("\n----- Patient Details -----");
                        System.out.println("Name    : " + patientName);
                        System.out.println("Age     : " + patientAge);
                        System.out.println("Disease : " + disease);
                    } else {
                        System.out.println("No Patient Record Found!");
                    }
                    break;

                case 3:
                    if (admitted) {
                        System.out.print("Enter New Age: ");
                        patientAge = sc.nextInt();
                        System.out.println("Age Updated Successfully!");
                    } else {
                        System.out.println("No Patient Record Found!");
                    }
                    break;

                case 4:
                    if (admitted) {
                        admitted = false;
                        patientName = "";
                        patientAge = 0;
                        disease = "";

                        System.out.println("Patient Discharged Successfully!");
                    } else {
                        System.out.println("No Patient Record Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
import java.util.Scanner;

public class CollegeFeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = "";
        int rollNo = 0;
        double totalFee = 50000;
        double paidFee = 0;
        boolean studentAdded = false;

        int choice;

        do {

            System.out.println("\n===== COLLEGE FEE MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Pay Fee");
            System.out.println("3. View Student Details");
            System.out.println("4. Check Remaining Fee");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (!studentAdded) {
                        System.out.print("Enter Student Name: ");
                        studentName = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollNo = sc.nextInt();

                        studentAdded = true;

                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Student Already Added!");
                    }
                    break;

                case 2:
                    if (studentAdded) {
                        System.out.print("Enter Fee Amount to Pay: ₹");
                        double amount = sc.nextDouble();

                        if (paidFee + amount <= totalFee) {
                            paidFee += amount;
                            System.out.println("Fee Paid Successfully!");
                        } else {
                            System.out.println("Amount exceeds total fee!");
                        }
                    } else {
                        System.out.println("Add Student First!");
                    }
                    break;

                case 3:
                    if (studentAdded) {
                        System.out.println("\n===== STUDENT DETAILS =====");
                        System.out.println("Name          : " + studentName);
                        System.out.println("Roll Number   : " + rollNo);
                        System.out.println("Total Fee     : ₹" + totalFee);
                        System.out.println("Paid Fee      : ₹" + paidFee);
                    } else {
                        System.out.println("No Student Record Found!");
                    }
                    break;

                case 4:
                    if (studentAdded) {
                        System.out.println("Remaining Fee : ₹" + (totalFee - paidFee));
                    } else {
                        System.out.println("No Student Record Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
import java.util.Scanner;

public class GroceryStoreBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[20];
        int[] quantity = new int[20];
        double[] price = new double[20];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== GROCERY STORE BILLING =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Item Name: ");
                    itemName[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    System.out.print("Enter Price per Item: ₹");
                    price[count] = sc.nextDouble();

                    count++;

                    System.out.println("Item Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("Cart is Empty.");
                    } else {

                        System.out.println("\n===== CART ITEMS =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + itemName[i]);
                            System.out.println("Quantity : " + quantity[i]);
                            System.out.println("Price    : ₹" + price[i]);
                            System.out.println("-------------------------");
                        }
                    }

                    break;

                case 3:

                    double total = 0;

                    for (int i = 0; i < count; i++) {
                        total += quantity[i] * price[i];
                    }

                    double discount = 0;

                    if (total > 2000) {
                        discount = total * 0.05;
                    }

                    double finalBill = total - discount;

                    System.out.println("\n===== BILL =====");
                    System.out.println("Total Amount : ₹" + total);
                    System.out.println("Discount     : ₹" + discount);
                    System.out.println("Final Bill   : ₹" + finalBill);

                    break;

                case 4:

                    System.out.println("Thank You for Shopping!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

int original = x;
int reverse = 0;

while (x > 0) {
    int digit = x % 10;
    reverse = reverse * 10 + digit;
    x = x / 10;
}

if (original == reverse) {
    return true;
} else {
    return false;
}
