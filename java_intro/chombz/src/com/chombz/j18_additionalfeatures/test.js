//JavaScript file to parsed by the JJS.exe 
//tool to display the sum of the odd numbers from 1 - 11
//on the console

//Create an array of odd numbers  
var data = [1, 3, 5, 7, 11];
var sum = data.reduce(function (x, y)
{
    return x + y;
}, 0);

print("The sum of the odd numbers from 1 - 11", sum);


