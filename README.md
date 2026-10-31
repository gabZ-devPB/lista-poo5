1- 

A partir do Java 8, tornou-se possível implementar métodos com corpo dentro de interfaces, por meio dos métodos default e static.
- Métodos default: permitem adicionar implementações padrão às interfaces. Assim, as classes que implementam a interface podem utilizar esses métodos sem precisar sobrescrevê-los. Isso facilita a evolução de sistemas sem quebrar implementações existentes.
- Métodos static: são métodos associados à própria interface, podendo ser chamados diretamente pelo nome dela, sem precisar instanciar uma classe. São úteis para disponibilizar funcionalidades auxiliares relacionadas à interface.

2-

As interfaces permitem que diferentes classes sigam um mesmo contrato, sem que o sistema dependa diretamente de uma implementação específica.
Isso promove o desacoplamento, pois uma classe pode utilizar outra por meio de uma interface, sem precisar conhecer seus detalhes internos.

Em um sistema de pagamentos, podemos criar uma interface Pagamento com o método pagar().
Diferentes classes, como PagamentoPix, PagamentoCartao e PagamentoBoleto, podem implementar essa interface.
Dessa forma, o sistema pode trabalhar com qualquer forma de pagamento sem precisar modificar sua estrutura principal. Isso facilita a manutenção, a expansão e a substituição de funcionalidades.
