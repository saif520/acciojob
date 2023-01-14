function pairStair(str,idx,ans){
	if(idx==str.length){
		return;
	}
	pairStair(str,idx+1,ans);
	ans.push(str[idx]);
	if(str[idx]==str[idx-1]){
		ans.push("*");
	}
	return ans;
}

function runProgram(input){
	let str=input;
	str=str.split('')
	let ans=[];
	pairStair(str,0,ans);
	let left=0;
	let right=ans.length-1;
	while(left<right){
		let temp=ans[left];
		ans[left]=ans[right];
		ans[right]=temp;
		left++;
		right--;
	}
	console.log(ans.join(''));
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
});