/**
 * Created by JPMPC-B208 on 11/24/2016.
 */
$('form').validatr();
/*var n=5;
var x=1;
var result = n+x;

/!*$("#btn1").click(function () {

    var divCount = $("div").length;
    for(var i=0;i<divCount;i++){

    }
    // alert("There are = " + i + " divs and it will change the background colors into RED");
    $("div").css({background: colors[random]});
});*!/


document.getElementById("result").innerHTML = "result is " + result;

var mySubmitBtn = document.getElementById("submitBtn");
mySubmitBtn.onclick = function (event) {
    event.preventDefault();
    mySubmitBtn.style.display = "none";
};

/!* START OF AUDIO *!/

var playPauseBtn = document.getElementById("playBtn");
var audio = document.getElementById("myAudio");

    playPauseBtn.onclick = function () {
        if(audio.paused) {
            audio.play();
            playPauseBtn.textContent = "PAUSE";
        }
        else {
            audio.pause();
            playPauseBtn.textContent = "PLAY";
        }
    };
    $("#btn1").click( function () {
        findDivs();
    })


    /!*setInterval(function () {
        findDivs();
    }, 1000);*!/

    function findDivs() {
            var divCount = $("div");
            var colors = Array("yellow" , "pink", "green", "black", "red");



            for(var i=0;i<divCount.length;i++){
                var random = Math.floor(Math.random() * colors.length) ;
                // alert("There are = " + i + " divs and it will change the background colors into RED");
                // divCount[randomDiv].style.backgroundColor = colors[random];
                divCount.eq(i).css({background: colors[random]});
            }
    }


    function stopAudio() {
        audio.pause();
        audio.currentTime = 0;
        playPauseBtn.textContent = "PLAY";
    }

/!* END OF AUDIO *!/
*/
/* START OF VIDEO*/
var vidPlayPauseBtn = document.getElementById("vidPlayBtn")
var video = document.getElementById("myVideo");

vidPlayPauseBtn.onclick = function () {
    if(video.paused) {
        video.play();
        vidPlayPauseBtn.textContent = "PAUSE";
    }
    else {
        video.pause();
        vidPlayPauseBtn.textContent = "PLAY";
    }

};

function vidStopAudio() {
    video.pause();
    video.currentTime = 0;
    vidPlayPauseBtn.textContent = "PLAY";
}

function fullScreen() {
    video.webkitRequestFullscreen();
}

/* END OF VIDEO */

/* START OF AJAX ACTIVITY */

document.getElementById("result").innerHTML = "result is " + result;

var mySubmitBtn = document.getElementById("submitBtn");
mySubmitBtn.onclick = function (event) {
    event.preventDefault();
    mySubmitBtn.style.display = "none";
};



$("#demo-btn").click(function () {
    $.ajax({
        method: "GET",
        url: "ajax_info.json",
        error: function (a,b,c) {
            console.log(c);
        },
        success: function (data,a,b,c) {
            $("#demo").text(data);
            //console.log(c);
        }
    });
});


$("#json-btn").click(function () {
    $.ajax({
        method: "GET",
        url: "ajax_info.json",
        dataType: "json",
        error: function (a,b,c) {
            console.log(b);
        },
        success: function (data,a,b,c) {
            $.each(data.employees, function (i,user) {
                $("#json-demo").append("<p>" + user.firstName + " " + user.lastName + "</p>");
                /*content = "<p>" + user.firstName + " " + user.lastName + "</p>";
                $(content).appendTo("#json-demo");*/
            });
            //$("#json-btn").text();
            //console.log(c);
        }
    });
});

/*CANVAS*//*

document.addEventListener('DOMContentLoaded', function() {
    var v = document.getElementById('myVideo');
    var canvas = document.getElementById('myCanvas');
    var context = canvas.getContext('2d');
    var back = document.createElement('canvas');
    var backcontext = back.getContext('2d');

    var cw, ch;

    v.addEventListener('play', function () {
        cw = v.clientWidth;
        ch = v.clientHeight;
        canvas.width = cw;
        canvas.height = ch;
        back.width = cw;
        back.height = ch;
        draw(v, context, backcontext, cw, ch);
    });
});

function draw(v,c,bc,w,h) {
    if(v.paused || v.ended) return false;
    // First, draw it into the backing canvas
    bc.drawImage(v,0,0,w,h);
    // Grab the pixel data from the backing canvas
    var idata = bc.getImageData(0,0,w,h);
    var data = idata.data;
    // Loop through the pixels, turning them grayscale
    for(var i = 0; i < data.length; i+=4) {
        var r = data[i];
        var g = data[i+1];
        var b = data[i+2];
        var brightness = (3*r+4*g+b)>>>3;
        data[i] = brightness;
        data[i+1] = brightness;
        data[i+2] = brightness;
    }
    idata.data = data;
    // Draw the pixels onto the visible canvas
    c.putImageData(idata,0,0);
    // Start over!
    setTimeout(function(){ draw(v,c,bc,w,h); }, 0);
}
*/

/*END OF CANVAS*/

$(document).on("click",".actions a",function (event) {
    event.preventDefault();
});

$(document).on("click","#removeDiv",function(event){
    event.preventDefault();

    var unique_id = $(this).attr("data-id");

    $("#"+unique_id).fadeOut();
});

/*var inputValue = document.getElementById("name");
function displaySubmitted() {
    $("#submitted").css("display","block");
    $("#submitBtn").css("display","none");
}
$(document).on("click","#submitBtn",function (submit) {
    localStorage.setItem("fullName",inputValue.value);
    submit.preventDefault();
    displaySubmitted();
});*/



//$("#json-act-btn").click(function(){
    $.ajax({
        method:'GET',
        url:'json/json_activity.json',
        dataType:'json',
        error:function(){
            alert('error');
        },
        success:function(response){
            $.each(response.data,function(a,field){
                $("#results").append("<div id="+field.id+" class=\"res-container\">"+
                                        "<span class=\"remove-btn medium-text\"><a data-id="+field.id+" id='removeDiv' href='#' title='Remove this Post'>X REMOVE</a></span>"+
                                        "<div class=\"from\"><a href="+">"+field.from.name+"</a><div class='medium-text'>"+"Posted on: "+field.created_time+"</div></div>"+
                                        "<div class=\"message\">"+field.message+"</div>"+
                                        "<div class=\"actions\">"+
                                            "<ul>" +
                                                "<li><a href="+field.actions[1].link+">"+field.actions[1].name+"</li>"+
                                                "<li><a href="+field.actions[0].link+">"+field.actions[0].name+"</li>"+
                                            "</ul>"+
                                        "</div>"+
                                    "</div>"
                );
            });
        }
    });
//});


