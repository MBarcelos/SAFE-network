DELETE FROM article;
INSERT INTO article(ID, CREATIONTIME, UPDATETIME, VERSION, TITLE, CONTENT, IMAGE)
VALUES (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Domestic violence cases increase in Lisbon',
        'Portugal''s public prosecutor received 3,487 cases of domestic violence offences in Lisbon district between January and March, according to official figures released on Wednesday.Around 2,700 cases were registered in the same period in 2018.<br>
        The statistics issued by Lisbon''s public prosecutor''s office also show that 1,958 cases were shelved between January and March this year.
In recent months activists have taken the streets to protest domestic violence, which has already killed 12 women this year.
In 2018, 28 women in Portugal were killed through domestic violence.<br>
Activists and experts point out that domestic violence abusers are given lenient judgements and have called for an end to victim-blaming and what they call sexist court rulings.
<br>
In 2017, a Portuguese man who attacked his wife was not sent to prison because the judge deemed - citing the Old Testament - that his reaction was somewhat reasonable because she had committed adultery.',
        'img1.jpg'),
       (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'This is another Article',
        '',
        'img1.jpg'),
       (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'This one is awesome',
        '',
        'img1.jpg'),
       (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'Learn a lot from this one',
        '',
        'img1.jpg'),
       (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0,
        'The last one, for now.',
        '',
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