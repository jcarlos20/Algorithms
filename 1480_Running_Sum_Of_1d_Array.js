const runningSum = (nums) => {
  let result = [];
  result[0]=nums[0]
  for (let i = 1; i < nums.length; i++){
    result.push(nums[i]+result[i-1])
  }
  return result;
}
let nums = [1,2,3,4]
let results = runningSum(nums);
console.log(results);