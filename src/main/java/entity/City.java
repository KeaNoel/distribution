package entity;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityID
     *
     * @mbg.generated
     */
    private String cityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityName
     *
     * @mbg.generated
     */
    private String cityname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceID
     *
     * @mbg.generated
     */
    private String provinceid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityID
     *
     * @return the value of city.cityID
     *
     * @mbg.generated
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityID
     *
     * @param cityid the value for city.cityID
     *
     * @mbg.generated
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityName
     *
     * @return the value of city.cityName
     *
     * @mbg.generated
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityName
     *
     * @param cityname the value for city.cityName
     *
     * @mbg.generated
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceID
     *
     * @return the value of city.provinceID
     *
     * @mbg.generated
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinceID
     *
     * @param provinceid the value for city.provinceID
     *
     * @mbg.generated
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }
}