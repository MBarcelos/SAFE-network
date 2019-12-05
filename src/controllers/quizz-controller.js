/* eslint-disable no-console */
/* eslint-disable no-console */
import quizzView from '../views/quizz-view.js';

export default {
    async start() {
        await quizzView.start();
    },
    hash: 'quizz',
    unload() {
        quizzView.clear();
    }
};
