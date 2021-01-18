program test3

(*input two real values and this program will print all the
  values in between those two values incremented by 1. It will
  print descending if the first number is larger than the first
  and ascending if it is smaller*)

var
x, y ,z : real;

begin
readin(x);
readin(y);
if (x > y) then
  begin
     for z := x - 1.0 down to y + 1.0 do
      begin
         writeln(z);
      end;
  end
  else
    begin
      for z := x + 1.0 to y - 1.0 do
      begin
        writeln(z);
      end;
    end;
end.