function start(arrArticle, arrVideo) {
    renderArticle(arrArticle);
    renderVideo(arrVideo);
}

function clear() {
    $('#home-img').empty();
}

function renderArticle(array) {
    /* eslint-disable no-param-reassign */
    let html = array.reduce((acc, article) => {
        acc += `<h1 id="article-id">${article.title}</h1>`;
        acc += `<p id=article-body>${article.text}</p>`;
        acc += `<img src="../images/${article.img}" />`;
        return acc;
    }, '<div class="d-flex justify-content-around main-article"><div class="article>');
    html += '</div></div>';

    $('#article-body').append(html);
}

function renderVideo(array) {
    /* eslint-disable no-param-reassign */ 
    console.log("on video loop");

    let html = array.reduce((acc, video) => {
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