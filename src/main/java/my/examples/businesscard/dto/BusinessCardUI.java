package my.examples.businesscard.dto;

import java.util.Scanner;

public class BusinessCardUI {

    Scanner scanner = new Scanner(System.in);

    // 처음 실행 시 파일 이름을 입력받는 메소드
    public String inputFileName(){
        System.out.println("파일 이름을 입력하세요 : ");
        return scanner.next();
    }
    // 메뉴
    public int menu(){
        System.out.println("--------------- 명함 관리 프로그램 ----------------");
        System.out.println(" 1. 명함 입력 ");
        System.out.println(" 2. 명함 조회 ");
        System.out.println(" 3. 명함 수정 ");
        System.out.println(" 4. 명함 삭제 ");
        System.out.println(" 5. 프로그램 종료");
        System.out.println("--------------- 메뉴번호를 입력하세요 ---------------");
        System.out.println(" ***** 프로그램을 종료해야 저장이 됩니다. *****");
        return scanner.nextInt();
    }
    // 1. 명함 입력
    public BusinessCard inputBusinessCard(){
        System.out.println("이름을 입력하세요 :");
        String name = scanner.next();
        System.out.println("전화번호를 입력하세요 :");
        String phone = scanner.next();
        System.out.println("회사이름을 입력하세요 :");
        String corp = scanner.next();
        return new BusinessCard(name, phone, corp);
    }
    // 2. 조회 메뉴
    public int searchMenu(){
        System.out.println("메뉴를 고르세요");
        System.out.println("(1) 전체 명함 조회");
        System.out.println("(2) 이름으로 명함 조회");
        System.out.println("(3) 회사이름으로 명함 조회");
        return scanner.nextInt();
    }

    public String inputName(){
        System.out.println(" 이름을 입력하세요 : ");
        return scanner.next();
    }

    public String inputPhone(){
        System.out.println(" 전화번호를 입력하세요 : ");
        return scanner.next();
    }

    public String inputCorp(){
        System.out.println("회사이름을 입력하세요 : ");
        return scanner.next();
    }
    // 3. 명함 수정
    public int updateId(){
        System.out.println("수정할 명함의 ID를 입력하세요 : ");
        return scanner.nextInt();
    }
    // 4. 명함 삭제
    public int deleteId(){
        System.out.println("삭제할 명함의 ID를 입력하세요 : ");
        return scanner.nextInt();
    }


}
