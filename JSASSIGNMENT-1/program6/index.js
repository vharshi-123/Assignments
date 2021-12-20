// var x = "Hello\nWorld\nin\na\nframe";

// function rectangle(str)
// {
//     let arr =[];
//     arr = str.split("\n");
//     for(let index = 0; index < 1; index++)
//     {
//         document.write("***");
//         for(let j = 0; j <=arr.length; j++)
//         {
//             // arr == arr[j].split(",");
//             document.write("" + arr[j] + "");
//         }
//     }
//     document.write("***");
//     return arr;
// }

// document.write(rectangle(x));

var x = "hello\nworld\nin\na\nframe";

function star(str) {
  let arr = [];
  arr = str.split("\n");
  for (let index = 0; index < 1; index++) {
    console.log("***");
    document.write("***");
    for (let j = 0; j <= arr.length; j++) {
     
      console.log("*" + arr[j] + "*" );
      document.write("*"+arr[j]+"*");
    }
  }
  console.log("***");
  document.write("***");
  return arr;
}
console.log(star(x));
document.write(star(x));
       