from CookingTile import CookingTile
from GasStove import GasStove

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