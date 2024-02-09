// package hr;

import hr.personnel.*;
import hr.taxes.*;

public class TaxMain
{
    public static void main(String[] args)
    {
        FullTimeEmployee raja = new FullTimeEmployee("Raja Ram", 45000);

        PartTimeEmployee daniel = new PartTimeEmployee("Daniel Joseph", 25000);

        FullTimeTaxCalculator fullTax = new FullTimeTaxCalculator();

        PartTimeTaxCalculator partTax = new PartTimeTaxCalculator();

        System.out.println(fullTax.calculate(raja));
        System.out.println(partTax.calculate(daniel));

        
    }
}