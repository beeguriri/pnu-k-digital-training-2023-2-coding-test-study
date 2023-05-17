const input = require("fs").readFileSync(process.platform === 'linux' ? "/dev/stdin" : __dirname + "/input.txt")
let s = input.toString().trim().split('\n');
s.shift();
s = s.sort((a, b) => b.length - a.length);
s = s.map(i => "0".repeat(s[0].length - i.length) + i)
console.log('s',s)

let count = {}
for (let i = 0; i < s[0].length; i++) {
  s.forEach(j => {
    if (j[i] && j[i].replace(/\d/, '').length) count[j[i]] = (count[j[i]] | 0) + 10**(s[0].length-i-1);
  })
}
console.log('count',count)
let keyset = Object.keys(count).sort((a,b)=>count[b]-count[a])
console.log('keyset',keyset)
let t = 9;

for (let a of keyset){
  s=s.map(i=>i.replaceAll(a,9-keyset.indexOf(a)))
}
console.log('s',s)

s = s.map(Number);
console.log(s.reduce((a, c) => a + c, 0));