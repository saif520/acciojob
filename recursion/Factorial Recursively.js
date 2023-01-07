function fact(n){
	if(n==0){
		return 1;
	}
	let smallAns=fact(n-1);
	ans=smallAns*n;
	return ans;
}

function runProgram(input){
	let n=+input;
	let ans=fact(n);
	console.log(ans);
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