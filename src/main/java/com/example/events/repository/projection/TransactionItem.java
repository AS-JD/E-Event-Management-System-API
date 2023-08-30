package com.example.events.repository.projection;


import java.time.LocalDateTime;
// Projection interface for specific transaction details

public interface   TransactionItem  {
String getTitle();
Double getPrice();
LocalDateTime getTransactionTime();
}
