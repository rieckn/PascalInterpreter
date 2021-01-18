Program fibonacci

(* Testing calling a function within a function. Should print 2.0*)

var
i : real;

function test() : real;
var
x : real;
begin
    x := test2();
    test := x;
end;

function test2() : real;
begin
    test2 := 2.0;
end;

begin
    i := test();
    writeln(i);
end.