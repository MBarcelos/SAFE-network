function start(arrVideo) {
    renderVideo(arrVideo);
}

function clear() {
    $('#video-body').empty();
}


function renderVideo(arr) {
    /* eslint-disable no-param-reassign */

    let html = arr.reduce((acc, video) => {
        acc += `<iframe width="100%" src="https://www.youtube.com/embed/${video.url}" 
        frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>`;
        return acc;
    }, '');

    $('#video-body').append(html);
}

export default {
    start,
    clear
};
