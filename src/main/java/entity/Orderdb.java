package entity;

public class Orderdb {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.orderID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.orderType
     *
     * @mbg.generated
     */
    private Integer ordertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.carID
     *
     * @mbg.generated
     */
    private Integer carid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.goodsName
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.goodsWeight
     *
     * @mbg.generated
     */
    private Integer goodsweight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.postPName
     *
     * @mbg.generated
     */
    private String postpname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.postAddr
     *
     * @mbg.generated
     */
    private String postaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.getPAddr
     *
     * @mbg.generated
     */
    private String getpaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.orderState
     *
     * @mbg.generated
     */
    private Integer orderstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.postPTel
     *
     * @mbg.generated
     */
    private String postptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.getPName
     *
     * @mbg.generated
     */
    private String getpname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.getPTel
     *
     * @mbg.generated
     */
    private String getptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.StateCity
     *
     * @mbg.generated
     */
    private String statecity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.midCity
     *
     * @mbg.generated
     */
    private String midcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.endCity
     *
     * @mbg.generated
     */
    private String endcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.shipPrice
     *
     * @mbg.generated
     */
    private Long shipprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.deliveryPrice
     *
     * @mbg.generated
     */
    private Long deliveryprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.transportPrice
     *
     * @mbg.generated
     */
    private Long transportprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.totalPrice
     *
     * @mbg.generated
     */
    private String totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.Car
     *
     * @mbg.generated
     */
    private String car;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdb.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.orderID
     *
     * @return the value of orderdb.orderID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.orderID
     *
     * @param orderid the value for orderdb.orderID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.orderType
     *
     * @return the value of orderdb.orderType
     *
     * @mbg.generated
     */
    public Integer getOrdertype() {
        return ordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.orderType
     *
     * @param ordertype the value for orderdb.orderType
     *
     * @mbg.generated
     */
    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.carID
     *
     * @return the value of orderdb.carID
     *
     * @mbg.generated
     */
    public Integer getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.carID
     *
     * @param carid the value for orderdb.carID
     *
     * @mbg.generated
     */
    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.goodsName
     *
     * @return the value of orderdb.goodsName
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.goodsName
     *
     * @param goodsname the value for orderdb.goodsName
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.goodsWeight
     *
     * @return the value of orderdb.goodsWeight
     *
     * @mbg.generated
     */
    public Integer getGoodsweight() {
        return goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.goodsWeight
     *
     * @param goodsweight the value for orderdb.goodsWeight
     *
     * @mbg.generated
     */
    public void setGoodsweight(Integer goodsweight) {
        this.goodsweight = goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.postPName
     *
     * @return the value of orderdb.postPName
     *
     * @mbg.generated
     */
    public String getPostpname() {
        return postpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.postPName
     *
     * @param postpname the value for orderdb.postPName
     *
     * @mbg.generated
     */
    public void setPostpname(String postpname) {
        this.postpname = postpname == null ? null : postpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.postAddr
     *
     * @return the value of orderdb.postAddr
     *
     * @mbg.generated
     */
    public String getPostaddr() {
        return postaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.postAddr
     *
     * @param postaddr the value for orderdb.postAddr
     *
     * @mbg.generated
     */
    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr == null ? null : postaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.getPAddr
     *
     * @return the value of orderdb.getPAddr
     *
     * @mbg.generated
     */
    public String getGetpaddr() {
        return getpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.getPAddr
     *
     * @param getpaddr the value for orderdb.getPAddr
     *
     * @mbg.generated
     */
    public void setGetpaddr(String getpaddr) {
        this.getpaddr = getpaddr == null ? null : getpaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.orderState
     *
     * @return the value of orderdb.orderState
     *
     * @mbg.generated
     */
    public Integer getOrderstate() {
        return orderstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.orderState
     *
     * @param orderstate the value for orderdb.orderState
     *
     * @mbg.generated
     */
    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.postPTel
     *
     * @return the value of orderdb.postPTel
     *
     * @mbg.generated
     */
    public String getPostptel() {
        return postptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.postPTel
     *
     * @param postptel the value for orderdb.postPTel
     *
     * @mbg.generated
     */
    public void setPostptel(String postptel) {
        this.postptel = postptel == null ? null : postptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.getPName
     *
     * @return the value of orderdb.getPName
     *
     * @mbg.generated
     */
    public String getGetpname() {
        return getpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.getPName
     *
     * @param getpname the value for orderdb.getPName
     *
     * @mbg.generated
     */
    public void setGetpname(String getpname) {
        this.getpname = getpname == null ? null : getpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.getPTel
     *
     * @return the value of orderdb.getPTel
     *
     * @mbg.generated
     */
    public String getGetptel() {
        return getptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.getPTel
     *
     * @param getptel the value for orderdb.getPTel
     *
     * @mbg.generated
     */
    public void setGetptel(String getptel) {
        this.getptel = getptel == null ? null : getptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.StateCity
     *
     * @return the value of orderdb.StateCity
     *
     * @mbg.generated
     */
    public String getStatecity() {
        return statecity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.StateCity
     *
     * @param statecity the value for orderdb.StateCity
     *
     * @mbg.generated
     */
    public void setStatecity(String statecity) {
        this.statecity = statecity == null ? null : statecity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.midCity
     *
     * @return the value of orderdb.midCity
     *
     * @mbg.generated
     */
    public String getMidcity() {
        return midcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.midCity
     *
     * @param midcity the value for orderdb.midCity
     *
     * @mbg.generated
     */
    public void setMidcity(String midcity) {
        this.midcity = midcity == null ? null : midcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.endCity
     *
     * @return the value of orderdb.endCity
     *
     * @mbg.generated
     */
    public String getEndcity() {
        return endcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.endCity
     *
     * @param endcity the value for orderdb.endCity
     *
     * @mbg.generated
     */
    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.shipPrice
     *
     * @return the value of orderdb.shipPrice
     *
     * @mbg.generated
     */
    public Long getShipprice() {
        return shipprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.shipPrice
     *
     * @param shipprice the value for orderdb.shipPrice
     *
     * @mbg.generated
     */
    public void setShipprice(Long shipprice) {
        this.shipprice = shipprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.deliveryPrice
     *
     * @return the value of orderdb.deliveryPrice
     *
     * @mbg.generated
     */
    public Long getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.deliveryPrice
     *
     * @param deliveryprice the value for orderdb.deliveryPrice
     *
     * @mbg.generated
     */
    public void setDeliveryprice(Long deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.transportPrice
     *
     * @return the value of orderdb.transportPrice
     *
     * @mbg.generated
     */
    public Long getTransportprice() {
        return transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.transportPrice
     *
     * @param transportprice the value for orderdb.transportPrice
     *
     * @mbg.generated
     */
    public void setTransportprice(Long transportprice) {
        this.transportprice = transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.totalPrice
     *
     * @return the value of orderdb.totalPrice
     *
     * @mbg.generated
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.totalPrice
     *
     * @param totalprice the value for orderdb.totalPrice
     *
     * @mbg.generated
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.Car
     *
     * @return the value of orderdb.Car
     *
     * @mbg.generated
     */
    public String getCar() {
        return car;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.Car
     *
     * @param car the value for orderdb.Car
     *
     * @mbg.generated
     */
    public void setCar(String car) {
        this.car = car == null ? null : car.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdb.COMMENT
     *
     * @return the value of orderdb.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdb.COMMENT
     *
     * @param comment the value for orderdb.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}