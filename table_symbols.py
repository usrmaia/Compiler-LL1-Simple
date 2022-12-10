class TableSymbols():
  def __init__(self):
    self.Table = {
      "ID": [],
      "NUMBER": [],
      "LITERALNAMES": []
    }

  def AddToken(self, type, token, line, column):
    line += 1
    column += 1

    if type not in list(self.Table.keys()): exit(-1)
    elif not self.existToken(token, type):
      get_type = self.Table.get(type)
      d = {
        "name": token,
        "pos": [(line, column)]
      }

      get_type.append(d)
      self.Table.update({type: get_type})
    elif self.existToken(token, type):
      get_type = self.Table.get(type)
      new_position = (line, column)
      d = {}

      for t in get_type:
        if token == t.get("name"): 
          list_pos = t.get("pos")

          if self.existPosition(new_position, list_pos): break

          list_pos.append(new_position)

          d = {
            "name": token,
            "pos": list_pos
          }

          t = d
      
      self.Table.update({type: get_type})
  
  def existToken(self, token, type):
    get_type = self.Table.get(type)
    if not get_type: return False

    for t in get_type:
      if token == t.get("name"): return True
    return False
  
  def existPosition(self, position, get_pos):
    if position in get_pos: return True
    return False
    
  def getPosition(self, type, token, index):
    list_position = self.Table.get(type)

    for p in list_position:
      if token == p.get("name"): 
        list_pos = p.get("pos")
        position = list_pos[index]
        return position[0], position[1]

    return False
  
  def print(self):
    keys = self.Table.keys()
    keys = list(keys)
    print("TABLE OF SYMBOLS")
    for key in keys:
      print(key, ":")
      for d in self.Table.get(key):
        print(d)
