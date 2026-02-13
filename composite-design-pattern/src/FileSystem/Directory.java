package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> fileSystems;

    public Directory(String name) {
        this.name = name;
        this.fileSystems = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem) {
        this.fileSystems.add(fileSystem);
    }

    public void ls() {
        for(FileSystem file: fileSystems) {
            System.out.println("FileSystem.Directory name : " + this.name);
            file.ls();
        }
    }
}
