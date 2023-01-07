function printNTimes(n){
	if(n==0){
		return;
	}
	printNTimes(n-1);
	console.log("AccioSchool");
}

function runProgram(input){
	let n=+input;
	printNTimes(n);
}

process.stdin.resume;
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