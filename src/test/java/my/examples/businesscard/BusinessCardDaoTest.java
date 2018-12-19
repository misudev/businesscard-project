package my.examples.businesscard;

import my.examples.businesscard.dto.BusinessCard;
import my.examples.businesscard.dto.BusinessCardDao;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BusinessCardDaoTest {
    private BusinessCardDao dao;
/*
    @Before
    public void init(){
        dao = new BusinessCardDao("test.json");
        dao.inputBusinessCard("홍길동","010-111-1111", "fastcampus");
        dao.inputBusinessCard("홍길동", "010-1111-4343", "sony");
        dao.inputBusinessCard("가나다","017-123-4567", "fastcampus");

        try{
            //dao.readBusinessCardData();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void inputBC(){
        dao.inputBusinessCard("추가","010-777-7777","abc");
        for(BusinessCard bc : dao.searchBusinessCard()){
            System.out.println(bc);
        }
    }
    @Test
    public void deleteBC(){
        dao.deleteBusinessCard(2);
        for(BusinessCard bc : dao.searchBusinessCard()){
            System.out.println(bc);
        }
    }
    @Test
    public  void searchBC(){
        List<BusinessCard> al = dao.searchBusinessCard("name","홍길동");
        for(BusinessCard bc : al){
            System.out.println(bc);
        }

    }

    @Test
    public  void searchBC2(){
        List<BusinessCard> al = dao.searchBusinessCard("corporationName","fastcampus");
        for(BusinessCard bc : al){
            System.out.println(bc);
        }

    }

    @Test
    public void updateBC(){
        dao.updateBusinessCard(1,"홍길동","010-123-4567","청와대");
        for(BusinessCard bc : dao.searchBusinessCard()){
            System.out.println(bc);
        }
    }

    @Test
    public void saveData(){
        try{
            dao.saveBusinessCardData();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
*/
}
