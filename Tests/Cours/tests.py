import unittest
from code import addition,multiplication

class Tests(unittest.TestCase):
    def test_addition(self):
        results = addition(1,2)
        self.assertEqual(results, 3)

    def test_multiplication(self):
        results = multiplication(3, 4)
        self.assertEqual (results, 12)

    def test_test_If_Values_Are_Not_Numerical_For_Multiplication(self):
        with self.assertRaises(TypeError):
            multiplication('3','4')

if __name__ == '__main__':
    unittest.main()


