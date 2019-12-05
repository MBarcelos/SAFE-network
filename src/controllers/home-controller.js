/* eslint-disable no-console */
import homeView from '../views/home-view.js';
import articleService from '../services/article-service.js';
import videoService from '../services/video-service.js';

export default {
    async start() {
        
        const articles = await articleService.getArticle();
        const videos = await videoService.getVideo();
        homeView.start(articles, videos);

    },
    hash: 'home',
    unload() {
        homeView.clear();
    }
};
