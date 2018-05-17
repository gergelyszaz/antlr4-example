grammar Calc;
exp: NUM ( OP NUM )* ;
OP: '+'|'-';
NUM: '1'..'9'('0'..'9')*; 