from unittest import TestCase
from unittest.mock import Mock

import pytest

from Tasks import Tasks


class TestTasks(TestCase):
    def test_find_average(self, numbers):
        # self.fail()
        assert Tasks.find_average([10, 20, 30]) == 20
        if not isinstance(numbers, list):
            raise TypeError("not list!")
        with pytest.raises(ValueError):
            self.calc.divide(1, 0)

    def test_bank1(self):
        person1 = Tasks.Person(100)
        bank1 = Tasks.Bank()
        person1.transfer_money(80, bank1)
        assert person1.balance == 20, "Подробности проблемы..."
        assert bank1.balance == 80
        with pytest.raises(ValueError):
            person1.transfer_money(-500, bank1)
        assert person1.balance == 20
        assert bank1.balance == 80

    def test_bank2_mok(self):
        person1 = Tasks.Person(100)
        bank2 = Mock()
        person1.transfer_money(80, bank2)
        bank2.receive_money.assert_called_with(80)


@pytest.mark.parametrize("a, b, expected", [
    (10, 0, 0),  # Умножение на 0
    (-1, 5, -5),  # Умножение отрицательного числа на положительное
    (3, 3, 9),  # Умножение двух положительных чисел
    (-2, -2, 4),  # Умножение двух отрицательных чисел
    (0, 0, 0)  # Умножение двух нулей
])
def test_multiply(a, b, expected):
    assert Tasks.multiply(a, b) == expected
