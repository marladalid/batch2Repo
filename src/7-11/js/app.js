/**
 * Created by JPMPC-B208 on 11/24/2016.
 */
var n=5;
var x=1;
var result = n+x;

$("#btn1").click(function () {
    $("div").css({background: "red"});
    var divCount = $("div").length;
    for(var i=0;i<divCount;i++){

    }

    alert("There are = " + i + " divs and it will change the background colors into RED");

});


document.getElementById("result").innerHTML = "result is " + result;

var mySubmitBtn = document.getElementById("submitBtn");
mySubmitBtn.onclick = function (event) {
    event.preventDefault();
    mySubmitBtn.style.display = "none";
};

/* START OF AUDIO */

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

    function stopAudio() {
        audio.pause();
        audio.currentTime = 0;
        playPauseBtn.textContent = "PLAY";
    }

/* END OF AUDIO */

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
