package com.tnsif.daythirteen.comparator;

import java.util.Comparator;

public class SortByStudentPer implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.getPer()-o2.getPer());
	}

}
