FROM    maven:3.8.3-openjdk-17
RUN     mkdir /bdd-framework
WORKDIR /bdd.demo.framework
COPY    . .
CMD mvn clean test -Dcucumber.options="--tags '@test'" -DexecutionPlatform="GRID"