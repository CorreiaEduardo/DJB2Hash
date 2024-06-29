# DJB2 HASH

## Sobre o algoritmo
<p>
    O hash DJB2, formulado pelo Professor Daniel J. Bernstein, foi inicialmente
    introduzido ao público através do newsgroup "comp.lang.c" do Usenet.
    O DJB2 é uma função de hash de alto desempenho
    conhecida por sua velocidade e simplicidade. Através de uma sequência
    de operações bitwise e aritmética modular, ele converte os dados de entrada
    em códigos de hash de tamanho fixo com 32 bits de comprimento.
</p> 

## Equipe
<table>
<td align="center">
  <img style="width: 30%; border-radius: 50%" src="https://media.licdn.com/dms/image/D4D03AQHmwJgqrSdPIw/profile-displayphoto-shrink_400_400/0/1668289132010?e=1722470400&v=beta&t=PO99CgBKVGz4Zr-OdF-PVj7TTvwe4gpXApby7tr03LA" alt="Eduardo Correia"/>
  <br />
  <sub><b>Eduardo Correia</b></sub>
  <br />
  <a href="https://www.linkedin.com/in/correiaeduardojr/" alt="Linkedin">
    <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/correiaeduardojr/" style="width: 90px;" alt="Linkedin Profile Picture"/>
  </a>
</td>


<td align="center">
<img style="width: 51%; border-radius: 50%" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxp7SkVO6ROHK8ZHQQNeAO2c9gUtFWCWDaG6EIqUT70g&s"  alt="Guilherme França"/>
  <br />
  <sub><b>Guilherme França</b></sub>
  <br />
  <a href="https://www.linkedin.com/in/" alt="Linkedin">
    <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/" style="width: 90px;" alt="Linkedin Profile Picture"/>
  </a>
</td>

<td align="center">
  <img style="width: 30%; border-radius: 50%" src="https://media.licdn.com/dms/image/D4D03AQGUKiPrtNaQ4Q/profile-displayphoto-shrink_400_400/0/1689463711292?e=1722470400&v=beta&t=_WhbVZrq-CDYiDCg05NwIO9KDPlHMc0AgVfZBZ2HOCU" alt="João Vítor Café"/>
  <br />
  <sub><b>João Vítor Café</b></sub>
  <br />
  <a href="https://www.linkedin.com/in/joaovitorcafe/" alt="Linkedin">
    <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://www.linkedin.com/in/joaovitorcafe/" style="width: 90px;" alt="Linkedin Profile Picture"/>
  </a>
</td>
</table>

## Referências
Código original de referência retirado de Lassonde School of Engineering - York University, Canada.
http://www.cse.yorku.ca/~oz/hash.html
```
#include <stdio.h>

unsigned long hash(unsigned char *str);

int main()
{
    printf("%lu\n", hash((unsigned char *)"test"));
    return 0;
}

unsigned long hash(unsigned char *str)
{
    unsigned long hash = 5381;
    int c;

    while ((c = *str++))
        hash = ((hash << 5) + hash) + c; /* hash * 33 + c */

    return hash;
}
```
(Código C referência adaptado para execução rápida)

## Instruções para execução
1. **Pré-requisitos:**
    - Kit de Desenvolvimento Java (JDK) instalado no seu sistema.

2. **Passos:**

    - **Passo 1:** Abra um prompt de comando ou terminal.

    - **Passo 2:** Navegue até o diretório onde seu arquivo `DJB2Hash.java` está localizado usando o comando `cd`:
      ```
      cd caminho/para/seu/arquivo/java
      ```

    - **Passo 3:** Compile o arquivo Java usando o comando `javac`:
      ```
      javac DJB2Hash.java
      ```

    - **Passo 4:** Execute o programa Java compilado usando o comando `java`:
      ```
      java DJB2Hash
      ```

    - **Passo 5:** Siga as instruções na tela. Você será solicitado a inserir uma string para a qual o valor de hash DJB2 será calculado.