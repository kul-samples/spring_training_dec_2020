create table test.users(username varchar(20) primary key,password varchar(100) NOT NULL,enabled TINYint DEFAULT 1);

CREATE TABLE  test.authorities(username varchar(50) NOT NULL,  authority varchar(50) NOT NULL,  
     KEY fk_authorities_users (username),  CONSTRAINT fk_authorities_users FOREIGN KEY (username) 
      REFERENCES users (username));
      
       
