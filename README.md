Quickstart
In this section we’ll walk through building and starting an instance of Zipkin for checking out Zipkin locally. There are three options: using Java, Docker or running from source.

If you are familiar with Docker, this is the preferred method to start. If you are unfamiliar with Docker, try running via Java or from source.

Regardless of how you start Zipkin, browse to http://your_host:9411 to find traces!

Docker
The Docker Zipkin project is able to build docker images, provide scripts and a docker-compose.yml for launching pre-built images. The quickest start is to run the latest image directly:

docker run -d -p 9411:9411 openzipkin/zipkin
Java
If you have Java 17 or higher installed, the quickest way to get started is to fetch the latest release as a self-contained executable jar:

curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
Homebrew
If you have Homebrew installed, the quickest way to get started is to install the zipkin formula.

brew install zipkin
# to run in foreground
zipkin
# to run in background
brew services start zipkin
Running from Source
Zipkin can be run from source if you are developing new features. To achieve this, you’ll need to get Zipkin’s source and build it.

# get the latest source
git clone https://github.com/openzipkin/zipkin
cd zipkin
# Build the server and also make its dependencies
./mvnw -T1C -q --batch-mode -DskipTests --also-make -pl zipkin-server clean package
# Run the server
java -jar ./zipkin-server/target/zipkin-server-*exec.jar
# or Run the slim server
java -jar ./zipkin-server/target/zipkin-server-*slim.jar
Stop by and socialize with us on gitter, if you end up making something interesting!
