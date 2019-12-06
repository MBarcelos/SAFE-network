function start(arrContacts) {
    $("#main-section").hide();
    $('.footer').css({"position":"absolute"});
    renderContacts(arrContacts);
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quiz-body').empty();
    $('.footer').css({"position":"relative"});
}

function renderContacts(arr) {
    /* eslint-disable no-param-reassign */

    let html = arr.reduce((acc, contact) => {
        acc += `<div class="cell small-4"><h2>${contact.name}</h2>`;
        acc += `<p>${contact.email}</p></div>`;
        return acc;
    }, '');

    $('#contacts-body').append(html);

}

export default {
    start,
    clear
};
