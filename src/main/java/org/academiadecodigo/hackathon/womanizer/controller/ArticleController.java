package org.academiadecodigo.hackathon.womanizer.controller;

import org.academiadecodigo.hackathon.womanizer.service.ArticleService;
import org.academiadecodigo.hackathon.womanizer.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    private ArticleService articleService;

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Article>> listArticles() {
        return new ResponseEntity<>(articleService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<HttpHeaders> addArticle(@RequestBody Article article, UriComponentsBuilder uriComponentsBuilder) {

        System.out.println("olá.. " + article.toString());
        Article savedArticle = articleService.save(article);

        UriComponents uriComponents = uriComponentsBuilder.path("/api/article/" + savedArticle.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

}
