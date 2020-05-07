
// function getInputValue(){
//             // Selecting the input element and get its value 
            
// var inputVal = document.getElementById("inp").value;
            
//             // Displaying the value
//             alert(inputVal);
//         }
// var button = document.querySelector("#inp")
// button.addEventListener('click',getInputValue);
// console.log(inputVal);

// inp.addEventListener('click',function(){
// 	h3.innerHTML = "<h3> Playing to:"+ inp.value + " </h3>"; 
// });
// var v1 = 0;
// var v2 = 0;
// var s = 5;
// while((v1<s)&&(v2<s)){
// player1.addEventListener('click',function(){
// 	v1 = v1+1;
// 	h1.innerHTML = "<h1>"+ v1 +" to " + v2 + "</h1>";
// });
// player2.addEventListener('click',function(){
// 	v2 = v2+1;
// 	h1.innerHTML = "<h1>"+ v1 +" to " + v2 + "</h1>";
// });

// };

var h1 = document.querySelector("h1");
var h3 = document.querySelector("h3");
var inp = document.querySelector("input");

var player1 = document.querySelector("#one");
var player2 = document.querySelector("#two");
var reset = document.querySelector("#three");
var v1 = 0;
var v2 = 0;
var p1 = document.querySelector("#p1");
var p2 = document.querySelector("#p2");
var gameOver = false;
var yo = document.querySelector("#yo");
var winningscore = 5;

player1.addEventListener("click",function(){
	if(!gameOver){
	v1++;
		
	if (v1 === winningscore) {
		gameOver = true;
		p1.classList.add("winner");
	}
}


p1.textContent = v1;
	
});

player2.addEventListener("click",function(){
	if(!gameOver){
	v2++;
		
	if (v2 === winningscore) {
		gameOver = true;
		p2.classList.add("winner");
	}
}


	
	p2.textContent = v2;
	// console.log("clicked!");
});
reset.addEventListener("click",function(){
	if (v1>v2) {
		p1.classList.remove("winner");

	}
	else{
		p2.classList.remove("winner");
	}


	v1 = 0;
	v2 = 0;
	p1.textContent = v1 ;
	p2.textContent = v2 ;
	gameOver = false;
	
});

inp.addEventListener("change",function(){
	yo.textContent = inp.value;
	winningscore = Number(inp.value);
	v1 = 0;
	v2 = 0;
	p1.textContent = v1 ;
	p2.textContent = v2 ;
	gameOver = false;
});
























