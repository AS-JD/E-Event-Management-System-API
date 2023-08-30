package com.example.events.service;

import com.example.events.entity.Transaction;
import com.example.events.repository.TransactionRepository;
import com.example.events.repository.projection.TransactionItem;
import com.example.events.service.impl.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {
    @Autowired
    public TransactionRepository transactionRepository;
    @Override
     public Transaction saveTransaction(Transaction transaction){
         transaction.setDate(LocalDateTime.now());
         return  transactionRepository.save(transaction);
     }
     @Override
     public List<TransactionItem>findTransactionOfUser(Long userId){
         return transactionRepository.findAllTransactionOfUser(userId);
     }
}
