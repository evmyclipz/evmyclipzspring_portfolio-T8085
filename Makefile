all: update docker

update:
	git pull

docker:
	docker-compose up --build -d 
	docker container ls -a | grep -i fitness | awk '{ print $$1 }' | xargs -I[] docker exec -t [] git pull
	docker container ls -a | grep -i fitness | awk '{ print $$1 }' | xargs -I[] docker restart []

execute:
	git pull
	./mvnw spring-boot:run

