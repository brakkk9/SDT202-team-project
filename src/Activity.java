public record Activity(String name, int start, int finish) {

    @Override
    public String toString() {
        return name + " [" + start + ", " + finish + ")";
    }
}
