from abc import ABC, abstractmethod


class Player(ABC):
    @abstractmethod
    def __str__(self):
        pass


class Anton(Player):
    def __str__(self):
        return 'Anton'


class Danik(Player):
    def __str__(self):
        return 'Danik'


class Friendship(Player):
    def __str__(self):
        return 'Friendship'


class ChessGame():
    gameResult = {
        'Anton': Anton,
        'Danik': Danik,
        'Friendship': Friendship
    }

    @abstractmethod
    def configure(gameState):
        if gameState.count('A') > gameState.count('D'):
            return 'Anton'
        elif gameState.count('A') < gameState.count('D'):
            return 'Danik'
        else:
            return 'Friendship'

    @classmethod
    def factory(cls, gameState):
        result = cls.configure(gameState)
        return cls.gameResult[result]()


if __name__ == '__main__':
    numberOfGames = int(input())
    gameState = input()
    object = ChessGame.factory(gameState)
    print(object)
