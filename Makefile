all: docker

update:
    git pull
    docker container ls -a | grep -i fitness | awk '{ print $$1 }' | xargs -I[] docker exec -t [] git pull
    docker container ls -a | grep -i fitness | awk '{ print $$1 }' | xargs -I[] docker restart []

docker:
    git pull
    docker-compose up --build -d

execute:
    git pull
    ./mvnw spring-boot:run

