package guru.soap.model;

public class User {
	private String name;
	private int age;
	private String job;
	private int id;
	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", job=" + job + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
