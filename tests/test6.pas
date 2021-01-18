Program test6

(*Testing switch statement with blocks for statements.
  Also tests variable declaration for a new scope as well
  as continue keyword.
  Should print:
               4.0
               4.0
               *)

var
x : real;
begin
x := 4.0;
case (x) of
2.0 :
    begin
        writeln(2.0);
        writeln(2.0);
    end;
3.0 : 
    begin
        writeln(3.0);
        writeln(3.0);
    end;
4.0 :
    var
    y : real = 4.0;
    begin
        writeln(y);
        continue;
        writeln(y);
    end;
end;
writeln(x);
end.