const person = {
    firstName : "V",
    lastName : "Harshitha",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + this.middleName + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
person.middleName = "-";
document.write(person.middleName + "  ");
document.write(person.lastName);
console.log(person.greeting());