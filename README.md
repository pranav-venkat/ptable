
**Ptable**

About

Ptable is a quiz and trivia game based on the elements of the periodic table and their properties.
it has 2 levels of difficulty : 
The easy level has questions based on the most basic properties from the first few elements.
The hard level has  questions based on various properties that are complicated and from all the elements

The platform used to make the app is Android Studio 4.0 and the language java. The assets were created using gimp and images with no copyright restrictions. The database was derived from Pubchem - https://pubchem.ncbi.nlm.nih.gov/periodic-table/


Code organization:


    opening.java -- this is the first screen of the app which lets  one choose the level of difficulty one wants to attempt

    element.java -- this defines an chemical element along with its properties and what types

    random_pair.java -- this gives a set of non repeating 4 random numbers between the max and min values 

    ptable.java -- this practically creates the periodic table along with all the properties for each element

    MainActivity.java -- this organizes the view for the  question paper, the score card and the review screen

    question.java -- this generates all the questions for the question paper. 
