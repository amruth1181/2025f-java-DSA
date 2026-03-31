package fr.epita.biostat.services.exceptions;

import java.io.IOException;

public class IncorrectConfigurationException extends RuntimeException {
    public IncorrectConfigurationException(IOException e) {
    }
}
