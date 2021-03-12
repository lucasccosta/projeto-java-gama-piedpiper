package piedpipergamaacademia.projetofinaljava.model;

public enum UF {
    RO("Rondônia"),
    AC("Acre"),
    AM("Amazonas"),
    RR("Roraima"),
    PA("Pará"),
    AP("Amapá"),
    TO("Tocantins"),
    MA("Maranhão"),
    PI("Piauí"),
    CE("Ceará"),
    RN("Rio Grande do Norte"),
    PB("Paraíba"),
    PE("Pernambuco"),
    AL("Alagoas"),
    SE("Sergipe"),
    BA("Bahia"),
    MG("Minas Gerais"),
    ES("Espírito Santo"),
    RJ("Rio de Janeiro"),
    SP("São Paulo"),
    PR("Paraná"),
    SC("Santa Catarina"),
    RS("Rio Grande do Sul (*)"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    GO("Goiás"),
    DF("Distrito Federal");

    private final String estado;

    UF(String estado) {
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    public static UF toEnum (String estado) {

        if(estado == null) {
            return null;
        }
        for(UF estadoValido : UF.values()) {
            if(estado.equals(estadoValido.getEstado())) {
                return estadoValido;
            }

        }

        throw new IllegalArgumentException("Estado não existe ou foi digitado errado "+ estado);
    }


}
