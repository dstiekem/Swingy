package dstiekem.za.validators;

import dstiekem.za.validators.ValidChoice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class ValidChoiceImpl implements ConstraintValidator<ValidChoice, String> {
 
     @Override
     public boolean isValid(String onlyYN, ConstraintValidatorContext context) {
         if (onlyYN.isEmpty()) {
             context.disableDefaultConstraintViolation();
             context.buildConstraintViolationWithTemplate("oops! theres no yes or no: ")
                 .addPropertyNode("empty")
                 .addConstraintViolation();
             return false;
         }
         else {
             onlyYN = onlyYN.toLowerCase();
             if (onlyYN.equals("yes") ||
                     onlyYN.equals("y") || onlyYN.equals("no")||
                     onlyYN.equals("n") || onlyYN.equals("exit")){
                 return true;
             }
             else {
                 context.disableDefaultConstraintViolation();
                 context.buildConstraintViolationWithTemplate(
                         "please type in yes or no, not: " + onlyYN)
                     .addPropertyNode("empty")
                     .addConstraintViolation();
                 return false;
             }
         }
     }
 }