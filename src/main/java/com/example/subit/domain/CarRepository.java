package com.example.subit.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.subit.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {


}
