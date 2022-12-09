import sys
from Lexer import Lexer
from analiseSintatica import Grammar

def main(argv):
    input_ = open(argv[1], 'r')
    input_stream = list(input_)
    print("input_strem =", input_stream, end="\n\n")
    lexer = Lexer(input_stream)
    stream = lexer.getOutput()
    print("Output", stream) 
    parser = Grammar(stream)
    parser.prog()
    input_.close()
    
if __name__=="__main__":
    main(sys.argv)