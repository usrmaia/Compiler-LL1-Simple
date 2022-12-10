grammar Grammar;

WHITESPACE : [ \b\t\n\r] -> skip; 

NUMBER
    : [0-9]+
    ;

ID
    : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9] | '_' | '-')*
    ;


prog: 
    main 
    classe*
    ;

main:  
    'class' ID '{' 
        'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{'
            cmd? 
        '}' 
    '}'
    ;

classe:  
    'class' ID ('extends' ID)? '{' 
        (var | metodo)* 
    '}'
    ;

var: 
    tipo ID ';'
    ;

metodo: 
    'public' tipo ID '(' (params)? ')' '{' 
        (var | cmd)* 'return' exp ';' 
    '}'
    ;

params:  
    tipo ID (',' tipo ID)*;

tipo  
    : 'int' ('[' ']')*
    | 'boolean'
    | ID 
    ;

cmd 
    : '{' (cmd)? '}'
    | 'if' '(' exp ')' cmd ('else' cmd)?
    | 'while' '(' exp ')' cmd
    | 'System' '.' 'out' '.' 'println' '(' exp ')' ';'
    | ID ( '=' exp ';' | '[' exp ']' '=' exp ';' )
    ;

exp  
    : rexp ('&&' rexp)*
    ;

rexp  
    : aexp ('<' aexp | '==' aexp | '!=' aexp)*
    ;

aexp  
    : mexp ('+' mexp | '-' mexp)*
    ;

mexp  
    : sexp ('*' sexp | '/' sexp)*
    ;

sexp 
    : ('!' | '-') sexp
    | 'true'
    | 'false'
    | 'new' ( 'int' '[' exp ']' | ID '(' ')') pexp
    | pexp ('.' 'length' | '[' exp ']')?
    ;

pexp  
    : ID ('(' ')')?
    | NUMBER
    | 'this' pexp?
    | '(' exp ')'
    | ('.' ID ( '(' (exps)? ')' )? ) pexp?
    ;

exps:  
    exp (',' exp)*
    ;