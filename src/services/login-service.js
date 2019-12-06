const api = {
    dataType: 'json',
    base: 'http://192.168.2.33:8080/womanizer/api',
    method: "POST"
};

var psycologist


async function submitLogin() {
    return new Promise((resolve, reject) => {
        //to change
        $.getJSON(`${api.base}/article`, {
        }).done(response => {
            console.log(response);
            resolve(response.map(data => ({
                id: data.id,
                title: data.title,
                content: data.content,
                image: data.image
            })));
        }).fail(reject);
    });
}

export default {
    getArticle
};
