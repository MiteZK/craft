// 此js用于封装前后端对象传输


function EncapsulationUser(username,password,phone,email,created,updated) {
    var user = Object.create({username:username,password:password
    ,phone:phone,email:email,created:created,updated:updated})
    return user;
}