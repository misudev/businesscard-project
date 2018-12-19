package my.examples.businesscard.dto;

import java.util.List;

public interface BusinessCardDaoInterface {

    abstract void inputBusinessCard(BusinessCard bc);

    abstract List<BusinessCard> searchBusinessCard();

    abstract List<BusinessCard> searchBusinessCard(String type, String keyword);

    abstract boolean updateBusinessCard(int id, String name, String phone, String corporation);

    abstract boolean deleteBusinessCard(int id);

    abstract void saveBusinessCardData() throws Exception;

    abstract void readBusinessCardData() throws Exception;


}
