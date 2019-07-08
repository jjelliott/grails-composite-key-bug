package compositekey

import grails.converters.JSON

class CompositeKeyController{ 

    def index(){
        render UserRole.list(sort: "role") as JSON
    }
    
   
    
}