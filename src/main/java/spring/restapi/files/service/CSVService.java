package spring.restapi.files.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import spring.restapi.files.model.University;
import spring.restapi.files.helper.CSVHelper;
import spring.restapi.files.repository.UniversityRepository;


/**
 * Class uses CSVHelper and UniversityRepository methods to save CSV data to MySQL, load data to export CSV file, or get all Universities from MySQL table.
 */

@Service
public class CSVService {
    @Autowired
    UniversityRepository repository;

    public void save(MultipartFile file) {
        try {
            List<University> universities = CSVHelper.csvToUniversity(file.getInputStream());
            repository.saveAll(universities);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public ByteArrayInputStream load() {
        List<University> universities = repository.findAll();

        ByteArrayInputStream in = CSVHelper.universityToCSV(universities);
        return in;
    }

    public List<University> getAllUniversities() {
        return repository.findAll();
    }
}
