/* eslint-disable no-console */
import mediaView from '../views/media-view.js';
import articleService from '../services/article-service.js';

export default {
    async start() {
        
        const articles = await articleService.getArticle();
        const videos = await videoService.getVideo();
        homeView.start(articles, videos);

    },
    hash: 'articles',
    unload() {
        mediaView.clear();
    }
};
