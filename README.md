# Aluguel de vagas em garagem para carros

Sistema para o gerenciamento de vagas e clientes no aluguel de uma garagem de veículos. Estes locais são alugados pelas pessoas no centro de uma cidade para estacionar em locais mais seguros sem precisar de colocar na rua. O pagamento do aluguel é feito apenas via cédula (dinheiro em espécie). O sistema faz a notificação de entrada e de saída de veículos.

## Patterns usados no projeto

- State: Padrão comportamental que permite que o objeto altere o seu comportamento quando o estado interno muda. Este pattern foi utilizado para definir os estados para a garagem como lotada, vazia, fechada e para caso o cliente tenha dias específicos foi usado para definir cada estado e para retornar uma mensagem com a informação sobre este estado. Para este projeto não foi definido que haveria mais de um tipo de cliente, portando possuem casos que o mesmo possa ter dias específicos reservados e o sistema retornará uma mensagem informando.
   
- Template: Usado para definir as etapas para obter duas informações relevantes para o pagamento do aluguel da garagem que é o tempo e o valor que são úteis quando o cliente realiza o pagamento na sua saída, pois o tempo é levado em consideração e com base no tempo será definido um valor para pagamento.

- Observer: Usado para definir mecanismo de assinatura para notificar vários objetos sobre quaisquer dos eventos que ocorra. Tinha o problema que era para notificar o uso de uma vaga e foi feito utilizando este pattern com base na doc quando o sistema notifica que uma vaga está sendo utilizada e a saída do veículo da vaga, quando é definido ele notifica informando e esta é a forma que é contabilizada o uso de uma vaga.

## Usuários no Github

- E-mail: gabrielgtba2009@hotmail.com  
  Nome: Gabriel Marra de Barros   
  Usuário: @gmmarra33  

Contribuições:

1. Classe EntradaESaida
1. Classe Observador
1. Classe Notifica
1. Edições ao README

- E-mail: leandrocunha526@gmail.com   
  Nome: Leandro Cunha   
  Usuário: @leandrocunha526

Contribuições:

1. Classe Cliente
1. Classe GaragemCarroEstado
1. Classe Pessoa
1. Classe Pagamento
1. Classe PagamentoCedula
1. Edições ao README

_OBS: Houve um problema em um dos testes realizados para testar o build sob os commits feitos e para corrigir isto foi necessário forçar um push que conflitava com todos os outros commits após o teste e ocorreu automaticamente que causou a exclusão dos commits feitos anteriormente. O projeto foi testado com Netbeans 12.1. Com objetivo de assegurar caso clone o projeto ele funcionará corretamente, no presente momento os testes foram executados com sucesso e o projeto está funcionando corretamente nesta versão da IDE._

## Docs

- [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
- [Refactory Guru](https://refactoring.guru/pt-br/design-patterns)
- [Presentation](https://docs.google.com/document/d/1Z6g3xr79XRCYGBhgmJtVsDSGgJcg5vqU30RMt941bcU/edit?usp=sharing)
