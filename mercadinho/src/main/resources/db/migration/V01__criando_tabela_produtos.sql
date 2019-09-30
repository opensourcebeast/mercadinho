CREATE TABLE produtos (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(80) NOT NULL,
  descricao varchar(100) NOT NULL,
  unidade varchar(2) DEFAULT NULL,
  data_cadastro DATE NOT NULL,
  valor_unitario DECIMAL(7,2) NOT NULL,
  estoque DECIMAL(5,2) NOT NULL,
  ativo BOOLEAN NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_nome (nome)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

