package cn.moexc.tcc.out.entity;

public class Zhanghuout {
    /**
     * id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 持有货币数量
     */
    private Double monery;

    /**
     * 需要变动的货币数量
     */
    private Double moneryFrozen;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getMonery() {
        return monery;
    }

    public void setMonery(Double monery) {
        this.monery = monery;
    }

    public Double getMoneryFrozen() {
        return moneryFrozen;
    }

    public void setMoneryFrozen(Double moneryFrozen) {
        this.moneryFrozen = moneryFrozen;
    }
}