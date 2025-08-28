package app.transito.domain.exception;

public class NegocioException extends RuntimeException{
    public NegocioException(String mensage){
        super(mensage);
    }
}
