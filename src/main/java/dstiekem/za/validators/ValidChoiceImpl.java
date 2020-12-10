package dstiekem.za.validators;

import dstiekem.za.validators.ValidChoice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class ValidChoiceImpl implements ConstraintValidator<ValidChoice, String> {
 
     @Override
     public boolean isValid(String onlyYN, ConstraintValidatorContext context) {
         if (onlyYN.isEmpty()) {
             context.disableDefaultConstraintViolation();
             context.buildConstraintViolationWithTemplate("oops! theres yes or no: ")
                 .addPropertyNode("empty")
                 .addConstraintViolation();
             return false;
         }
         else {
             if (onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y") || onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n")){
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