function start(arrArticle) {
    clear();
    $("#main-section").show();
    renderArticle(arrArticle);
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quiz-body').empty();
}

function renderArticle(arr) {
    /* eslint-disable no-param-reassign */
    let html = '';

    for (let i = 0; i <= 2; i++) {
        html += `<div class="cell small-4"><h2>${arr[i].title}</h2>`;
        html += `<p>${arr[i].summary}</p>`;
        html += `<a href="article/${arr[i].id}">Read more...</a></div>`;
    }

    $('#article-body').append(html);
}


export default {
    start,
    clear
};
