function start(arrArticle, arrVideo) {
    renderArticle(arrArticle);
    renderVideo(arrVideo);
}

function clear() {
    $('#home-img').empty();
}

function renderArticle(arr) {
    /* eslint-disable no-param-reassign */

        let html = arr.reduce((acc, article) => {
            acc += `<div class="cell small-4"><h2>${article.title}</h2>`;
            acc += `<p>${article.content}</p></div>`;
            return acc;
        }, '');

        $('#article-body').append(html);
        
}

function renderVideo(arr) {
    /* eslint-disable no-param-reassign */

    let html = arr.reduce((acc, video) => {
        console.log(video);
        return acc + `<iframe width="560" height="315" src="https://www.youtube.com/embed/${video.url}" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>`;
    }, '<div>');

    html += '</div>';

    $('#video-body').append(html);
}

export default {
    start,
    clear
};
