function palindrome(str,idx,s){
	if(idx==str.length){
		return;
	}
	palindrome(str,idx+1,s);
	s.push(str[idx]);
}
function runProgram(input){
	let str=input.split('');
	let s=[];
	palindrome(str,0,s);
	str=str.join('');
	s=s.join('');
	
	if(s==str){
		console.log("YES");
	}
	else{
		console.log("NO");
	}
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