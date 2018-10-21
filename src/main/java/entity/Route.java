package entity;

public class Route {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.routeID
     *
     * @mbg.generated
     */
    private String routeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.routeName
     *
     * @mbg.generated
     */
    private String routename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.provinceID
     *
     * @mbg.generated
     */
    private String provinceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.cityID
     *
     * @mbg.generated
     */
    private String cityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.midProvince
     *
     * @mbg.generated
     */
    private String midprovince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.midCity
     *
     * @mbg.generated
     */
    private String midcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.endProvince
     *
     * @mbg.generated
     */
    private String endprovince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.endCity
     *
     * @mbg.generated
     */
    private String endcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.transportPrice
     *
     * @mbg.generated
     */
    private Long transportprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column route.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.routeID
     *
     * @return the value of route.routeID
     *
     * @mbg.generated
     */
    public String getRouteid() {
        return routeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.routeID
     *
     * @param routeid the value for route.routeID
     *
     * @mbg.generated
     */
    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.routeName
     *
     * @return the value of route.routeName
     *
     * @mbg.generated
     */
    public String getRoutename() {
        return routename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.routeName
     *
     * @param routename the value for route.routeName
     *
     * @mbg.generated
     */
    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.provinceID
     *
     * @return the value of route.provinceID
     *
     * @mbg.generated
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.provinceID
     *
     * @param provinceid the value for route.provinceID
     *
     * @mbg.generated
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.cityID
     *
     * @return the value of route.cityID
     *
     * @mbg.generated
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.cityID
     *
     * @param cityid the value for route.cityID
     *
     * @mbg.generated
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.midProvince
     *
     * @return the value of route.midProvince
     *
     * @mbg.generated
     */
    public String getMidprovince() {
        return midprovince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.midProvince
     *
     * @param midprovince the value for route.midProvince
     *
     * @mbg.generated
     */
    public void setMidprovince(String midprovince) {
        this.midprovince = midprovince == null ? null : midprovince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.midCity
     *
     * @return the value of route.midCity
     *
     * @mbg.generated
     */
    public String getMidcity() {
        return midcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.midCity
     *
     * @param midcity the value for route.midCity
     *
     * @mbg.generated
     */
    public void setMidcity(String midcity) {
        this.midcity = midcity == null ? null : midcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.endProvince
     *
     * @return the value of route.endProvince
     *
     * @mbg.generated
     */
    public String getEndprovince() {
        return endprovince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.endProvince
     *
     * @param endprovince the value for route.endProvince
     *
     * @mbg.generated
     */
    public void setEndprovince(String endprovince) {
        this.endprovince = endprovince == null ? null : endprovince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.endCity
     *
     * @return the value of route.endCity
     *
     * @mbg.generated
     */
    public String getEndcity() {
        return endcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.endCity
     *
     * @param endcity the value for route.endCity
     *
     * @mbg.generated
     */
    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.transportPrice
     *
     * @return the value of route.transportPrice
     *
     * @mbg.generated
     */
    public Long getTransportprice() {
        return transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.transportPrice
     *
     * @param transportprice the value for route.transportPrice
     *
     * @mbg.generated
     */
    public void setTransportprice(Long transportprice) {
        this.transportprice = transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column route.COMMENT
     *
     * @return the value of route.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column route.COMMENT
     *
     * @param comment the value for route.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}