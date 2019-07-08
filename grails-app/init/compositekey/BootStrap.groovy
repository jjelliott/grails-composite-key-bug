package compositekey

class BootStrap {

    def init = { servletContext ->
        ExampleUser.withNewSession {
            
            def u1 = new ExampleUser(name: "user1")
            u1.save()
            def u2 = new ExampleUser(name: "user2")
            u2.save()
            def r1 = new ExampleRole(name: "role1")
            r1.save()
            def r2 = new ExampleRole(name: "role2")
            r2.save()
            
            new UserRole(user: u1, role: r1).save()
            new UserRole(user: u1, role: r2).save()
            new UserRole(user: u2, role: r1).save()
        }
    }
    def destroy = {
    }
}
