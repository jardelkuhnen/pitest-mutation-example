<h1 align="center">Welcome to pitest-mutation-example 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0-blue.svg?cacheSeconds=2592000" />
</p>

> Example of use Pitest to mutate on your UnitTests
 
- Used JUnit5+ for unit tests
- Used Jacoco to collect and build report of unitTest coverage
- Used Pitest to mutate, collect and build repor of coverage after mutation.

## Run coverage UnitTests
```sh
mvn clean package
```

## Run coverage Pitest
```sh
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

## Location of coverage report UnitTest
``target/site/jacoco/index.html``

## Location of coverage report MutationTest
``target/pit-reports/202203282214/index.html``

## Static coverage
``See at coverage-example/ has a coverage report of UnitTest and a report after mutation``

## Author

👤 **Jardel Back Kuhnen**

* Github: [@jardelkuhnen](https://github.com/jardelkuhnen)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_