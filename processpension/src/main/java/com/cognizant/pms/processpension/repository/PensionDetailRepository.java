/**
 * August 2022
 */
package com.cognizant.pms.processpension.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pms.processpension.model.PensionDetail;


/**
 * @author Sinjon Nath
 *
 */
@Repository
public interface PensionDetailRepository extends JpaRepository<PensionDetail, String> {
	Optional<PensionDetail> findByAadharNo(String aadharNo);
}
 