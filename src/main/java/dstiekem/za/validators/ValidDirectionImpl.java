package dstiekem.za.validators;

import dstiekem.za.validators.ValidDirection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidDirectionImpl implements ConstraintValidator<ValidDirection, String> {

    @Override
    public boolean isValid(String direction, ConstraintValidatorContext context) {
        if (direction.isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("oops! theres no direction input: ")
                    .addPropertyNode("empty")
                    .addConstraintViolation();
            return false;
        }
        else {
            if (direction.equals("north") || direction.equals("south") || direction.equals("east") ||
                    direction.equals("west") || direction.equals("exit")){
                return true;
            }
            else {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(
                        "please type in north, south, east, or west not: " + direction + ". ps it's case sensitive")
                        .addPropertyNode("empty")
                        .addConstraintViolation();
                return false;
            }
        }
    }
}

