grammar Calculator;

parse
   : resvariable relop expression EOF
 ;

resvariable
 : LETTER (LETTER | DIGIT)+
 ;

expression
 : LPAREN expression RPAREN                  #parenthesisExp
 | expression TIMES expression               #mulExp
 | expression DIV expression                 #divExp
 | expression PLUS expression                #addExp
 | expression MINUS expression               #subExp
 | funcnameparams LPAREN funcparams RPAREN   #funcArgs
 | funcname LPAREN RPAREN                    #funcEmpty
 | number                                    #atomNumber
 | varname                                   #atomVar
 ;

funcnameparams
 : MEDIA
 | AGRUPA
 | TRUNCA
 | MENORQUE
 | GET_RV
 | ADAPTA
 | PROJECT_Q
 | PROJECT_Y
 | PROJECT
 | MEDIA_MOVIL
 | REDONDEO
 ;

funcname
 : LETTER (LETTER | DIGIT)+
 ;

MEDIA
 : 'media'
 ;

MEDIA_MOVIL
 : 'mediamovil'
 ;

AGRUPA
 : 'agrupa'
 ;

MENORQUE
 : 'menorQue'
 ;

TRUNCA
 : 'trunca'
 ;

ADAPTA
 : 'adapta'
 ;

PROJECT
  : 'amplia'
  ;

PROJECT_Q
  : 'ampliaQ'
  ;

PROJECT_Y
  : 'ampliaY'
  ;

GET_RV
  : 'getRV'
  ;

REDONDEO
 : 'redondeo'
 ;

varname
 : LETTER (LETTER | DIGIT)+
 ;

dimension
 : LETTER (LETTER | DIGIT)+
 ;

funcparams
  :    expressionorarray ( COMMA expressionorarray )*
  ;

expressionorarray
  : expression #expressionparam
  | '[' dimension ( COMMA dimension)* ']' #arrayparam
  | '[' ']' #emptyarray
 ;

relop
 : EQ
 ;

number
 : MINUS? DIGIT + (POINT DIGIT +)?
 ;

LPAREN
 : '('
 ;


RPAREN
 : ')'
 ;


PLUS
 : '+'
 ;


MINUS
 : '-'
 ;


TIMES
 : '*'
 ;


DIV
 : '/'
 ;


EQ
 : '='
 ;


POINT
 : '.'
 ;

COMMA
 : ','
 ;

LETTER
    : [a-zA-Z_\u00F1\u00D1] ;

DIGIT
   : ('0' .. '9')
   ;

COMMENT
 : HASH ~[\r\n]* -> skip
 ;

HASH
 : '#'
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

WS
   : [ \r\n\t] + -> channel (HIDDEN)
   ;