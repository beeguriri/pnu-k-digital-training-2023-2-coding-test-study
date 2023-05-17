function solution(a) {
    let ans = new Set()
    let min = Infinity;
    let left = Infinity;
    let right = Infinity;
    for (let i = 0; i<a.length; i++){
        if (a[i]<min) min = a[i];
    }
    const k = a.indexOf(min)
    for (let i = 0; i < k; i++) {
        if (a[i] < left) {
            ans.add(a[i]);
            left = a[i];
        }
    }
    for (let i = a.length; i >= k; i--) {
        if (a[i] < right) {
            right = a[i];
            ans.add(a[i]);
        }
    }
    return ans.size
}
console.log(solution(
    [-16, 27, 65, -2, 58, -92, -71, -68, -61, -33]
))
  // 0a

