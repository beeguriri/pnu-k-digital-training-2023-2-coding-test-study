const solution = (str, pat) => str.substring(0, str.lastIndexOf(pat)) + pat

function solution(myString, pat) {
  let temp = [...myString].reverse().join('')
  let ans = temp.slice(temp.indexOf([...pat].reverse().join('')))
  return [...ans].reverse().join('')
  
}

console.log(solution(
    "AAAAaaaa",	"a"	

))
//"AAAAaaaa"