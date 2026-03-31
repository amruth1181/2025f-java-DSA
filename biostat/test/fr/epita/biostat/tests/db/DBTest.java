package fr.epita.biostat.tests.db;

import fr.epita.biostat.datamodel.BioStatEntry;
import fr.epita.biostat.services.BioStatDataService;
import fr.epita.biostat.services.exceptions.DeleteFailedException;

import java.sql.SQLException;

public class DBTest {

    public static void main(String[] args) throws SQLException {

        System.setProperty("conf.file", "S:\\Work\\ae\\Epita\\workspaces\\2025f-ooa-uml-java-DSA\\java-exercises\\biostat\\conf.properties");
        BioStatDataService service = BioStatDataService.getInstance();
        BioStatEntry entry =  new BioStatEntry("thomas", "M", 39, 170, 73);
        service.save(entry);

        entry.setAge(40);
        BioStatEntry qbe = new BioStatEntry(null, null, null, null, null);

        System.out.println(service.search(qbe));
        service.update(entry);
        service.search(qbe);
        try {
            service.delete(entry);
        } catch (DeleteFailedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(service.search(qbe));


    }

}
