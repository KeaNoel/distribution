package dao;

import entity.Province;
import java.util.List;

public interface ProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String provinceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated
     */
    Province selectByPrimaryKey(String provinceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated
     */
    List<Province> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Province record);
}