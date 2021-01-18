Program fibonacci

(* This test takes in a float value an computes fibonacci's sequence on it 
with 0 and 1 being the first two 1 values. So if 2.0 is inputted 2.0 should
be outputted. In this case I use a procedure instead of a function*)

var
i, num : real;

procedure fib(n : real; var result : real);
var
x, y : real;
begin
    if (n < 0.0) then
    begin
        result := 0.0;
    end
    else if (n < 2.0) then
    begin
        result := 1.0;
    end
    else
    begin
        fib(n - 1.0, x);
        fib(n - 2.0, y);
        result := x + y;
    end;
end;

begin
    readin(num);
    fib(num, i);
    writeln(i);
end.