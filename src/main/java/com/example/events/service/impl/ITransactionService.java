package com.example.events.service.impl;

import com.example.events.entity.Transaction;
import com.example.events.repository.projection.TransactionItem;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    List<TransactionItem> findTransactionOfUser(Long userId);
}
