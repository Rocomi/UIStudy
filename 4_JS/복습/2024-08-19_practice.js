function changeColor() {
    document.getElementById("area1").style.backgroundColor = 
                    document.getElementById("selColor").value;  // 16진수 형태의 색상값
}

function resize(h, w) {
    document.getElementById("area2").style.height = h+"px";
    document.getElementById("area2").style.width = w+"px";
}

function changedColor() {
    document.getElementById("area3").style.backgroundColor = "red";
}
function reColor() {
    document.getElementById("area3").style.backgroundColor = "black";
}

window.onload = function() {
    const area3 = document.getElementById("area3");

    // 마우스가 #area3요소 안으로 들어갔을 때 : mouseenter
    area3.addEventListener("mouseenter", function(){
        this.style.backgroundColor = 'red';
    });

    // 마우스가 #area3요소 밖으로 나갔을 때 : mouseout
    area3.addEventListener("mouseout", function(){
        this.style.backgroundColor = 'black';
    });
}