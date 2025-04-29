#Busca todas as avaliações que têm nota 4 ou mais.
SELECT * FROM avaliacoes WHERE nota >= 4;
# Busca todos os hotéis ativos no sistema.
SELECT * FROM hospedagens WHERE tipo = 'hotel' AND ativo = 1;
#Para cada cliente, calcula o valor médio que ele pagou nas locações/aluguéis (o chamado ticket médio).
SELECT cliente_id, AVG(preco_total) AS ticket_medio FROM alugueis GROUP BY cliente_id;

SELECT cliente_id, AVG(DATEDIFF(data_fim, data_inicio)) AS media_dias_estadia FROM alugueis GROUP BY cliente_id ORDER BY media_dias_estadia DESC;

SELECT p.nome AS nome_proprietario, COUNT(h.hospedagem_id) AS tota_hospedagens_ativas
FROM proprietarios p
JOIN hospedagens h ON p.proprietario_id = h.proprietario_id
WHERE h.ativo = 1
GROUP BY p.nome
ORDER BY total_hospedagens_ativa DESC
LIMIT 10;

SELECT p.nome AS nome_proprietario, COUNT(*) AS total_hospedagens_inativas
FROM proprietarios p
JOIN hospedagens h ON p.proprietario_id = h.proprietario_id
WHERE h.ativo = 0
GROUP BY p.nome;

SELECT YEAR(data_inicio) AS ano,
MONTH(data_inicio) AS mes,
COUNT(*) AS total_alugueis
FROM alugueis
GROUP BY ano, mes
ORDER BY total_alugueis DESC;