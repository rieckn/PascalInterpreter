program IsPrime

(*input a real number that ends in .0 and this program
  will return true if the number is prime and false if
  it is not prime. This tests the use of while loops.*)

var
   num : real;
   result : boolean;

procedure isPrime(x: real; var y : boolean);
var
i, j : real; 
begin
   i := 2.0;
   j := 0.0;
   while (i < x) and (j = 0.0) do
   begin
        if (x % i = 0.0) then
            j := j + 1.0;;
        i := i + 1.0;
   end;
    if (j = 0.0) then
        y := true;
    else
        y := false;; 
end;  

begin
   readin(num);
   isPrime(num, result);
   writeln(result);
end.