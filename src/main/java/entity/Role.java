package entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.roleID
     *
     * @mbg.generated
     */
    private String roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.roleName
     *
     * @mbg.generated
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.COMMENT
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.roleID
     *
     * @return the value of role.roleID
     *
     * @mbg.generated
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.roleID
     *
     * @param roleid the value for role.roleID
     *
     * @mbg.generated
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.roleName
     *
     * @return the value of role.roleName
     *
     * @mbg.generated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.roleName
     *
     * @param rolename the value for role.roleName
     *
     * @mbg.generated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.COMMENT
     *
     * @return the value of role.COMMENT
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.COMMENT
     *
     * @param comment the value for role.COMMENT
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}