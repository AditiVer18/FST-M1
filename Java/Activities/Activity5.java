public class Activity5 {
    public static void main(String[] args) {
        String Title = " Peace of Mind";

        book newNovel = new Mybook();
        newNovel.setTitle(Title);
        System.out.println("The title is: " + newNovel.gettitle());
    }
}

abstract class book{
    String title;
    abstract void setTitle(String s);
    public String gettitle(){
        return title;
    }
}
class Mybook extends book{
    public void setTitle(String s) {
        title = s;
    }
}

