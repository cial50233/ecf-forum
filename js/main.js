


const messageSubForm = document.getElementById('messageSubForm');

const base_url = 'http://localhost:8081/messages';
//const base_url = "json/messages.json";

messageSubForm.addEventListener('submit',
    function (e) {
        //e.preventDefault();
        var d = new Date(Date.now());
        
        const last_modified_date = d.toISOString(); //"2021-02-05T22:08:28.097832";
        const author = 1;
        const title = document.getElementById('title').value;
        const theme = document.getElementById('theme').value;
        const message_content = document.getElementById('message_content').value;

        const data = {
            last_modified_date: last_modified_date,
            author: author,
            title: title,
            theme: theme,
            message_content: message_content
        };

        var myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/json");

        var raw = JSON.stringify(data);

        var requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: raw,
            redirect: 'follow'
        };

        console.log(raw);
        alert(raw);
        
        fetchCall(base_url, requestOptions);      
        window.location.href = 'http://127.0.0.1:5500/result.html';
    },
    false
);

function showData(datas) {
    window.location.href = 'http://127.0.0.1:5500/result.html';
}

const btn = document.getElementById("btn");

btn.addEventListener('click',
    function () {
        window.location.href = 'http://127.0.0.1:5500/result.html';
    }
);