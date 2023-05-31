class Paper implements GameItem {
    public boolean beats(GameItem item) {
        return item instanceof Rock;
    }

    public String toString() {
        return "Paper";
    }
}
