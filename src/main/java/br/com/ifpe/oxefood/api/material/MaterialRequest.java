package br.com.ifpe.oxefood.api.material;

import java.time.LocalDate;

import br.com.ifpe.oxefood.modelo.material.Material;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaterialRequest {
    

    private String titulo;
 
    private Double valor;

    private String resposavel;

    private String localizacao;

    private Double peso;

    private LocalDate dataAquisicao;
 
    public Material build() {
 
        return Material.builder()
                .titulo(titulo) 
                .valor(valor)
                .resposavel(resposavel)
                .localizacao(localizacao)
                .peso(peso)
                .dataAquisicao(dataAquisicao)
                .build();
        }
}


