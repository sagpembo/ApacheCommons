app.service('myserv', function() {
          this.getServiceList = function () {
    return [];
}
this.getISEndpoint = function() { 
 return 'http://SAG-CFF7YZ2.pembo.local:5555/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "17-07-2023 17:23:52 BST";
}
this.getPackageInfo = function(){
 return{"packageName":"ApacheCommons","version":"1.0"};
}
});
