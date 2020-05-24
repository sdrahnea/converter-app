# convert application

This is an application which provide charts based on information from sources. The goal is to provide charts.
We use the following frameworks: java, sql, spring framework, spring boot, spring jpa, hibernate, primefaces and MySQL as database. 

## Summary
* Getting Started
* Prerequisites
* Deployment
* Running the application
* Using the application
* Built With
* Do you have any issue?
* Contributing
* Versioning
* Authors
* License
* Donation

## Getting Started

Clone or download a copy of this project.

### Prerequisites

This project requires Java 1.8 and Maven.

## Deployment
Once the build (the jar file) is ready the application can be run. Please, use the following command to run the application:
```
SDR:converter sdrahnea$ java -jar target/converter-0.0.1-SNAPSHOT.jar
```

## Running the application
Please, use the following command:
```
SDR:converter sdrahnea$ java -jar target/converter-0.0.1-SNAPSHOT.jar
```

## Using the application
Please, use the following commands (request and response):
1. convert friendlyId to uuid via terminal
```
curl http://localhost:8081/friendlyIdToUuid/2jA2DB5huRPt72pfKZTRT
017227fe-1dbf-db0f-8e96-08c24693b2e3
```
2. convert uuid to friendlyId via terminal
```
curl http://localhost:8081/uuidToFriendlyId/017227fe-1dbf-db0f-8e96-08c24693b2e3
2jA2DB5huRPt72pfKZTRT
```
3. convert friendlyId to uuid via a browser:
```
http://localhost:8081/friendlyIdToUuid/2jA2DB5huRPt72pfKZTRT
017227fe-1dbf-db0f-8e96-08c24693b2e3
```
4. convert uuid to friendlyId via a browser:
```
http://localhost:8081/uuidToFriendlyId/017227fe-1dbf-db0f-8e96-08c24693b2e3
2jA2DB5huRPt72pfKZTRT
```

## Built With

* [Java](https://www.java.com/en/download/) - Java technology allows you to work and play in a secure computing environment. Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few.
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 

## Do you have any issue?

Please contact via LinkedIn account or drop an email (read [LICENSE.md](LICENSE.md) file).

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Donation
* [PayPal](https://www.paypal.me/sdrahnea) - any donation is welcomed in case that you was pleased with this work :p

