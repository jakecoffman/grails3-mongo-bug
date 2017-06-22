package grails3.mongo.bug

import grails.converters.JSON

class BaconController {
    def index() {
        render Bacon.list() as JSON
    }
}
