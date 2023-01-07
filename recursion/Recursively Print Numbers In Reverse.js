function printRev(n,bag){
	if(n==0){
		return;
	}
	bag.push(n);
	printRev(n-1,bag);
}
function runProgram(input){
	let bag=[];
	let n=+input;
	printRev(n,bag);
	console.log(bag.join(' '));
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