var str = '({"firstName":"V","lastName":"Harshitha"})';
var obj = eval(str);
document.write("String Is Converted Into Object Using Eval() : ")
document.write(obj.firstName + " "); 
document.write(obj.lastName);