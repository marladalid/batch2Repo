/**
 * Created by JPMPC-B208 on 12/2/2016.
 */
var i=0;
function appendDiv() {
    i++;
        self.postMessage(i);

    setTimeout("appendDiv()",1000);
}

appendDiv();

