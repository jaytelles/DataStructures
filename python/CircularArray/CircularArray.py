from array import array

class CircularArray:
    def __init__(self, size):
        self.size = size
        start = 0 
        end = 0
        self.array = array