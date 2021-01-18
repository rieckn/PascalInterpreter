program test4

(*Testing special expressions
  Should print: 2.0
                1.0
                1.609438
                -0.8414703*)

var
x : real = 5.0;
y : real = 4.0;

begin
writeln(sqrt(y));
writeln(exp(0.0));
writeln(ln(x));
writeln(sin(cos(3.14)));
end.