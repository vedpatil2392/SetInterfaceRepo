package com.collection.setinterface;


	import java.util.Objects;

	class Person1 
	{
	    int id;
	    String name;
	    int age;

	    public Person1(int id, String name, int age)
	    {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public int hashCode() 
	    {
	        return Objects.hash(id);
	    }

	    @Override
	    public boolean equals(Object obj) 
	    {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Person1 person = (Person1) obj;
	        return id == person.id;
	    }

	    @Override
	    public String toString()
	    {
	        return "Person{id=" + id + ", name='" + name + "', age=" + age + "}";
	    }

		public int getAge() {
			// TODO Auto-generated method stub
			return 0;
		}
	}


