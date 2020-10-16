
function fetchCall(url, requestOptions) {

  const base_url = url;

  var options = requestOptions;

  fetch(base_url, options)
    .then(response => response.json())
    .then(function (data) {
      showData(data);
    })
    .catch(error => console.log('error', error));

}


