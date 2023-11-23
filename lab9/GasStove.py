from CookingTile import CookingTile

class GasStove(CookingTile):
    def __init__(self, brand, num_burners, gas_type):
        # Конструктор класу GasStove викликає конструктор базового класу і додає властивість gas_type
        super().__init__(brand, num_burners)
        self.gas_type = gas_type  # Тип газу, який використовується

    def ignite(self):
        # Метод запалює газову плитку
        print(f"{self.brand} газову плитку запалено")

    def __str__(self):
        # Метод перевизначає функцію str() для об'єктів класу GasStove
        return f"{super().__str__()}, тип газу: {self.gas_type}"