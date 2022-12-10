import sys
from Lexer import Lexer
from Parser import Parser

def main(argv):
    input_ = open(argv[1], 'r')
    input_stream = list(input_)
    print("input_strem =", input_stream)
    
    lexer = Lexer(input_stream)
    stream = lexer.getOutput()
    print("Output", stream) 
    
    parser = Parser(stream)
    result, err = parser.prog()
    if err: lexer.Error(err)
    else: print(result)
    
    input_.close()
    
if __name__=="__main__":
    main(sys.argv)