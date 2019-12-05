DELETE FROM article;
INSERT INTO article(ID, CREATIONTIME, UPDATETIME, VERSION, TITLE, CONTENT, IMAGE)
VALUES (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'This is an Article',
        'This is a screening measure to help you determine whether you might be involved in an abusive relationship that needs attention. This screening measure is not designed to make a diagnosis or take the place of a professional diagnosis or consultation. For each item, indicate the extent to which it is true, by checking the appropriate box next to the item.',
        'img1.jpg'),
       (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'This is another Article',
        'O Lorem Ipsum é um texto modelo da indústria tipográfica e de impressão. O Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde o ano de 1500, quando uma misturou os caracteres de um texto para criar um espécime de livro. Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia electrónica, mantendo-se essencialmente inalterada. Foi popularizada nos anos 60 com a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum, e mais recentemente com os programas de publicação como o Aldus PageMaker que incluem versões do Lorem Ipsum.',
        'img1.jpg'),
       (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'This one is awesome',
        'This is a screening measure to help you determine whether you might be involved in an abusive relationship that needs attention. This screening measure is not designed to make a diagnosis or take the place of a professional diagnosis or consultation. For each item, indicate the extent to which it is true, by checking the appropriate box next to the item.',
        'img1.jpg'),
       (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Learn a lot from this one',
        'This is a screening measure to help you determine whether you might be involved in an abusive relationship that needs attention. This screening measure is not designed to make a diagnosis or take the place of a professional diagnosis or consultation. For each item, indicate the extent to which it is true, by checking the appropriate box next to the item.',
        'img1.jpg'),
       (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'The last one, for now.',
        'Ao contrário da crença popular, o Lorem Ipsum não é simplesmente texto aleatório. Tem raízes numa peça de literatura clássica em Latim, de 45 AC, tornando-o com mais de 2000 anos. Richard McClintock, um professor de Latim no Colégio Hampden-Sydney, na Virgínia, procurou uma das palavras em Latim mais obscuras (consectetur) numa passagem Lorem Ipsum, e atravessando as cidades do mundo na literatura clássica, descobriu a sua origem. Lorem Ipsum vem das secções 1.10.32 e 1.10.33 do "de Finibus Bonorum et Malorum" (Os Extremos do Bem e do Mal), por Cícero, escrito a 45AC. Este livro é um tratado na teoria da ética, muito popular durante a Renascença. A primeira linha de Lorem Ipsum, "Lorem ipsum dolor sit amet..." aparece de uma linha na secção 1.10.32.
O pedaço mais habitual do Lorem Ipsum usado desde os anos 1500 é reproduzido abaixo para os interessados. As secções 1.10.32 e 1.10.33 do "de Finibus Bonorum et Malorum" do Cícero também estão reproduzidos na sua forma original, acompanhados pela sua tradução em Inglês, versões da tradução de 1914 por H. Rackham.',
        'img1.jpg');


DELETE FROM video;
INSERT INTO video(ID, CREATIONTIME, UPDATETIME, VERSION, TITLE, YOUTUBEID, THUMBNAIL)
VALUES (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Masha e o Urso - Um, Dois, Três!', 'RN0EIYL03Ac', 'thumbnail.png');

DELETE FROM QUIZ_RESPONSE;
INSERT INTO QUIZ_RESPONSE(ID, CREATIONTIME, UPDATETIME, VERSION, RESPONSETEXT, VALUE)
VALUES
       (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'No', 0),
       (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Yes', 2),
       (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Not Applicable', 0),
       (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Sometimes', 1),
       (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Regularly', 2);

DELETE FROM QUIZ_QUESTION;
INSERT INTO QUIZ_QUESTION(ID, CREATIONTIME, UPDATETIME, VERSION, QUESTION)
VALUES (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Question one has 3 responses.'),
       (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
          'Question two has 2 responses');

DELETE FROM QUIZ_QUESTION_QUIZ_RESPONSE;
INSERT INTO QUIZ_QUESTION_QUIZ_RESPONSE (QUIZQUESTION_ID, RESPONSES_ID)
VALUES (2, 1), (2, 2), (1, 1), (1, 4), (1, 5);