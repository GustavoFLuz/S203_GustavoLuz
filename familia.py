class Pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencia = "Ilha Bela"
    olhos = "azuis"

class Filha(Pai):
    nome = "Luciana"
    olhos = "castanhos"

class Neta(Filha):
       nome = "Maria"
       
pai = Pai()
filha = Filha()
neta = Neta()

print(pai)
print(filha)
print(neta)