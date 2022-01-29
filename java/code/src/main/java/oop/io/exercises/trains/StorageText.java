package oop.io.exercises.trains;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StorageText implements Storage {
    String filename;
    ObjectMapper mapper;

    public StorageText(String filename) {
        this.filename = filename;
        this.mapper = new ObjectMapper();
    }

    @Override
    public void store(List<Train> tList) throws IOException {
        FileWriter out = new FileWriter(filename);
        out.write(mapper.writeValueAsString(tList));
        out.close();
    }

    @Override
    public List<Train> load() throws IOException {
        FileReader in = new FileReader(filename);
        List<Train> trains = mapper.readValue(in, List.class);
        in.close();
        return trains;
    }
}
