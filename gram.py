from checking import Checking

class Grammar(Checking):
  def __init__(self, chain):
    Checking.__init__(self, chain)
  
  def S(self):
    self.match("c")
    self.A()
    self.Sl()
    print("Sucess")
  
  def Sl(self):
    match self.prox():
      case "d": 
        self.match("d")
      case "b":
        self.match("b")
  
  def A(self):
    self.match("c")
    self.Al()
  
  def Al(self):
    match self.prox():
      case "a":
        self.match("a")
        self.match("b")
        self.Al()
      # case _: exit(-1)

if __name__=="__main__":
  g = Grammar("ccabababb")
  g.S()
