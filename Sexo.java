public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino")
    ;
    private String desc;

    Sexo(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
