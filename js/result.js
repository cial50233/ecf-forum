

const container = document.getElementById('container');

const base_url = 'http://localhost:8081/messages';
//const base_url = "json/messages.json";

const btn = document.getElementById("btn");

btn.addEventListener('click',
    function () {
        window.location.href = 'http://127.0.0.1:5500/submit.html';
    }
);

var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var requestOptions = {
};

document.addEventListener('DOMContentLoaded', e => {
    fetchCall(base_url, requestOptions);
})


function showData(datas) {
    datas.map(messages => createMessage(messages))
}

createMessage = (message) => {

        let listItem = document.createElement('div');
        listItem.classList.add("message");
        listItem.appendChild(
            document.createElement('p')
        ).textContent = 'Theme : ' + message.theme.name;
        listItem.appendChild(
            document.createElement('p')
        ).textContent = 'Title : ' + message.title;
        listItem.appendChild(
            document.createElement('p')
        ).textContent = 'Last modified at : ' + Date(message.last_modified_date).toString();
        listItem.appendChild(
            document.createElement('p')
        ).textContent = 'Author : ' + message.author.name;
        listItem.appendChild(
            document.createElement('hr')
        );
        listItem.appendChild(
            document.createElement('p')
        ).textContent = message.content;

        var x = document.createElement('button');
        x.textContent = 'Reply';

        x.addEventListener('click',
            function (e) {
                alert("reply");
            }
        );

        listItem.appendChild(x);

        container.appendChild(listItem);

}
