$(document).ready(function() {
    $('#countrySelect').on('change', function(ev){
        var name = $(this).children("option:selected").val();
        $.get("/country", {'name' : name}, function( data ) {
            var select = document.getElementById('state');
            if (select) {
                select.parentNode.removeChild(select);
            }
            var select = document.createElement("select");
            select.setAttribute("id", "state");
            select.setAttribute("name", "state");
            select.setAttribute("class", "form-control");
            select.setAttribute("required", "");
            data.forEach(t => {
                var option = document.createElement("option");
                option.setAttribute("value", t.name);
                option.setAttribute("class", "form-control");
                option.appendChild(document.createTextNode(t.name));
                select.appendChild(option);
            })
            $('#kostyl').after(select);
        });
    });
});