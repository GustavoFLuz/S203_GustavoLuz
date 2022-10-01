class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

print("Entre com os dados")
nome = input("Nome:")
sexo = input("Sexo:")
idade = input("Idade: ")
cpf = input("CPF: ")

cidadao = Cidadao(nome, sexo, idade, cpf)

print("CIDADAO")
print("Nome: " + cidadao.nome)
print("Sexo: " + cidadao.sexo)
print("Idade: " + cidadao.idade)
print("CPF: " + cidadao.cpf)