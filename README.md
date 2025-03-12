# Password Generator

Este projeto é um Gerador de Senhas desenvolvido em Java com interface gráfica utilizando a biblioteca Swing. Ele permite que o usuário personalize a geração da senha escolhendo diferentes opções, como letras maiúsculas, letras minúsculas, números e caracteres especiais.

![image](https://github.com/user-attachments/assets/e1444292-d6b2-42e0-b7aa-a0832828d5fe)

<hr>

## Como Funciona
- O usuário insere o tamanho da senha.
- Seleciona as opções desejadas (maiúsculas, minúsculas, números, caracteres especiais).
- Clica em "Gerar Senha" para criar a senha.
- Se quiser gerar uma nova senha, clica em "Nova Senha" para redefinir as opções.

<hr>

##  Estrutura do Código

### **1. Classe `Main`**

A classe `Main` é o ponto de entrada do programa.

- Cria um objeto `Menu` para armazenar as opções.
- Cria uma instância de `Window` para iniciar a interface gráfica.

---

### **2. Classe `Window`**

A classe `Window` é responsável pela interface gráfica.

- Usa `JFrame` para criar a janela.
- Usa `JCheckBox` para as opções de senha.
- Usa `JButton` para os botões de ação.
- Usa `JTextField` para exibir a senha gerada.

|Elemento|Descrição|
|---|---|
|`JLabel`|Exibe o título e instruções.|
|`JTextField`|Recebe o tamanho da senha e mostra a senha gerada.|
|`JCheckBox`|Define as opções para gerar a senha.|
|`JButton`|Gera uma nova senha ou reseta o estado.|

---

### **3. Classe `Password`**

A classe `Password` gera uma senha com base nas opções fornecidas.

- Usa `Random` para gerar caracteres aleatórios.
- Usa `ArrayList` para armazenar as opções escolhidas.
- Implementa lógica para escolher letras, números ou caracteres especiais.

|Opção|Descrição|
|---|---|
|`1`|Letras maiúsculas|
|`2`|Letras minúsculas|
|`3`|Números|
|`4`|Caracteres especiais|

---

### **4. Classe `Menu`**

Armazena as opções selecionadas para geração da senha.

- Usa `ArrayList` para armazenar os tipos de caracteres escolhidos.
- Controla o estado da execução.

<hr>

## Como Executar
Clone o repositório:
```bash
git clone https://github.com/will-csc/Password-Generator
```

Navegue até o diretório do projeto:
```bash
cd Password-Generator
```

Compile o código:
```bash
javac Main.java Window.java Password.java Menu.java
```

Execute o programa:
```bash
java Main
```

