public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public void checkOut(String name) {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            this.checkedOutTo = name;
            System.out.println("You have checked out ");
        } else {
            System.out.println("test");
        }
    }
    public void checkIn() {
        if (isCheckedOut) {
            this.isCheckedOut = false;
            this.checkedOutTo = "";
            System.out.println("You have checked in");
        }else {
            System.out.println("test 2");
        }
    }
}
