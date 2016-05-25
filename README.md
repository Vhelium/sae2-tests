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

### Usage ###
From the `project/` directory run `./test.py` which will run all tests located in `src/test/`  
Optionally you can provide a selection of tests as arguments.  
Example: `./test.py Test2 Test5 Test13`
