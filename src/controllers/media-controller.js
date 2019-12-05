/* eslint-disable no-console */
import mediaView from '../views/media-view.js';
import service from '../services/article-service.js';

export default {
    async start() {
        mediaView.start();
        const stories = await service.get();
        console.log(stories);
        mediaView.render(stories);
    },
    hash: 'media',
    unload() {
        mediaView.clear();
    }
};
