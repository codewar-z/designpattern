import unittest
from singleton.python.src.singleton import Singleton


class TestSingleton(unittest.TestCase):
    def test_singleton(self):
        a = Singleton.get_instance()
        b = Singleton.get_instance()
        self.assertEqual(a, b)


if __name__ == '__main__':
    unittest.main()
