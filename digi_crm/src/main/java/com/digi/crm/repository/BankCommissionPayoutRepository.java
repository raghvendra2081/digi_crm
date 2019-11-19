package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.BankCommissionPayout;

@Repository
public interface BankCommissionPayoutRepository extends JpaRepository<BankCommissionPayout, Long> {

	/*@Query(value = "select * from bank_commission_payout " + "where (bu_id =?1 " + "And created_by =?2) "
			+ "and ( bank_name =?3 " + "or comm_type =?4 " + "or payment_type =?5 " + "or modified_date =?6 "
			+ "or created_date =?7 ) " + "limit 20", nativeQuery = true)
	List<BankCommissionPayout> findBankCommissionPayoutList(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate);

	
	@Query(value = "select * from bank_commission_payout " + "where (bu_id =?1 " + "And created_by =?2) "
			+ "and (bank_name =?3 " + "or comm_type =?4 " + "or payment_type =?5 " + "or modified_date =?6 "
			+ "or created_date =?7)" , nativeQuery = true)
	List<BankCommissionPayout> findBankCommissionPayoutListNoLimit(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate);*/
	
	@Query(value = "SELECT * FROM bank_commission_payout b " + " WHERE b.bu_id= ?1 " + " and b.created_by = ?2 "
			+ " or b.bank_name = ?3 " + " or b.comm_type = ?4 " + " or b.payment_type = ?5 "
			+ " or b.modified_date = ?6 " + " or b.created_date = ?7 " + "limit 20 ", nativeQuery = true)
	List<BankCommissionPayout> findBankCommissionPayoutList(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate);

	@Query(value = "SELECT * FROM bank_commission_payout b " + " WHERE b.bu_id like ?1 " + " and b.created_by like ?2 "
			+ " and b.bank_name like ?3 " + " and b.comm_type like ?4 " + " and b.payment_type like ?5 "
			+ " and b.modified_date like %?6 " + " and b.created_date like %?7 ", nativeQuery = true)
	List<BankCommissionPayout> findBankCommissionPayoutListNoLimit(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate);

	
	
}
