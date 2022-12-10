from checking import Checking

class Parser(Checking):
    def __init__(self, chain):
        Checking.__init__(self, chain)
    
    def prog(self):
        try:
            print("prog")
            self.main()

            while self.prox() == "class": self.classe()

            return "Sucess", None

        except:
            print("Error")
            return None, self.i - 1
    
    def main(self):
        print("main")
        self.match("class")
        self.match("ID")
        self.match("{")
        self.match("public")
        self.match("static") 
        self.match("void")
        self.match("main")
        self.match("(")
        self.match("String")
        self.match("[")
        self.match("]")
        self.match("ID")
        self.match(")")
        self.match("{")

        if self.prox() == "{": self.cmd()
        if self.prox() == "if": self.cmd()
        if self.prox() == "while": self.cmd()
        if self.prox() == "System": self.cmd()
        if self.prox() == "ID": self.cmd()
        
        self.match("}")
        self.match("}")
    
    def classe(self):
        print("classe")
        self.match("class")
        self.match("ID")

        if self.prox() == "extends": 
            self.match("extends")
            self.match("ID")

        self.match("{")

        while True:
            if  self.prox() == "int" or \
                self.prox() == "boolean" or \
                self.prox() == "ID":
                self.var()

            elif self.prox() == "public": self.metodo()
            else: break

        self.match("}")
    
    def var(self):
        print("var")
        self.tipo()
        self.match("ID")
        self.match(";")
    
    def metodo(self):
        print("metodo")
        self.match("public")
        self.tipo()
        self.match("ID")
        self.match("(")

        if  self.prox() == "int" or \
            self.prox() == "boolean" or \
            self.prox() == "ID":
            self.params()

        self.match(")")
        self.match("{")

        while True:    
            if  self.prox() == "int" or \
                self.prox() == "boolean" or \
                self.prox() == "ID":
                self.var()

            elif self.prox() == "{" or \
                self.prox() == "if" or \
                self.prox() == "while" or \
                self.prox() == "System" or \
                self.prox() == "ID":
                self.cmd()

            else: break

        self.match("return")
        self.exp()
        self.match(";")
        self.match("}")
    
    def params(self):
        print("params")
        self.tipo()
        self.match("ID")

        while True:
            if self.prox() == ',':  
                self.match(",")
                self.tipo()
                self.match("ID")
            
            else: break
    
    def tipo(self):
        print("tipo")

        if self.prox() == "int": 
            self.match("int")

            while True:
                if self.prox() == "[": 
                        self.match("[")
                        self.match("]")

                else: break

        elif self.prox() == "boolean": self.match("boolean")
        elif self.prox() == "ID": self.match("ID")

    def cmd(self):
        print("cmd")
        if self.prox() == "{":
            self.match("{")

            if  self.prox() == "{" or \
                self.prox() == "if" or \
                self.prox() == "while" or \
                self.prox() == "System" or \
                self.prox() == "ID":
                self.cmd()

            self.match("}")

        if self.prox() == "if":
            self.match("if")
            self.match("(")
            self.exp()
            self.match(")")
            self.cmd()

            if self.prox() == "else":
                self.match("else")
                self.cmd()

        if self.prox() == "while": 
            self.match("while")
            self.match("(")
            self.exp()
            self.match(")")
            self.cmd()

        if self.prox() == "System": 
            self.match("System")
            self.match(".")
            self.match("out")
            self.match(".")
            self.match("println")
            self.match("(")
            self.exp()
            self.match(")")
            self.match(";")

        if self.prox() == "ID": 
            self.match("ID")

            if self.prox() == "=":
                self.match("=")
                self.exp()
                self.match(";")

            elif self.prox() == '[':
                self.match("[")
                self.exp()
                self.match("]")
                self.match("=")
                self.exp()
                self.match(";")

    def exp(self):
        print("exp")
        self.rexp()

        while True:
            if self.prox() == "&&":
                self.match("&&")
                self.rexp()

            else: break
    
    def rexp(self):
        print("rexp")
        self.aexp()

        while True:
            if self.prox() == "<":
                self.match("<")
                self.aexp()

            if self.prox() == "==":
                self.match("==")
                self.aexp()

            if self.prox() == "!=":
                self.match("!=")
                self.aexp()
            
            else: break
    
    def aexp(self):
        print("aexp")
        self.mexp()

        while True:
            if self.prox() == "+":
                self.match("+")
                self.mexp()

            if self.prox() == "-":
                self.match("-")
                self.mexp()

            else: break

    def mexp(self):
        print("mexp")
        self.sexp()

        while True:
            if self.prox() == "*":
                self.match("*")
                self.sexp()

            if self.prox() == "/":
                self.match("/")
                self.sexp()

            else: break
    
    def sexp(self):
        print("sexp")
        print(self.prox())

        if self.prox() == "!":
            self.match("!")
            self.sexp()

        elif self.prox() == "-":
            self.match("-")
            self.sexp()

        elif self.prox() == "true":
            self.match("true")

        elif self.prox() == "false":
            self.match("false")

        elif self.prox() == "new":
            self.match("new")

            if self.prox() == "int":
                self.match("int")
                self.match("[")
                self.exp()
                self.match("]")

            elif self.prox() == "ID":
                self.match("ID")
                self.match("(")
                self.match(")")

            self.pexp()
            
        elif self.prox() == "ID" or \
            self.prox() == "NUMBER" or \
            self.prox() == "this" or \
            self.prox() == "(" or \
            self.prox() == ".":
            self.pexp()

            if self.prox() == ".":
                self.match(".")
                self.match("length")

            elif self.prox() == "[":
                self.match("[")
                self.exp()
                self.match("]")
    
    def pexp(self):
        print("pexp")
        if self.prox() == "ID": 
            self.match("ID")

            if self.prox() == "(":
                self.match("(")
                self.match(")")

        elif self.prox() == "NUMBER":
            self.match("NUMBER")

        elif self.prox() == "this": 
            self.match("this")

            if  self.prox() == "ID" or \
                self.prox() == "NUMBER" or \
                self.prox() == "this" or \
                self.prox() == "(" or \
                self.prox() == ".":
                self.pexp()

        elif self.prox() == "(": 
            self.match("(")
            self.exp()
            self.match(")")

        elif self.prox() == ".": 
            self.match(".")
            self.match("ID")

            if self.prox() == "(":
                self.match("(")
                
                if  self.prox() == "!" or \
                    self.prox() == "-" or \
                    self.prox() == "true" or \
                    self.prox() == "false" or \
                    self.prox() == "new" or \
                    self.prox() == "ID" or \
                    self.prox() == "NUMBER" or \
                    self.prox() == "this" or \
                    self.prox() == "(" or \
                    self.prox() == ".":
                    self.exps()
    
                self.match(")")

                if  self.prox() == "ID" or \
                    self.prox() == "NUMBER" or \
                    self.prox() == "this" or \
                    self.prox() == "(" or \
                    self.prox() == ".":
                    self.pexp()  

    def exps(self):
        print("exps")
        self.exp()

        while True:
            if self.prox() == ",":
                self.match(",")
                self.exp()
            
            else: break
        
