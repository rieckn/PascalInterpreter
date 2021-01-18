program test10

(*Testing mixing boolean expressions and floats to create one boolean expressions
  Also testing if statement without an else
  Should print:
              false
              true*)

var
x : boolean;

begin
    x := 7.5 > 3.0 = 67.9 < -76.8;
    writeln(x);
    if x
    then writeln(x);
    else x := True;;
    if x
    then writeln(x);;
end.