package my.examples.businesscard.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessCardMain {
    public static void main(String[] args){
        BusinessCardDao dao;
        BusinessCardUI ui = new BusinessCardUI();
        int inst;
        int id;
        String name;
        String phone;
        String corp;
        List<BusinessCard> searchList = new ArrayList<>();

        boolean flag = true;

        // 시작
        dao = new BusinessCardDao(ui.inputFileName()+".json");

        // 메뉴
        while(flag){
            inst = ui.menu();

            switch (inst) {
                case 1:
                    dao.inputBusinessCard(ui.inputBusinessCard());
                    System.out.println("명함을 추가했습니다.");
                    break;
                case 2:
                    int searchType = ui.searchMenu();
                    if (searchType == 1) {
                        searchList = dao.searchBusinessCard();
                        for(BusinessCard bc : searchList){
                            System.out.println(bc);
                        }
                    } else if (searchType == 2) {
                        searchList = dao.searchBusinessCard("name", ui.inputName());
                        for(BusinessCard bc : searchList){
                            System.out.println(bc);
                        }
                    } else if (searchType == 3) {
                        searchList = dao.searchBusinessCard("corporationName", ui.inputCorp());
                        for(BusinessCard bc : searchList){
                            System.out.println(bc);
                        }
                    } else {
                        System.out.println("메뉴를 잘못 입력했습니다.");
                    }
                    break;

                case 3:
                    id = ui.updateId();
                    if(!dao.checkId(id)){
                        System.out.println("Id가 존재하지 않습니다.");
                        break;
                    }
                    name = ui.inputName();
                    phone = ui.inputPhone();
                    corp = ui.inputCorp();
                    if(!dao.updateBusinessCard(id, name, phone, corp)){
                        System.out.println("수정에 실패했습니다..");
                    }else{
                        System.out.println("수정되었습니다.");
                    }
                    break;

                case 4:
                    id = ui.deleteId();
                    if (dao.deleteBusinessCard(id)) {
                        System.out.println("삭제되었습니다.");
                    } else {
                        System.out.println("삭제하지 못했습니다.");
                    }
                    break;

                case 5:
                    try {
                        dao.saveBusinessCardData();
                    }catch(MyException ex){
                        System.out.println("예외가 발생했습니다.");
                    }
                    flag = false;
                    break;
            }
        }
    }
}
