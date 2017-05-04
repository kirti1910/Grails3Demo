package grails3poc

class BookController {

    def index() {


        log.info("some Info Book")

        log.error("some error Book")

        log.warn("some warning Book")

        render(view: 'book')
    }

    def showBook(){

        render(template: 'book_template', var: "book", collection: Book.list())

    }

    def book(){
        render( view: 'book', model: [bookList: Book.list()])
    }

    def showBookName(Long id){

        println("Boook id is : " + id)
        render params.name
    }

    def addBook(){

    }

    def saveBook(){

        String name = params.name
        BigDecimal price = params.price as BigDecimal

        Book book = new Book(name:name,price:price)
        book.save(failOnError: true, flush: true)

        render "New Book saved!!"

    }

    def list(){
        render(view: "book", model: [bookList: Book.list(), totalCount: Book.list().size()])
    }
}
