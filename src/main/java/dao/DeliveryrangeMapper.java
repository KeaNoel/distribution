package dao;

import entity.Deliveryrange;
import java.util.List;

public interface DeliveryrangeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer rangeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int insert(Deliveryrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    Deliveryrange selectByPrimaryKey(Integer rangeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    List<Deliveryrange> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Deliveryrange record);
}