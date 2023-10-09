def square(n):
    """
    This function returns the square of a number.
    >>> Tasks.square(4)
    16
    >>> Tasks.square(0)
    0
    """
    return n ** 2


if __name__ == '__main__':
    import doctest

    doctest.testmod(verbose=True)