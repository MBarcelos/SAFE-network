function start(arrArticle) {
    renderArticle(arrArticle);

}

function clear() {
    $('#article-body').empty();
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

export default {
    start,
    clear
};
