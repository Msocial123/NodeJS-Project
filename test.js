//console.log("venkat1");
//console.log("venkat2");
//console.log("venkat3"); //sync
//setTimeout(()=> { //settimeout function
//console.log("it will execute once the time is over") //async
//}, 2000);
setTimeout(()=> { //settimeout function
add(); //async
}, 2000);
//calling that add function
//console.log("venkat4");
//console.log("venkat5");
//console.log("venkat6");
//console.log("venkat7");





function add() { //init
     let add = 0;
     for(let i =0; i<10000000000000000; i++){
        add += i; //add = add + i
   }
    console.log("the add is result is", add)
}

// //step 1
// //1) i  = 0;
// //2) 0 < 100000
// //3) add = 0 + 0 = 0

// //step 2
// //1) i = 1
// //2) 1 < 10000
// //3) add = 0 + 1  = 1 + 2 + 3


//promise and aysc/await
//let var const

// let p = new Promise((resolve, reject) => {
//     let venkat = 1;
//     if(venkat == 10){
//        resolve('success') 
//     } else {
//         reject("failed")
//     }
// })

// p.then((msg) => {
//     //waiting the promise to resolve success
//     console.log("the msg is " + msg)
// }).catch((msg) => {
//     //handing the errors(reject)
//     console.log("the msg is " + msg)
// })

// function fetchData() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             const success = true; //success or failure
//             if(success) {
//                 const data = "got the data"
//                 resolve(data)
//             } else {
//                 const error = "unable to fetch";
//                 reject(error)
//             }
//         }, 2000);
//     })
// }

// fetchData().then((result) => {
//     console.log("success", result)  //it is resolving the promise, to resolve the promise we must and should use .then function
// })
// .catch((error)=> {
//     console.error("error", error) //it is rejecting the promise, to reject the promise we have to use .then function
// })


//async and await

//creating the promise with resolve and reject
// const fetchData = () =>{
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             const success = true; //success or failure
//             if(success) {
//                 const data = "got the data"
//                 resolve(data)
//             } else {
//                 const error = "unable to fetch";
//                 reject(error)
//             }
//         }, 2000);
//     })
// }

// async function fetchDataAyncAwait() {
//     //waiting fro the promise to resolve using await 
//     const result = await fetchData();
//     console.log(result)
// }

// fetchDataAyncAwait();
// calling the async function

//http methods
//post -> used to store or submit the data to the server
//get -> used to retrieve the data from the server
//put -> used to update the the data 
//delete -> we will delete the data
//patch -> to update few feilds kind of partial modifications

//https status code:

//200 -> ok ->when we get the data we will get success response like ok
//204 -> no content is avaliable

//300( redirction)

//400 201 403 404 -> bad request, unatuthized, not found

//500 -> we will get internal server error or service is not available 
