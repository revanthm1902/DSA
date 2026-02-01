let count = 0;

function timedCount() {
    count++;
    postMessage("Count value: " + count);
    setTimeout(timedCount, 1000);
}

timedCount();
