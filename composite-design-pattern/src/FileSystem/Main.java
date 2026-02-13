package FileSystem;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = new File("Border");
        FileSystem borderFile = new File("Next Movie");
        Directory movieDirectory = new Directory("Movie");
        movieDirectory.addFileSystem(fileSystem);
        movieDirectory.addFileSystem(borderFile);
        Directory comedyDirectory = new Directory("Comedy");
        FileSystem funnyMovie1 = new File("Funny 1");
        FileSystem funnyMovie2 = new File("Funny 2");
        comedyDirectory.addFileSystem(funnyMovie1);
        comedyDirectory.addFileSystem(funnyMovie2);
        movieDirectory.addFileSystem(comedyDirectory);
        movieDirectory.ls();
    }
}