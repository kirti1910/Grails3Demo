package grails3poc

class BootStrap {

    def init = { servletContext ->

        (1..10).each{
            Book book = new Book(name: "Grails${it}", price: 56.09 )
            book.save(failOnError: true, flush: true)
        }

    }
    def destroy = {
    }
}
