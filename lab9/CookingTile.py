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