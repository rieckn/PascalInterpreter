program test9

(*Testing Case more extensively using variables as each case
  should print:
              false
              true
              false
              4.0*)

var
x,y,z : real;
a,b,c : boolean;
q : real = sqrt(16.0);

begin
    x := 3.0;
    y := 4.0;
    z := 5.0;
    case (q) of
    x : 
        begin
            a := true;
            b := false;
            c := false;
        end;
    y : 
        begin
            a := false;
            b := true;
            c := false;
        end;
    z : 
        begin
            a := false;
            b := false;
            c := true;
        end;
    end;
    writeln(a);
    writeln(b);
    writeln(c);
    writeln(q);
end.