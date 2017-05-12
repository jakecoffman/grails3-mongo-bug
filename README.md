# grails3-mongo-bug

Steps to reproduce:
1. Start the server
2. Hit `/authors`
3. Response is an array of one object, but if you look at the Bootstrap file or mongo you'll see there is actually 2. 

The error has something to do with storing a List in the Map on the domain, but also is reproducable in other scenarios. 
