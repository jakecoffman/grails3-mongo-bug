package grails3.mongo.bug

import grails.rest.RestfulController

class AuthorController extends RestfulController<Author> {
    static getResponseFormats() {
        return ['json']
    }

    AuthorController() {
        super(Author)
    }
}
