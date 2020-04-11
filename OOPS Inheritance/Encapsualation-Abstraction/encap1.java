class Author 
{
    public String name;
	public String email;
	public String gender;

    public Author(String _name, String _email, String _gender)
	{
        name = _name;
        email = _email;
        gender = _gender;
    }
}

class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String _name, double _price, int _qty, String authName, String email, String gender) 
	{
        name = _name;
        price = _price;
        qtyInStock = _qty;
        author = new Author(authName, email, gender);
    }

    public String getName() 
	{
        System.out.println("Book Name: " + name); return name;
    }

    public Author getAuthor() 
	{
        System.out.println("Author name: " + author.name);
        System.out.println("Author email: " + author.email);
        System.out.println("Author gender: " + author.gender);
        return author;
    }

    public double getPrice() 
	{
        System.out.println("Book price: " + price);
        return price;
    }

    public int getQtyInStock() 
	{
        System.out.println("Quantity in Stock: " + qtyInStock);
        return qtyInStock;
    }

    public void setPrice(double _price) 
	{ price = _price; 
	}

    public void setQtyInStock(int qty) 
	{ qtyInStock = qty; 
	}
}
class encap1
{
    public static void main(String[] args) {
        Book book1 = new Book("1998", 600.00, 20, "CompleteReference", "completeref@gmail.com", "M");
        book1.getName();
        book1.getPrice();
        book1.getAuthor();
    }
}