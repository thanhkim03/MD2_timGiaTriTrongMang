package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students ={"Hoàn","Toàn","Chiến","Thắng","Kinh","Thành","Thăng","Long",};
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i=0;i<students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println("thứ tự của học sinh "+input_name+" trong danh sách là: "+i);
                check = true;
                break;
            }
        }if (!check){
        System.out.println("thí sinh "+input_name+" không có trong danh sách");
    }
    }
}
