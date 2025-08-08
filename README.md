# 📋 Formulário Swing Simples

Este projeto é uma aplicação Java simples utilizando **Swing** para criar uma interface gráfica de cadastro de usuários.  
O formulário coleta **nome**, **e-mail**, **idade** e **sexo** do usuário, com validação de e-mail integrada.

---

## 🚀 Funcionalidades

- **Interface gráfica com Swing** para entrada de dados.
- Campos para:
  - Nome
  - E-mail (com validação usando **regex**)
  - Idade
  - Sexo (Masculino / Feminino)
- Botão **Cadastrar**:
  - Valida o formato do e-mail.
  - Exibe os dados cadastrados em um `JOptionPane`.
- Botão **Limpar**:
  - Limpa todos os campos do formulário.
  - Remove a seleção de sexo.

---

## 🖥️ Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- **Java JDK** 8 ou superior  
- Um compilador Java (pode ser do próprio VScode, baixando o Extension Pack for Java)

---

## ⚙️ Como Executar

1. **Baixe** o arquivo `FormularioSwingSimples.java` ou clone o repositório.
2. Abra um terminal na pasta onde o arquivo está salvo.
3. Compile e execute o programa por meio da setinha `▷` no canto superior direito.

---

## 📜 Explicação do Código

- **`JFrame`**: Cria a janela principal do formulário.
- **`JLabel` e `JTextField`**: Usados para os campos de entrada de texto.
- **`JRadioButton` + `ButtonGroup`**: Opções de seleção única para o sexo.
- **`JButton`**:
  - **Cadastrar**: Coleta os dados, valida o e-mail e exibe as informações.
  - **Limpar**: Reseta todos os campos do formulário.
- **Validação de e-mail**:
  - Implementada no método `validarEmail(String email)` usando **expressões regulares (Regex)**.

---

## 🧪 Exemplo de Uso

1. O usuário preenche:
   ```
   Nome: João da Silva
   E-mail: joao.silva@email.com
   Idade: 25
   Sexo: Masculino
   ```
2. Ao clicar em **Cadastrar**, a aplicação exibe:
   ```
   Usuário Cadastrado:
   Nome: João da Silva
   E-mail: joao.silva@email.com
   Idade: 25
   Sexo: Masculino
   ```

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Swing** (para a interface gráfica)
- **Regex** (para validação de e-mail)

---
