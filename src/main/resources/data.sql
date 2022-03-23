CREATE TABLE IF NOT EXISTS Clientes(
    clienteid int NOT NULL,
    cpfcnpj varchar(255) NULL,
    data DATE NULL,
    CONSTRAINT Clientes_pkey PRIMARY KEY (clienteid)
);
DELETE FROM Clientes;
INSERT INTO Clientes(clienteid, cpfcnpj, data) VALUES (1, '027098060000145', CURRENT_DATE);