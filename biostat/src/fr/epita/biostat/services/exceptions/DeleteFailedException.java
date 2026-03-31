package fr.epita.biostat.services.exceptions;

public class DeleteFailedException extends Exception {


    public DeleteFailedException(Exception e){
        super(e);
    }

}
