package com.example.hrms.entities.concretes.abstracts;

import com.example.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
/*JPARepository ile model(veritabanı modeli) ile nesne modeli(Java nesnesi)
* arasında bir köprü oluşturur.JPA,oracle taradından desteklenen ve veritabanındaki verileri
* kalıcı olarak depolayabilen sınıflar ile metotlar koleksiyonudur.*/

}
