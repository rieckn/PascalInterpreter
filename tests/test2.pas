program FindMinimumValue

(*Enter 3 real numbers and the lowest one will be returned*)

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
   writeln(min);
end.