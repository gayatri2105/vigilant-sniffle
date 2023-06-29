# write your mysql query statement below
select a.user_id,case when a.confirmation_rate is null then 0 else cast(a.confirmation_rate as decimal(10,2)) end as confirmation_rate from 
(select s.user_id,s1.confirmation_rate from signups s
left join (select user_id,avg(case when action='confirmed' then 1 else 0 end) as confirmation_rate from confirmations group by user_id )s1
on s.user_id=s1.user_id) a;