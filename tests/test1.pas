Program fibonacci

(* This test takes in a float value an computes fibonacci's sequence on it 
with 0 and 1 being the first two 1 values. So if 2.0 is inputted 2.0 should
be outputted. *)

var
i, num : real;


function fib(n : real) : real;
var
x, y, prev, prevprev : real;
begin
    if (n < 0.0) then
    begin
        fib := 0.0;
    end;
    if (n < 2.0) then
    begin
        fib := 1.0;
    end;
    x := fib(n - 1.0);
    y := fib(n - 2.0);
    fib := x + y;
end;

begin
    readin(num);
    i := fib(num);
    writeln(i);
end.