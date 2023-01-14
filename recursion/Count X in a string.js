function countX(str,i,count){
	if(i==str.length){
		return count;
	}
	if(str[i]==='x'){
		count++;
	}
	let x=countX(str,i+1,count);
	return x;
}

function runProgram(input){
	let str=input.split('');
	let count=0;
	console.log(countX(str,0,count));
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