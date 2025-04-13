public enum Tipo {
    
    CACHORRO("Cachorro"), 
    GATO("Gato"), 
    COELHO("Coelho");

    private String desc;

    Tipo(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    
}
