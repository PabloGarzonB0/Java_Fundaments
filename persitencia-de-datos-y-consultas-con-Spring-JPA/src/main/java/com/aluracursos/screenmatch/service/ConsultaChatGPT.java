package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto){
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-4o-mini")
                .prompt("Traduce a espanil el siguiente texto: "+texto)
                .maxTokens(1000)
                .temperature(0.7) //Variaciones que se puede tener entre un servicio y otro
                .build();
        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}
