# FIQL-POC

This is the POC for the FIQL implementation to demonstrat how we can reduce the burdon of writing select queries.


This can be used where we are dealing with reader applications. In other words, where the system is used to read the data from db more then adding/updating them.

There are some good git repository available to give deep insight about this but in this repo, you will get very basic idea to start with FIQL and understand the way it is working with java application.

# Simple flow

- get api request
- fetch filter parameter
- system will find mapping from the parameter
- FIQL generate join query based on mapping
- provide the result.
