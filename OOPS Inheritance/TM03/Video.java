class Video {
    String videoName;
    boolean checkout;
    int rating;

    public Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    String getName() { return videoName; }

    void doCheckout() {
        checkout = true;
        System.out.println("Video \"" + videoName + "\" checked out successfully.");
    }

    void doReturn() {
        checkout = false;
        System.out.println("Video \"" + videoName + "\" returned successfully.");
    }

    void receiveRating(int rate) {
        rating = rate;
        System.out.println("Rating " + rating + " has been mapped to the Video \"" + videoName + "\".");
    }

    int getRating() { return rating; }

    boolean getCheckout() { return checkout; }
}