package compositekey

class UserRole implements Serializable{
    
    ExampleUser user
    ExampleRole role

    static mapping = {
        id composite: ['user', 'role']
    }
    
    static constraints = {
    }
}
