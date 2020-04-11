import java.util.Scanner;

class VideoLauncher {
    public static void main(String[] args) {
        int choice = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        while(true) {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit.");
            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    s = sc.next();
                    vs.addVideo(s);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    s = sc.next();
                    vs.doCheckout(s);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    s = sc.next();
                    vs.doReturn(s);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    s = sc.next();
                    System.out.print("\nEnter the rating for this video: ");
                    int n = sc.nextInt();
                    vs.receiveRating(s, n);
                    System.out.println();
                    break;
                case 5:
                    vs.listInventory();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting...Thanks for using the application!!!");
                    return;
            }
        }
    }
}