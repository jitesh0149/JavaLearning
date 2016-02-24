package examples.annotations;

@ClassPreamble(author = "John Doe",
date = "3/17/2002",
currentRevision = 6,
lastModified = "4/12/2004",
lastModifiedBy = "Jane Doe",
// Note array notation     
reviewers = {"Alice", "Bob", "Cindy"})
public class Generation3List {
    // Author: John Doe
    // Date: 3/17/2002
    // Current revision: 6
    // Last modified: 4/12/2004
    // By: Jane Doe
    // Reviewers: Alice, Bill, Cindy
    // class code goes here
}
