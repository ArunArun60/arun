package com.wipro.exce;

public class Student {
 private int stid;
 private string stname;
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public string getStname() {
	return stname;
}
public void setStname(string stname) {
	this.stname = stname;
}
public Student() 
{
}
public Student(int stid, string stname) {
	this.stid = stid;
	this.stname = stname;
}
@Override
public String toString() {
	return stid+" " +stname;
   }


}






	


