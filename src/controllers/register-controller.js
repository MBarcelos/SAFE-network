/* eslint-disable no-console */
import registerView from '../views/register-view.js';
// import videoService from '../services/video-service.js';

export default {
    async start() {
        registerView.start();
    },
    hash: 'psychologist',
    unload() {
        registerView.clear();
    }
};