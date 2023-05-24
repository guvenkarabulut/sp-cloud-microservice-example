CREATE keyspace sp_cloud with replication ={'class':'SimpleStrategy','replication_factor':3};

use sp_cloud;
CREATE TABLE emp(
                    emp_id int PRIMARY KEY,
                    emp_name text,
                    emp_city text,
                    emp_sal varint,
                    emp_phone varint
);

select * from emp
select * from accounts