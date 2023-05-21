### Why is it Not Maintainable?

The code present here does the job. 
But there is one issue from developer's perspective.
Currently we have the same attributes present in the Staff class and the StaffBuilder class. Let's say tomorrow there is a change in the attributes then there could be a possibility that whoever is working on the code might just update the Staff class and not the StaffBuilder.
It could be because he just forgot, it could be becasue he is new to the project and doesn't understand the code fully yet. So this leads to a maintainability issue.
