package entity;

public class Province {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.provinceID
     *
     * @mbg.generated
     */
    private String provinceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.provinceName
     *
     * @mbg.generated
     */
    private String provincename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.provinceID
     *
     * @return the value of province.provinceID
     *
     * @mbg.generated
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.provinceID
     *
     * @param provinceid the value for province.provinceID
     *
     * @mbg.generated
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.provinceName
     *
     * @return the value of province.provinceName
     *
     * @mbg.generated
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.provinceName
     *
     * @param provincename the value for province.provinceName
     *
     * @mbg.generated
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }
}