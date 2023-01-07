function towerOfHanoi(n,a,b,c){
	if(n==0){
		return;
	}
	towerOfHanoi(n-1,a,c,b);
	console.log("Moving ring "+n+" from "+a+" to "+b);
	towerOfHanoi(n-1,c,b,a);
}

function runProgram(input){
	let n=+input;
	towerOfHanoi(n,'A','B','C');
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