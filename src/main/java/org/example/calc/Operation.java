package org.example.calc;

public interface Operation <E> {
//     double add();

     E add(E a, E b);
     E subtract(E a, E b);
     E div(E a, E b);
     E multiply(E a, E b);


}
