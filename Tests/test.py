import unittest
from sort import bubble_sort

class SortTestCase(unittest.TestCase):

  def setUp(self):
    """Call before every test case."""

  def tearDown(self):
    """Call after every test case."""

  def testA(self):
    """Test Case A."""
    assert bubble_sort([2,1]) == [1,2], "bubble sort does not his job correctly"
