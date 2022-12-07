class Checking():
  def __init__(self, chain):
    self.i = 0
    self.chain = chain

  def match(self, t):
    if t == self.chain[self.i]:
      self.i += 1
    else: exit(-1)
  
  def prox(self): 
    try: return self.chain[self.i]
    except: return -1

if __name__=="__main__":
  p = Checking()
  print(p.match("c"), p.match("A"))