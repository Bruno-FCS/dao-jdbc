package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println("=== TEST 3: seller findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		list2.forEach(System.out::println);

		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("=== TEST 5: seller update ===");
		Seller seller2 = sellerDao.findById(1);
		seller2.setName("Martha Waine");
		sellerDao.update(seller2);
		System.out.println("Update completed!");

		System.out.println("=== TEST 6: seller delete ===");
		sellerDao.deleteById(8);
		System.out.println("Seller deleted!");*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);

		System.out.println("=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "VideoGames");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("=== TEST 4: department update ===");
		Department department2 = departmentDao.findById(1);
		department2.setName("Beverage");
		departmentDao.update(department2);
		System.out.println("Update completed!");

		System.out.println("=== TEST 5: department delete ===");
		departmentDao.deleteById(6);
		System.out.println("Department deleted!");
	}

}
