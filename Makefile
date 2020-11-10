all: maven

console: fclean maven
	java -jar swingy.jar console

maven:
	clear
	mvn clean package

clean:
	rm -Rf .settings
	rm -Rf .classpath
	rm -Rf .project
	rm -Rf .DS_Store
	rm -Rf .vscode
	rm -Rf bin
	rm -rf database.txt

fclean: clean
	mvn clean
	rm -Rf swingy.jar
	rm -Rf ~/.m2;

re: fclean all