select CONSTRAINT_NAME  from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
where table_name = 'usuarios_acesso' 
and CONSTRAINT_NAME <> 'unique_acesso_user' and CONSTRAINT_NAME <> 'acesso_fk' and CONSTRAINT_NAME <> 'usuario_fk';

select *  from INFORMATION_SCHEMA.TABLE_CONSTRAINTS
where table_name = 'usuarios_acesso' ;


alter table usuarios_acesso drop CONSTRAINT UK_8bak9jswon2id2jbunuqlfl9e;





USE loja_virtual_mentoria;

DROP table usuarios_acesso;

CREATE TABLE usuarios_acesso (
	usuario_id bigint NOT NULL,
	acesso_id bigint NOT NULL,  
  UNIQUE KEY unique_acesso_user (usuario_id, acesso_id),
  CONSTRAINT acesso_fk FOREIGN KEY (acesso_id) REFERENCES acesso (id),
  CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


