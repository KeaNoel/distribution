package dao;

import entity.Deliveryreceipt;
import java.util.List;

public interface DeliveryreceiptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String statecity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int insert(Deliveryreceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    Deliveryreceipt selectByPrimaryKey(String statecity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    List<Deliveryreceipt> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Deliveryreceipt record);
}