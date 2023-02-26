const maximumWealth = (accounts) => {
  let total = 0;
  for(let i = 0; i < accounts.length; i++){
    let tmpTotal = 0;
    for(let j = 0; j < accounts[i].length; j++){
      let tmp = accounts[i][j] + tmpTotal;
      tmpTotal = tmp
    }
    if(tmpTotal >= total){
      total = tmpTotal
    }
  }
  return total;
}
let accounts = [[1,5],[7,3],[3,5]];
let result = maximumWealth(accounts);
console.log(result);