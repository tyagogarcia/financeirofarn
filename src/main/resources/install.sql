-- Scripts para popular o banco

 insert into usuario (id, username, senha) values( 1, 'admin','admin');
 insert into usuario (id, username, senha) values( 2, 'joao','joao');
 insert into usuario (id, username, senha) values( 3, 'maria','maria');
 insert into usuario (id, username, senha) values( 4, 'marcos','marcos');

insert into papel (id, denominacao) values(1,'PAPEL_ADMIN');
insert into papel (id, denominacao) values(2,'PAPEL_USUARIO');

 INSERT INTO permissao(id, id_papel, id_usuario) VALUES (1,1, 1); 
 INSERT INTO permissao(id, id_papel, id_usuario) VALUES (2,2, 2); 
 INSERT INTO permissao(id, id_papel, id_usuario) VALUES (3,2, 3); 
 INSERT INTO permissao(id, id_papel, id_usuario) VALUES (4,2, 4); 

insert into tipoconta (id, denominacao) values (1,'A PAGAR')
insert into tipoconta (id, denominacao) values (2,'A RECEBER')

insert into estabelecimento (id, denominacao) values(1,'Estabelecimento X')
insert into estabelecimento (id, denominacao) values(2,'Estabelecimento Y')
insert into estabelecimento (id, denominacao) values(3,'Estabelecimento Z')
insert into estabelecimento (id, denominacao) values(4,'Estabelecimento W')
insert into estabelecimento (id, denominacao) values(5,'Estabelecimento 123')

 
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(1,1,1,1,100);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(2,2,2,1,24.34);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(3,1,1,1,424.50);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(4,3,1,2,550);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(5,3,1,3,1550);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(6,3,1,3,80);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(7,3,2,3,10);
insert into conta (id,id_estabelecimento, id_tipoconta, id_usuario,saldoatual) values(8,3,2,4,120);

-- Falta parcela!
