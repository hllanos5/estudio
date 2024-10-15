package com.vaxi.sprint_boot_microservice_2_compra.repository;

import com.vaxi.sprint_boot_microservice_2_compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository <Compra, Long>{

    List<Compra> findAllByUserId(Long userId);

}
