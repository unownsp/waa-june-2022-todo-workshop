INSERT INTO users (id,email,fname,lname,password) VALUES (1,'uinan@miu.edu','umur','inan','123');
INSERT INTO users (id,email,fname,lname,password) VALUES (2,'levi@miu.edu','keith','levi','123');


INSERT INTO to_do (id,completed,description,title,user_id) VALUES (1,true,'todo1','title1',1);
INSERT INTO to_do (id,completed,description,title,user_id) VALUES (2,true,'todo2','title2',1);


INSERT INTO comment (id,description,rating,to_do_id,user_id) VALUES  (1,'desc1',10,1,1);
INSERT INTO comment (id,description,rating,to_do_id,user_id) VALUES  (2,'desc2',8,1,2);