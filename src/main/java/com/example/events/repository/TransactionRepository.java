package com.example.events.repository;

import com.example.events.entity.Transaction;
import com.example.events.repository.projection.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    // Custom query to retrieve specific transaction details for a user

    @Query("select  e.title as title,t.price as price ,t.date as transactionTime " +"from Transaction  t left join Event e on e.eventId=t.id"+" where t.userId = : userId")
    List<TransactionItem> findAllTransactionOfUser(@Param("userId") Long userId);
}
