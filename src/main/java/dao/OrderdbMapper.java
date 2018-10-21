package dao;

import entity.Orderdb;
import java.util.List;

public interface OrderdbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdb
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdb
     *
     * @mbg.generated
     */
    int insert(Orderdb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdb
     *
     * @mbg.generated
     */
    Orderdb selectByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdb
     *
     * @mbg.generated
     */
    List<Orderdb> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdb
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Orderdb record);
}