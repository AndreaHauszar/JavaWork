package project.studentManagement.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.studentManagement.ApplicationSession;
import project.studentManagement.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Student> students = new ArrayList<Student>();

	private List<Tests> tests = new ArrayList<Tests>();

	private List<Results> results = new ArrayList<Results>();

	@Override
	public void addStudent(Student student) {
		students.add(student);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addTests(Tests test) {
		tests.add(test);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addResults(Results result) {
		results.add(result);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

//	@Override
//	public Reading getReadingByYearAndMonth(int year, int month) {
//		for (Reading reading : readings) {
//			if (reading.hasYearAndMonth(year, month)) {
//				return reading;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public void editReading(int year, int month, int coldWater, int hotWater) {
//		Reading reading = getReadingByYearAndMonth(year, month);
//		reading.edit(coldWater, hotWater);
//		Serializer serializer = ApplicationSession.getInstance().getSerializer();
//		serializer.save(this);
//	}
//
//	@Override
//	public List<Reading> getReadings() {
//		return readings;
//	}
//
//	@Override
//	public Reading getPreviousReadingByYearAndMonth(int year, int month) {
//		int previousYear = year;
//		int previousMonth = month - 1;
//
//		if (month == 1) {
//			previousYear -= 1;
//			previousMonth = 12;
//		}
//
//		return getReadingByYearAndMonth(previousYear, previousMonth);
//	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudentName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editStudentName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> getStudentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tests getTestID(String testID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editTestID(String testID) {
		// TODO Auto-generated method stub

	}

}