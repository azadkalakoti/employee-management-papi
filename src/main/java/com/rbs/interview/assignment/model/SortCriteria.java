package com.rbs.interview.assignment.model;

public enum SortCriteria {

	NAME("name"),
	SALARY("salary"),
	HIRE_DATE("hireDate");
	
	private final String sortingCriteria;
	
	private SortCriteria(String sortingCriteria) {
		this.sortingCriteria = sortingCriteria;
	}

	public String getSortingCriteria() {
		return sortingCriteria;
	}
}
