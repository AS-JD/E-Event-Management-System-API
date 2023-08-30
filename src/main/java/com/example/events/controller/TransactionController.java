package com.example.events.controller;
import com.example.events.entity.Transaction;
//import com.example.events.security.UserPrincipal;
import com.example.events.service.impl.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    private ITransactionService transactionService;
    // Get all transactions of the currently authenticated user

//    @GetMapping
//    public ResponseEntity<?> getAllTransactionOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
//        return  ResponseEntity.ok(transactionService.findTransactionOfUser(userPrincipal.getId()));
//    }

    // Save a new transaction

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
        return  new ResponseEntity <>(transactionService.saveTransaction(transaction ), HttpStatus.CREATED);
    }


}