# Write your MySQL query statement below
select e.name from employee e
join
(select managerid,count(id) from employee group by managerid having count(id)>=5) A on A.managerid= e.id