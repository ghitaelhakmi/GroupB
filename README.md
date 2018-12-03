# Welcome to the MQL PLATFORM Project

### Project Goal

- Creating a platform that manages the life at `mql`, enterence exams, registration, internships, events, enterprise data. all of this informations and more
are managed by the platform .

### Deployment Instructions

- The project is built using the `Spring` ecosystem, so the deployment process is easy, you'll need `java`, and after 
generating the war any web container will suffice, (here we used tomcat) .

- `mysql` up and running on the default port and a database named `mql-platform`

### Contribution guidelines

- Only team leads are allowed to submit pull requests to the central repository
- The code must be documented and well maintained, (no spaghetti code).
- Make sure you pull and update to the latest version every time you start working
- Make sure the code works, before sending a pull request 
- Make sure the code is well formatted and well documented
- Avoid naming your methods/variables something silly .
- Follow java coding conventions
- Inject environment variables for stuff that shouldn't be stored in your code such as, paths that depend on the machine where the app is deployed, and document it in case you did so that people trying to run the project after you don't fall into errors because of that .
- Add files such as `.classpath` `.project` to your `.gitignore` file and do a git rm those files so they won't be tracked by git cause it causes errors for most of the people after pulling the code again .

###### Injecting Env variables
- you can inject env variables and access them in your spring managed beans if you pass them as a VM argument or you export them in your `.bashrc` or `.bashprofile`
```java
@Autowired
ConfigurableEnvironment env;

// later on in the code

String propValue = env.getProperty("propname");
```
