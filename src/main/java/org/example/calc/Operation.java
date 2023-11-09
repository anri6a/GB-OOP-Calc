package org.example.calc;

public interface Operation <E> {
//     double add();

     E add(E a, E b);

     double subtract();
     double div();
     double multiply();

}
