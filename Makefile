all: update docker

update:
	git pull

docker:
	docker-compose up --build -d 

execute:
	./mvnw spring-boot:run

