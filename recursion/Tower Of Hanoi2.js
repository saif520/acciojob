function toi(n,a,c,b){
	if(n==0){
		return;
	}
	toi(n-1,a,b,c);
	console.log("move disk "+n+" from rod "+a+" to rod "+c);
	toi(n-1,b,c,a);
}

function runProgram(input){
	let n=+input;
	toi(n,1,3,2);
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
})