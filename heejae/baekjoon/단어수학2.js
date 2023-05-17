let [_, ...w] = require("fs").readFileSync("/dev/stdin").toString().split("\n")
let c = {}
w.forEach(s =>[...s].forEach((a, i)=>c[a]=(c[a]|0)+10**(s.length-i-1)))
console.log(Object.values(c).sort((a,b)=>b-a).reduce((a,v,i)=>a+v*(9-i),0))