if __name__=="__main__":
    lista = ['class', 'ID', '{', 'public', 'static', 'void', 'main', '(', 'String', '[', ']', 'ID', ')', '{', 'System', '.', 'out', '.', 'println', '(', 'new', 'ID', '(', ')', '.', 'ID', '(', 'NUMBER', ')', ')', ';', '}', '}', 'class', 'ID', '{', 'public', 'int', 'ID', '(', 'int', 'ID', ')', '{', 'int', 'ID', ';', 'if', '(', 'ID', '<', 'NUMBER', ')', 'ID', '=', 'NUMBER', ';', 'else', 'ID', '=', 'ID', '*', '(', 'this', '.', 'ID', '(', 'ID', '-', 'NUMBER', ')', ')', ';', 'return', 'ID', ';', '}', '}', 'class', 'ID', 'extends', 'ID', '{', 'public', 'int', 'ID', '(', 'int', 'ID', ')', '{', 'if', '(', 'ID', '<', 'NUMBER', ')', 'ID', '=', 'NUMBER', ';', 'else', 'ID', '=', 'ID', '*', '(', 'this', '.', 'ID', '(', 'ID', '-', 'NUMBER', ')', ')', ';', 'return', 'ID', '-', 'ID', ';', '}', 'int', 'ID', ';', '}']
    g = Parser(lista)
    g.prog()