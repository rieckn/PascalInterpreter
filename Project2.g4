grammar Project2;

program: PROGRAM Varname
         //(decconsts)?
         (vardec)?
         (funcdef)*
         (procdef)*
         mainblock
        ;

mainblock:
    BEGIN
        lines
    END '.'
    ;

block:
    vardec? 
    BEGIN
        lines
    END
    ;

decconsts:
    CONST co=var EQUAL er=exprb ';'
    | CONST co=var EQUAL exprff ';'
    ;

lines:
    (line)+
    ;

line:
      block #blockline
    | varre ';' #varreline
    | stdin #stdinline
    | writeln #writeline
    | callfunc #callfuncline
    | callproc #callprocline
    | ifstate #callIfstate
    | casestate #callcasestate
    | fordo #callfordo
    | whiledo #callwhiledo
    | BREAK ';' #break
    | CONTINUE ';' #continue
    ;

callfunc:
    var ':' EQUAL name=var '(' (funcparam (',' funcparam )*)? ')' ';'
    ;

funcparam:
    (var | exprb | exprff)
    ;

funcdef:
    FUNCTION name=var '(' funcvardef* ')' ':' op=(BOOLEAN | REAL) ';'
    vardec?
    BEGIN
    line+
    END';'
    ;

funcvardef:
    (va=var (',' va=var)* ':' op=(BOOLEAN | REAL))
    ;

procdef:
    PROCEDURE name=var '(' (funcvardef ';' )* VAR ret=var ':' op=(BOOLEAN | REAL) ')' ';'
    vardec?
    BEGIN
    line+
    END ';'
    ;

callproc:
    name=var '(' (funcparam (',' funcparam )* ',')? variable=var')' ';'
    ;

fordo:
    FOR varre TO exprff DO vardec? BEGIN line+ END ';' #fordoto
    | FOR varre DOWNTO exprff DO vardec? BEGIN line+ END ';' #fordodownto
    ;

whiledo:
    WHILE exprb DO vardec? BEGIN line+ END ';'
    ;

ifstate: 
     IF  ex=exprb  thenstate elseifstate* elsestate? ';'
    ;

thenstate:
    THEN block #thenstateBlock
    | THEN line #thenstateLine
    ;

elseifstate:
    ELSEIF '(' exprb ')' THEN block #elseifstateblock
    | ELSEIF '(' exprb ')' THEN line #elseifstateline
    ;

elsestate:
    ELSE block #elsestateBlock
    | ELSE line #elsestateLine
    ;

casestate:
    CASE '(' va=var ')' OF (cases)+ END ';'
    ;

cases:
    ex=exprff ':' block ';' #casesExprffBlock
    | eb=exprb ':' block ';' #casesExprbBlock
    | ex=exprff ':' line ';' #casesExprffLine
    | eb=exprb ':' line ';' #casesExprbLine
;

vardec:
    VAR
    (varinit)+?
    ;

varinit:
    va=var ':' BOOLEAN EQUAL er=exprb ';' #varinitequalBool
    | va=var ':' REAL EQUAL exprff ';'  #varinitequalReal
    | var (',' var)* ':' BOOLEAN ';' #varinitBool
    | var (',' var)* ':' REAL ';' #varinitReal
    | va=var ':' BOOLEAN EQUAL vr=var ';' #varinitBoolVar
    | va=var ':' REAL EQUAL vr=var ';' #varinitRealVar
    ;

varre:
    va=var ':' EQUAL vr=var  #varreVar
    | va=var ':' EQUAL er=exprb #varreExprb
    | va=var ':' EQUAL el=exprff #varreExprff
    ;

stdin:
    READ '(' va=var ')' ';' #read
    ;


writeln:
    WRITE '(' var ')' ';' #writeVar
    | WRITE '(' exprff ')' ';' #writeExprff
    | WRITE '(' exprb ')' ';' #writeExprb
    ;

exprff:
    '(' el=exprff ')' #exprffParen
    |var  #exprffVar
    | op=SPECIAL '(' ex=exprff ')' #exprffSpec 
    | left=exprff op=MULDIVMOD right=exprff #exprffMULDIVMOD
    | left=exprff op=PLUSMINUS right=exprff #exprffPLUSMINUS
    | ex=Real #exprffReal
    ;

exprb:
    '(' e=exprb ')' #exprbParen
    | var #exprbVar
    | left=exprff op=(COMPARISONS | EQUAL | NOTEQUAL) right=exprff #exprbReals
    | NOT exprb #exprbNOT
    | left=exprb AND right=exprb #exprbAND
    | left=exprb OR right=exprb #exprbOR
    | left=exprb op=(EQUAL | NOTEQUAL) right=exprb #exprbEQUAL
    | left=exprb op=ELSETHEN right=exprb #exprbELSETHEN
    | bool=Bool #exprbBool
    ;

var:
    va=Varname #varname
    ;

fragment A
    : ('a' | 'A');
fragment B
    : ('b' | 'B');
fragment C
    : ('c' | 'C');
fragment D
    : ('d' | 'D');
fragment E
    : ('e' | 'E');
fragment F
    : ('f' | 'F');
fragment G
    : ('g' | 'G');
fragment H
    : ('h' | 'H');
fragment I
    : ('i' | 'I');
fragment J
    : ('j' | 'J');
fragment K
    : ('k' | 'K');
fragment L
    : ('l' | 'L');
fragment M
    : ('m' | 'M');
fragment N
    : ('n' | 'N');
fragment O
    : ('o' | 'O');
fragment P
    : ('p' | 'P');
fragment Q
    : ('q' | 'Q');
fragment R
    : ('r' | 'R');
fragment S
    : ('s' | 'S');
fragment T
    : ('t' | 'T');
fragment U
    : ('u' | 'U');
fragment V
    : ('v' | 'V');
fragment W
    : ('w' | 'W');
fragment X
    : ('x' | 'X');
fragment Y
    : ('y' | 'Y');
fragment Z
    : ('z' | 'Z');

FOR: F O R;
TO: T O;
WHILE: W H I L E;
DO: D O;
DOWNTO: D O W N ' ' T O;
AND: A N D ;
OR: O R ;
NOT: N O T ;
VAR: V A R ;
IF: I F ;
THEN: T H E N ;
ELSE: E L S E ;
CONST: C O N S T ;
PROGRAM: P R O G R A M ;
CASE: C A S E;
BOOLEAN: B O O L E A N ;
REAL: R E A L ;
BEGIN: B E G I N ;
END: E N D ;
WRITE: W R I T E L N ;
READ: R E A D I N ;
OF: O F;
EQUAL: [=];
NOTEQUAL: [<][>];
ELSETHEN: A N D ' ' T H E N | O R ' ' E L S E;

ELSEIF: E L S E ' ' I F;
BREAK: B R E A K;
CONTINUE: C O N T I N U E;
PROCEDURE: P R O C E D U R E;
FUNCTION: F U N C T I O N;
SPECIAL: S I N | C O S | L N | E X P | S Q R T;
COMPARISONS: [>]|[<]|[>][=]|[<][=];
COMMENT:  '(*'.*?'*)' -> skip;
MULDIVMOD: [/*%];
PLUSMINUS: [+-];
Bool: T R U E | F A L S E;
Varname: [_A-Za-z][_A-Za-z0-9]*;
Real: [-]?([0-9]+)'.'[0-9]+;
WS : [ \t\r\n]+ -> skip ;