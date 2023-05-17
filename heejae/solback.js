let [_,...n] = require("fs").readFileSync(process.platform === 'linux' ? "/dev/stdin" : __dirname + "/input.txt").toString().split("\n")
n.sort((a,b)=>a.split(' ')[0]-b.split(' ')[0]);
console.log(n.join('\n'))