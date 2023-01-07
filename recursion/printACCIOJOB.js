function print(n){
	if(n==0){
		return;
	}
	print(n-1);
	console.log("ACCIOJOB");
}
function runProgram(input){
	let n=+input;
	print(n);
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