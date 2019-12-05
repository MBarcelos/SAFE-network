function start() {
    $('#body').append('<p>hello from search view</p>');
}

function clear() {
    $('#body').empty();
}

function render(stories) {
    /* eslint-disable no-param-reassign */
    let html = stories.reduce((acc, story) => {
        acc += `<h2>${story.title}</h2>`;
        acc += `<img src=${story.image} />`;
        return acc;
    }, '<div class="card">');
    html += '</div>';

    $('#body').append($(html));
}

export default {
    start,
    clear,
    render
};
