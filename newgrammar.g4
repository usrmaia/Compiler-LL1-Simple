grammar newgrammar;

prog: 
    main classe*
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
    | 'System.out.println' '(' exp ')' ';'
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
    //| 'num' //perguntar
    | 'new' ( 'int' '[' exp ']' | ID '(' ')' ('.' 'length' | '[' exp ']')? )
    | pexp ('.' 'length' | '[' exp ']')?
    ;

pexp
    : ID
    | NUMBER //nao havia numeros
    | 'this'
    | '(' exp ')'
    | ('.' ID ( '(' (exps)? ')' )? ) pexp
    ;

exps: 
    exp (',' exp)*
    ;

IGNORE 
    : (WHITESPACE | COMMENTLINE | COMMENTLINES) -> skip
    ;

WHITESPACE
    : [ \b\t\n\r]
    ;

COMMENTLINES
    : '/*' .*? '*/'
    ;

COMMENTLINE
    : '//' .*? [\n] 
    ;

RESERVEDWORDS
    : 'boolean'
    | 'class'
    | 'extends'
    | 'public'
    | 'static'
    | 'void'
    | 'main'
    | 'String'
    | 'return'
    | 'int'
    | 'if'
    | 'else'
    | 'while'
    | 'System.out.println'
    | 'length'
    | 'true'
    | 'false'
    | 'this'
    | 'new'
    ;

NUMBER
    : [0-9]+
    ;

OPERATORSPOINTING
    : '('
    | ')'
    | '['
    | ']'
    | '{'
    | '}'
    | ';'
    | '.'
    | ','
    | '='
    | '<'
    | '=='
    | '!='
    | '+'
    | '-'
    | '*'
    | '/'
    | '&&'
    | '!'
    ;

ID
    : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9] | '_' | '-')*
    ;