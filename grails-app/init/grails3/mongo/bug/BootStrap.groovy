package grails3.mongo.bug

class BootStrap {

    def init = { servletContext ->
        new Author(metadata: ["1984": ["utopian", "dystopian"]]).save(flush: true, failOnError: true)
        new Author(metadata: ["Harry Potter": ["fantasy", "young adult"]]).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
