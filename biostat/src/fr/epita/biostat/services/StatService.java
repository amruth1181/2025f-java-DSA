package fr.epita.biostat.services;

import fr.epita.biostat.datamodel.BioStatEntry;

import java.util.List;

public class StatService {

    public static double getAverageAge(List<BioStatEntry> entries) {
        double totalAge = 0;
        for (BioStatEntry entry: entries){
            totalAge = totalAge + entry.getAge();
        }
        double averageAge = totalAge/ entries.size();
        return averageAge;
    }
}
