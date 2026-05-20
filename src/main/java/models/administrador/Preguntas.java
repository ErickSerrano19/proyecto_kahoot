package models.administrador;

public class Preguntas {

    private String pregunta;
    private String respuestaCorrecta;

    private String[] opciones;

    public Preguntas(String pregunta, String respuestaCorrecta, String[] opciones) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.opciones = new String[4];
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

}
