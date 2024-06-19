-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;

salesman_id	salesman_name	salesman_city	commission	grade
5001	James Hoog	New York	15	300
5002	Nail Knite	Paris	13	100
5003	Pit Alex	London	11	100
5003	Pit Alex	London	11	100
5006	Pierre	Paris	14	100
5007	Paul Adam	Rome	13	200
5004	Lauson Hen	San Jose	12	100