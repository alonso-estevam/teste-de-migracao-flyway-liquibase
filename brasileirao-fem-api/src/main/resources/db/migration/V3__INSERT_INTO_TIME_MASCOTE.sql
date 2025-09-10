-- update many rows in a single UPDATE using a CASE expression:
UPDATE tb_time
SET mascote = CASE id
    WHEN 1 THEN 'raposa'
    WHEN 2 THEN 'mosqueteiro'
    WHEN 3 THEN 'urubu'
    WHEN 4 THEN 'saci'
    WHEN 5 THEN 'onça'
    WHEN 6 THEN 'leão do planalto'
    WHEN 7 THEN 'Mulher Maravilha'
END
WHERE id IN (1,2,3,4,5,6,7);
