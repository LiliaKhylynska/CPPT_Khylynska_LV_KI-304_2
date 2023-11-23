# Імпортуємо модуль для роботи з математичними функціями
import math

# Імпортуємо модуль для роботи з бінарними даними
import struct

# Функція для обчислення виразу ctg(8x) / x
def calculate_expression(x):
    # Перевірка на ділення на нуль
    if x == 0:
        return "Ділення на нуль"
    else:
        # Обчислення виразу
        y = 1 / math.tan(8 * x) / x
        return y

# Основна функція програми
def main():
    try:
        # Зчитуємо значення x від користувача
        x = float(input("Введіть значення x: "))

        # Обчислюємо результат виразу
        result = calculate_expression(x)

        # Записуємо результат у текстовий файл
        with open("result.txt", "w") as text_file:
            text_file.write(f"Значення x: {x}\n")
            text_file.write(f"Результат виразу y = ctg(8x) / x: {result}\n")

        # Записуємо результат у двійковий файл
        with open("result.bin", "wb") as binary_file:
            # Упаковуємо результат як 4-байтовий float
            binary_result = struct.pack('f', result)
            binary_file.write(binary_result)

        print(f"Результат збережено у файлах result.txt та result.bin")
    
    except ValueError as e:
        print(f"Помилка: {e}")
    except ZeroDivisionError:
        print("Помилка: Ділення на нуль")
    except KeyboardInterrupt:
        print("Роботу програми перервано користувачем.")

# Викликаємо основну функцію
    main()
