function printDI(n){
	if(n==0){
		return;
	}
	console.log(n);
	printDI(n-1);
	console.log(n);
}

function runProgram(input){
	let n=+input;
	printDI(n);
}



process.stdin.resume();
process.stdin.setEncoding("ascii");
let read="";
process.stdin.on("data",function(input){
    read+=input;
});
process.stdin.on("end",function(){
    read=read.replace(/\$n/,"");
    read=read.replace(/\$n/,"");
    runProgram(read);
});