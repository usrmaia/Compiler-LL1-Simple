class TableSymbols():
  def __init__(self):
    self.Table = {
      "ID": [],
      "NUMBER": [],
      "LITERALNAMES": []
    }

    """
    self.Table = {
      "ID": [
        {'name': 'Factorial', 'pos': [(8, 16)]},
        {'name': 'a', 'pos': [(9, 39)]},
        {'name': 'num_aux', 'pos': [(10, 16), (19, 20), (21, 20), (22, 27), (29, 20), (31, 20)]}
      ],
      "NUMBER": [
        {'name': '1', 'pos': [(10, 47), (19, 24), (21, 51), (28, 20), (29, 24), (31, 51)]},
        {'name': '10', 'pos': [(11, 51)]},
        {'name': '157', 'pos': [(18, 22)]}
      ],
      "LITERALNAMES": [
        {'name': 'class', 'pos': [(8, 6), (15, 6), (26, 6)]},
        {'name': '{', 'pos': [(8, 17), (9, 41), (15, 12), (16, 36), (26, 32), (27, 36)]},
        {'name': 'public', 'pos': [(9, 11), (16, 11), (27, 11)]}
      ]
    }
    """

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
    print("TableSymbols = ")
    for key in keys:
      print(key, ":")
      for d in self.Table.get(key):
        print(d)
    print("\n")
