package entity;

public class Deliveryrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.rangeID
     *
     * @mbg.generated
     */
    private Integer rangeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.rangeName
     *
     * @mbg.generated
     */
    private String rangename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    private Long deliveryprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.CityID
     *
     * @mbg.generated
     */
    private String cityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.rangeID
     *
     * @return the value of deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public Integer getRangeid() {
        return rangeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.rangeID
     *
     * @param rangeid the value for deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public void setRangeid(Integer rangeid) {
        this.rangeid = rangeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.rangeName
     *
     * @return the value of deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public String getRangename() {
        return rangename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.rangeName
     *
     * @param rangename the value for deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public void setRangename(String rangename) {
        this.rangename = rangename == null ? null : rangename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.deliveryPrice
     *
     * @return the value of deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    public Long getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.deliveryPrice
     *
     * @param deliveryprice the value for deliveryrange.deliveryPrice
     *
     * @mbg.generated
     */
    public void setDeliveryprice(Long deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.CityID
     *
     * @return the value of deliveryrange.CityID
     *
     * @mbg.generated
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.CityID
     *
     * @param cityid the value for deliveryrange.CityID
     *
     * @mbg.generated
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.COMMENT
     *
     * @return the value of deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.COMMENT
     *
     * @param comment the value for deliveryrange.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}