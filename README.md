# Software Architecture and Engineering *ETHZ*
## Project 2 - Tests

### Description ###
A collection of classes that can be used for testing in project 2.  
Each test case defines an expected output.  
Using the `test.py` script one can check his own analyzer for correctness.

### Installation ###
1. Clone the repository to an arbitrary place
2. Copy `test.py` into your `project/` folder
3. Copy the `src/tests/` folder into your `project/src` folder

Now your `project` folder should look like the following:
```
  project/
      src/
          ch/ethz/sae/
              AWrapper.java
              Analysis.java
              Verifier.java
          test/
              Test1.java
              ...
          PrinterArray.java
      build.sh
      run.sh
      soot-2.5.0.jar
      test.py
```
Casually check for updates in the repository (and replace the old files).

### Usage ###
From the `project/` directory run `./test.py` which will run all tests located in `src/test/`.  
Optionally you can provide a selection of tests as arguments.  
Example: `./test.py Test2 Test5 Test13`

### Sharing your tests ###
If your group has created some (meaningful) test cases please don't hesitate to share them.  
Submit them by either creating a pull request or send them directly to me (timonbl at ethz dot ch).

Submitted tests must contain a header (at the start of the file) in the following format:

```java
// Description/Goal of the test
// EXPECTED_DIV_ZERO
// EXPECTED_OUT_OF_BOUNDS
// Name Surname Email (of Author)
```

where `EXPECTED_DIV_ZERO` is either `NO_DIV_ZERO` or `MAY_DIV_ZERO` and `EXPECTED_OUT_OF_BOUNDS` is either `NO_OUT_OF_BOUNDS` or `MAY_OUT_OF_BOUNDS`.
