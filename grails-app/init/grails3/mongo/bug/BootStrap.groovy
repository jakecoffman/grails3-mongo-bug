package grails3.mongo.bug

import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        new Author(metadata: ["1984": ["utopian", "dystopian"]]).save(flush: true, failOnError: true)
        new Author(metadata: ["Harry Potter": ["fantasy", "young adult"]]).save(flush: true, failOnError: true)

        new Bacon(name: "one").save(flush: true, failOnError: true)
        new Bacon(name: "two").save(flush: true, failOnError: true)
        new Bacon(name: "three").save(flush: true, failOnError: true)

        JSON.registerObjectMarshaller(Bacon) {
            def obj = [:]
            obj.id = it.id
            obj.things = []
            return obj
        }
    }
    def destroy = {
    }
}
