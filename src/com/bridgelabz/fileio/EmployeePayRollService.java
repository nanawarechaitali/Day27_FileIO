package com.bridgelabz.fileio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOStream{ File_IO,Console_IO;}
    List<EmployeePayRollData> employeePayRollDataList;


    EmployeePayRollService(List<EmployeePayRollData>  employeePayRollDataList){
        this.employeePayRollDataList=employeePayRollDataList;
    }

    public static void main(String[] args) {


        ArrayList<EmployeePayRollData> payrollList = new ArrayList<>();
        EmployeePayRollService employeePayRollService= new EmployeePayRollService(payrollList);
        employeePayRollService.writeData();
        employeePayRollService.readData();
    }
    public void writeData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        System.out.println("Enter Employee name");
        String name = sc.next();
        System.out.println("Enter Employee salary");
        double salary = sc.nextDouble();


        employeePayRollDataList.add(new EmployeePayRollData(id,name,salary));


    }


    public  void readData() {
        Iterator iterator = employeePayRollDataList.iterator();
        while (iterator.hasNext() ) {
            System.out.println(iterator.next()+ " ");
        }
    }
}
