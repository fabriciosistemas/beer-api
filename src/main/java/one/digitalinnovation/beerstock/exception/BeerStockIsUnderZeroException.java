package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockIsUnderZeroException extends Exception {
    public BeerStockIsUnderZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed is under the min stock capacity: %s", id, quantityToDecrement));
    }
}
