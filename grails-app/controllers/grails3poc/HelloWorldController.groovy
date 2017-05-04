package grails3poc

class HelloWorldController {

    def index() {


        log.info("some Info HelloWorld")

        log.error("some error HelloWorld")

        log.warn("some warning HelloWorld")

        render(text: "<xml>some xml</xml>", contentType: "text/xml", encoding: "UTF-8")

    }

    def sample(){


    }


}
