class VideoStore {
    Video[] store = new Video[100];
    int index = -1;

    void addVideo(String name) {
        if (returnPos(name) < 0) {
            store[++index] = new Video(name);
            System.out.println("Video \"" + name + "\" has been added successfully.");
        }
        else System.out.println("Video already exists!!");
    }

    int returnPos(String name) {
        int i = 0;
        while (i <= index) {
            if (store[i].videoName.equals(name)) return i;
            i++;
        }
        return -1;
    }

    void doCheckout(String name) {
        int i = returnPos(name);
        store[i].doCheckout();
    }

    void doReturn(String name) {
        int i = returnPos(name);
        store[i].doReturn();
    }

    void receiveRating(String name, int rating) {
        int i = returnPos(name);
        store[i].receiveRating(rating);
    }

    void listInventory() {
        System.out.println("-----------------------------------------");
        System.out.println("Video Name    |Checkout Status    |Rating");
        if (index < 0) System.out.println("No videos to show!!");
        else for (int i = 0;i <= index;i++) {
            System.out.printf("%-13s |%15b \t  |%6d\n", store[i].videoName, store[i].checkout, store[i].rating);
        }
        System.out.println("-----------------------------------------");
    }
}