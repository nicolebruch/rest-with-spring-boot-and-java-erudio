package br.com.erudio.rest_with_spring_boot_and_java_erudio.model;

//criado o modelo da resposta
//record já cria toda a estrutura básica pra guardar/representar os valores id e content
public record Greeting(long id, String content) {
}
