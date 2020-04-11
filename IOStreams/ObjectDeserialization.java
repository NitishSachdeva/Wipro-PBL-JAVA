import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class ObjectDeserialization
{
	public static void main(String ar[]) throws IOException, ClassNotFoundException
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\WL\\IOStreams\\DataSerialized.txt"));
		Employee st = (Employee)ois.readObject();
		System.out.println("Deserialized data from file");
		System.out.println(st);
	}
}