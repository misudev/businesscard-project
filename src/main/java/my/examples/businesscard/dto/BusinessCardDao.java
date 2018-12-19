package my.examples.businesscard.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardDao implements BusinessCardDaoInterface{

    BusinessCardData businessCardData;

    ObjectMapper objectMapper;
    File file;


    public BusinessCardDao(String fileName){
       businessCardData = new BusinessCardData();
       objectMapper = new ObjectMapper();
       file = new File(fileName);
       init();
    }

    public void init(){
        readBusinessCardData();
    }

    public void inputBusinessCard(BusinessCard businessCard) {
        int id = businessCardData.getMaxNum();
        businessCard.setId(id);
        businessCardData.setMaxNum(id++);
        businessCardData.add(businessCard);
     }

    @Override
    public List<BusinessCard> searchBusinessCard() {
        return businessCardData.getBusinessCardList();
    }

    @Override
    public List<BusinessCard> searchBusinessCard(String type, String keyword) {
        List<BusinessCard> searchResult = new ArrayList<>();

        if (type.equals("name")) {
            for (BusinessCard bc : businessCardData.getBusinessCardList()) {
                if (bc.getName().equals(keyword)) {
                    searchResult.add(bc);
                }
            }
        } else if (type.equals("corporationName")) {
            for (BusinessCard bc : businessCardData.getBusinessCardList()) {
                if (bc.getcorporationName().equals(keyword)) {
                    searchResult.add(bc);
                }
            }
        }
        return searchResult;
        }

        public boolean checkId( int id ){
            return businessCardData.checkId(id);
        }

        @Override
        public boolean updateBusinessCard ( int id, String name, String phone, String corporation ){
            boolean flag = false;
            for(BusinessCard bc : businessCardData.getBusinessCardList()){
                if(bc.getId() == id){
                    bc.setName(name);
                    bc.setPhone(phone);
                    bc.setcorporationName(corporation);
                    flag = true;
                    break;
                }
            }
            return flag;
        }

        @Override
        public boolean deleteBusinessCard (int id){
           return businessCardData.delete(id);
        }

        public void saveBusinessCardData (){
            try {
                objectMapper.writeValue(file, businessCardData);
            }catch (Exception ex){
                throw new MyException(ex);
            }
        }

        public void readBusinessCardData (){
            try {
                if(!file.exists()) { saveBusinessCardData();}
                businessCardData = objectMapper.readValue(file, BusinessCardData.class);
            }catch (Exception ex){
                throw new MyException(ex);
            }
        }

    }


