package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entity.Country;
import entity.EmployeeEntity;
import entity.Region;
import service.CountryService;
import service.EmployeeService;
import service.RegionService;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        EmployeeService empService = new EmployeeService();
        CountryService countryService = new CountryService();
        RegionService regionService = new RegionService();

        int mainChoice;
        do {
            System.out.println("\n======= MAIN MENU =======");
            System.out.println("1. Employee CRUD");
            System.out.println("2. Country CRUD");
            System.out.println("3. Region CRUD");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1:
                    employeeMenu(sc, empService);
                    break;
                case 2:
                    countryMenu(sc, countryService);
                    break;
                case 3:
                    regionMenu(sc, regionService);
                    break;
                case 4:
                    System.out.println(" Exiting Program...");
                    break;
                default:
                    System.out.println(" Invalid option!");
            }
        } while (mainChoice != 4);

        sc.close();
    }

    
    private static void employeeMenu(Scanner sc, EmployeeService service) {
        int choice;
        do {
            System.out.println("\n===== Employee CRUD =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee last name ");
            System.out.println("4. Delete Employee");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    EmployeeEntity emp = new EmployeeEntity();
                    System.out.print("Enter First Name: ");
                    emp.setFirstName(sc.nextLine());
                    System.out.print("Enter Last Name: ");
                    emp.setLastName(sc.nextLine());
                    System.out.print("Enter Email: ");
                    emp.setEmail(sc.nextLine());
                    emp.setHireDate(new Date()); 
                    service.saveEmployee(emp);
                    System.out.println(" Employee added.");
                    break;
                case 2:
                    List<EmployeeEntity> empList = service.getAllEmployee();
                    empList.forEach(e -> {
                        System.out.println("ID: " + e.getEmp_id() + ", Name: " + e.getFirstName() + " " + e.getLastName() + ", Email: " + e.getEmail() + ", Hire Date: " + e.getHireDate());
                    });
                    break;
                case 3:
                    System.out.print("Enter Employee ID to update last name: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Last Name: ");
                    String newLastName = sc.nextLine();
                    service.updateEmp(updateId, newLastName);
                    System.out.println(" Updated if ID existed.");
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteEmp(deleteId);
                    System.out.println(" Deleted if existed.");
                    break;
                case 5:
                    break;
                default:
                    System.out.println(" Invalid choice.");
            }
        } while (choice != 5);
    }

   
    private static void countryMenu(Scanner sc, CountryService service) {
        int choice;
        do {
            System.out.println("\n====== Country CRUD ======");
            System.out.println("1. Add Country");
            System.out.println("2. View All Countries");
            System.out.println("3. Update Country Name");
            System.out.println("4. Delete Country");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Country ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Country Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Country Capital: ");
                    String capital = sc.nextLine();
                    Country country = new Country(id, name, capital);
                    service.saveCountry(country);
                    System.out.println(" Country added.");
                    break;
                case 2:
                    List<Country> countries = service.getAllCountries();
                    countries.forEach(c -> {
                        System.out.println("ID: " + c.getId() + ", Name: " + c.getCountryname() + ", Capital: " + c.getCountrycapital());
                    });
                    break;
                case 3:
                    System.out.print("Enter Country ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Country Name: ");
                    String newName = sc.nextLine();
                    service.updateCountry(updateId, newName);
                    System.out.println(" Updated if ID existed.");
                    break;
                case 4:
                    System.out.print("Enter Country ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteCountry(deleteId);
                    System.out.println("Deleted if existed.");
                    break;
                case 5:
                    break;
                default:
                    System.out.println(" Invalid choice.");
            }
        } while (choice != 5);
    }

  
    private static void regionMenu(Scanner sc, RegionService service) {
        int choice;
        do {
            System.out.println("\n ======Region CRURD ======");
            System.out.println("1. Add Region");
            System.out.println("2. View All Regions");
            System.out.println("3. Update Region Name");
            System.out.println("4. Delete Region");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Region ID: ");
                    int regionId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Region Name: ");
                    String regName = sc.nextLine();
                    Region region = new Region(regionId, regName);
                    service.saveRegion(region);
                    System.out.println("Region added.");
                    break;
                case 2:
                    List<Region> regions = service.getAllRegions();
                    regions.forEach(r -> {
                        System.out.println("ID: " + r.getId() + ", Name: " + r.getRegname());
                    });
                    break;
                case 3:
                    System.out.print("Enter Region ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Region Name: ");
                    String newName = sc.nextLine();
                    service.updateRegion(updateId, newName);
                    System.out.println(" Updated if ID existed.");
                    break;
                case 4:
                    System.out.print("Enter Region ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteRegion(deleteId);
                    System.out.println(" Deleted if existed.");
                    break;
                case 5:
                    break;
                default:
                    System.out.println(" Invalid choice.");
            }
        } while (choice != 5);
    }
}
