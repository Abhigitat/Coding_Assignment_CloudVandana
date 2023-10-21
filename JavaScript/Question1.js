// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad
const reverseWord=(s)=>{
    let rev=""; 
    for(let i=s.length-1;i>=0;i--){
        rev+=s.charAt(i);
    }
    return rev;
}
const reverseSentence=(s)=>{
    let ch=s.split(" ");
    let ans=[];
    for(let i=0;i<ch.length;i++){
        ans.push(reverseWord(ch[i]));
    }
    ans=ans.join(" ");
    return ans;
}

let s="This is a sunny day";


console.log(reverseSentence(s));