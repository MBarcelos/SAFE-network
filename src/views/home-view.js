function start(arrArticle) {
    renderArticle(arrArticle);
}

function clear() {
    $('#article-body').empty();
    $('#register-body').empty();
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
