
start the service

sudo systemctl start postgresql


status of the service

sudo systemctl status postgresql

to login as postgres user

sudo su - postgres

update user password

psql -c "alter user postgres with password 'password here'"

my current password is 'password'


```
postgres=# CREATE USER testuser WITH ENCRYPTED PASSWORD 'MyPassword';
CREATE ROLE
postgres=# GRANT ALL PRIVILEGES ON DATABASE testdb to testuser;
GRANT
```





