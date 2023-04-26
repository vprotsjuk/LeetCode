package src;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setTitle("Tutoto");
        boolean titleLength = video.getTitle().length() > 5;
        System.out.println(titleLength);
    }
}
