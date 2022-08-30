# kata-affinity
Coding kata for calculating the affinity between two web pages.

### Context
A web server logs page views in a log file.  
The log file consists of a line per page view.  
A page view consists of a page id and a user id separated by a comma.  

The affinity of any two pages is the number of distinct users who viewed both.  

An example would be:
```
bbcnews, user1
google,  user1
amazon,  user2
google,  user3
google,  user3
google,  user2
amazon,  user3
amazon,  user1
bbcnews, user3
```

For the above, `bbcnews` and `google` have an affinity of 2. `bbcnews` and `amazon` also have an affinity of 2.
However, `google` and `amazon` have an affinity of 3.

### Task
Write a method that takes a log file as input and returns the two distinct pages which have the highest affinity with each other.  
Note that where there is more than one correct solution, any single correct solution will suffice.