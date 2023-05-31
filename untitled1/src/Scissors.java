class Scissors implements GameItem {
    public boolean beats(GameItem item) {
        return item instanceof Paper;
    }

    public String toString() {
        return "Scissors";
    }
}