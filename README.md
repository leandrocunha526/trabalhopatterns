# Aluguel de vagas em garagem para carros

Sistema para o gerenciamento de vagas e clientes no aluguel de uma garagem de veículos. Estes locais são alugados pelas pessoas no centro de uma cidade para estacionar em locais mais seguros sem precisar de colocar na rua. O pagamento do aluguel é feito apenas via cédula (dinheiro em espécie). O sistema faz a notificação de entrada e de saída de veículos.

## Patterns usados no projeto

- State: Este pattern foi utilizado para definir os estados para a garagem como lotada, vazia, fechada e para casos o cliente tenha dias específicos. Para cada estado foi definido e retorna um aviso. Para este projeto não foi definido que haveria mais de um tipo de cliente, portando possuem casos que o mesmo possa ter dias específicos reservados e o sistema retornará uma mensagem informando.
   
- Template: Usado para definir duas informações relevantes para o aluguel da garagem que é o tempo e o valor que são úteis quando o cliente realiza o pagamento na sua saída, pois o tempo é levado em consideração e com base no tempo será definido um valor. 

- Observer: Eu tinha o problema que era para notificar o uso de uma vaga, e fiz utilizando este pattern com base na doc quando o sistema notifica que uma vaga está sendo utilizada e a saída do veículo da vaga, quando é definido ele notifica informando e esta é forma que foi contabilizada o uso de uma vaga.

## Usuários no Github

- gabrielgtba2009@hotmail.com = Gabriel Marra de Barros @gmmarra33  
Contribuições:
1. Classe EntradaESaida
1. Classe Observador
1. Classe Notifica
1. Edições ao README

- leandrocunha526@gmail.com = Leandro Cunha @leandrocunha526  
Contribuições:
1. Classe Cliente
1. Classe GaragemCarroEstado
1. Classe Pessoa
1. Classe Pagamento
1. Classe PagamentoCedula
1. Edições ao README

## Docs

- [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
- [Refactory Guru](https://refactoring.guru/pt-br/design-patterns)
