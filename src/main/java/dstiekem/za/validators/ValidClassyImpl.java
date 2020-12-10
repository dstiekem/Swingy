package dstiekem.za.validators;

import dstiekem.za.validators.ValidClassy;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidClassyImpl implements ConstraintValidator<ValidClassy, String> {

    @Override
    public boolean isValid(String className, ConstraintValidatorContext context) {
        if (className.isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("oops! theres no character class input: ")
                    .addPropertyNode("empty")
                    .addConstraintViolation();
            return false;
        }
        else {
            if (className.equals("mimicryst") || className.equals("venomed") || className.equals("shelled") || className.equals("winged")){
                return true;
            }
            else {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(
                        "please type in mimicryst, venomed, shelled or winged, not: " + className + ". ps it's case sensitive")
                        .addPropertyNode("empty")
                        .addConstraintViolation();
                return false;
            }
        }
    }
}
