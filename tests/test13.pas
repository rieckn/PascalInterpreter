program FindMinimumValueError

(*Enter 3 real numbers and the lowest one will be returned
 This should print "variable x does not exist" because x is trying to be printed
 but it is no longer in scope. The program will keep going and a null value will be printed*)

var
   a, b, c,  min: real;

procedure findMin(x, y, z: real; var m: real); 
begin
   if x < y then
      m:= x;
   else
      m:= y;;
   
   if z < m then
      m:= z;;
end;  

begin
   readin(a);
   readin(b);
   readin(c);
   findMin(a, b, c, min);
   writeln(x);
   writeln(min);
end.