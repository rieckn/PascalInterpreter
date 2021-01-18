Program test5

(* This tests the break function. input a real value that is less than 20.0
   so that when it is used as a parameter in the function it will set the initial
   value of the for loop. The loop keeps incrementing until the value is equal to 20.0
   where it will break so the printed value should be 20.0 instead of the 40.0 it is
   supposed to be incremented to.*)

var
i, num : real;

function testbreak(x : real) : real;
var
z, y : real;
begin
      for z := x to 40.0 do
      begin
         y := z;
         if (y = 20.0) then
           break;;
      end;
      testbreak := y;
end;


begin
    readin(num);
    i := testbreak(num);
    writeln(i);
end.