package my.examples.businesscard.dto;

import my.examples.businesscard.dto.BusinessCard;

import java.util.ArrayList;
import java.util.List;

public class BusinessCardData {

    private int maxNum;
    private List<BusinessCard> businessCardList;

    public BusinessCardData(){
        maxNum = 1;
        businessCardList = new ArrayList<>();
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public List<BusinessCard> getBusinessCardList() {
        return businessCardList;
    }

    public void setBusinessCardList(List<BusinessCard> businessCardList) {
        this.businessCardList = businessCardList;
    }

    @Override
    public String toString() {
        return "BusinessCardData{" +
                "maxNum=" + maxNum +
                ", businessCardList=" + businessCardList +
                '}';
    }

    public void add(BusinessCard bc) {
        businessCardList.add(bc);
    }

    public boolean delete(int id) {
        boolean find = false;
        for(BusinessCard businessCard : businessCardList){
            if(businessCard.getId() == id) {
                find = true;
                businessCardList.remove(businessCard);
                break;
            }
        }
        return find;
    }

    public boolean checkId(int id){
        boolean exist = false;
        for(BusinessCard businessCard : businessCardList){
            if(businessCard.getId() == id) {
                exist = true;
                break;
            }
        }
        return exist;
    }

}
