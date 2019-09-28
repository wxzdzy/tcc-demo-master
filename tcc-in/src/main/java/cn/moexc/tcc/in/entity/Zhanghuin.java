package cn.moexc.tcc.in.entity;

public class Zhanghuin {
    /**
    * id
    */
    private Integer id;

    /**
    * 户名
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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