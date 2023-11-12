class CookingTile:
    def __init__(self, brand, num_burners):
        # Конструктор класу ініціалізує властивості об'єкта
        self.brand = brand  # Бренд (тип) плитки
        self.num_burners = num_burners  # Кількість пальників

    def turn_on(self):
        # Метод вмикає плитку
        print(f"{self.brand} плитка включена")

    def turn_off(self):
        # Метод вимикає плитку
        print(f"{self.brand} плитка вимкнена")

    def cook(self, dish):
        # Метод готує страву на плитці
        print(f"{dish} готується на {self.brand} плитці")

    def clean(self):
        # Метод вказує на необхідність прибрати плитку
        print(f"{self.brand} плитку потрібно прибрати")

    def __str__(self):
        # Метод перевизначає функцію str() для об'єктів класу
        return f"{self.brand} плитка з {self.num_burners} пальниками"
        from cooking_tile import CookingTile

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
        from cooking_tile import CookingTile
        from gas_stove import GasStove

def main():
    electric_tile = CookingTile("Електрична", 4)
    gas_stove = GasStove("Газова", 5, "природний газ")

    # Вивід інформації про плитки та виклик методів
    print(electric_tile)
    electric_tile.turn_on()
    electric_tile.cook("Спагеті")
    electric_tile.turn_off()
    electric_tile.clean()

    print("\n" + str(gas_stove))
    gas_stove.turn_on()
    gas_stove.ignite()
    gas_stove.cook("Борщ")
    gas_stove.turn_off()
    gas_stove.clean()

if __name__ == "__main__":
    main()
