function start(arrVideo) {
    renderVideo(arrVideo);
}

function clear() {
    $('#video-body').empty();
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
