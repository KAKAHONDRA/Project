// Создаем классы для каждого игрового объекта (камень, ножницы, бумага)
class Rock implements GameItem {
    public boolean beats(GameItem item) {
        return item instanceof Scissors;
    }

    public String toString() {
        return "Rock";
    }
}