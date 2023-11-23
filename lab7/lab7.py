# Імпортуємо модуль os
import os

# Основна функція програми
def main():
    try:
        # Зчитуємо введення користувача для розміру квадратної матриці
        n_rows = int(input("Введіть розмір квадратної матриці: "))
        # Зчитуємо символ-заповнювач
        filler = input("Введіть символ-заповнювач: ")

        # Перевіряємо, чи введено лише один символ-заповнювач
        if len(filler) != 1:
            print("Помилка: Символ-заповнювач має містити лише один символ.")
            return


        # Обчислюємо половину рядків матриці
        half_n_rows = n_rows // 2 if n_rows % 2 == 0 else n_rows // 2 + 1

        # Створюємо зубчастий список
        arr = [[' ' for j in range(n_rows - i)] for i in range(half_n_rows)]

        # Заповнюємо верхню половину матриці відповідно до вказаних умов
        for i in range(half_n_rows):
            for j in range(n_rows - i):
                if i < j + 1:
                    arr[i][j] = filler

        # Виводимо матрицю на екран
        print_matrix(arr)

        # Записуємо матрицю у текстовий файл
        with open("MyFile.txt", "w") as fout:
            for row in arr:
                fout.write(' '.join(row) + '\n')

    except ValueError as e:
        print(f"Помилка: {e}")
    except KeyboardInterrupt:
        print("Роботу програми перервано користувачем.")

# Функція для виведення матриці на екран
def print_matrix(matrix):
    for row in matrix:
        print(' '.join(row))

# Початок виконання програми
if __name__ == "__main__":
    main()
