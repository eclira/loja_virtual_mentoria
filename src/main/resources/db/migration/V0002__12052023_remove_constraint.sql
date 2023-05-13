USE loja_virtual_mentoria;

DROP table usuarios_acesso;

CREATE TABLE usuarios_acesso (
	usuario_id bigint NOT NULL,
	acesso_id bigint NOT NULL,  
  UNIQUE KEY unique_acesso_user (usuario_id, acesso_id),
  CONSTRAINT acesso_fk FOREIGN KEY (acesso_id) REFERENCES acesso (id),
  CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;