package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }


    public Collection<Transaction> getTransactions(Long cbu) {
        Collection<Transaction> trasactions = transactionRepository.findAll();
        trasactions.removeIf(transaction -> transaction.getCbu() != cbu);

        return trasactions;
    }


    public Optional<Transaction> getTransaction(Long id) {
        return transactionRepository.findById(id);
    }

    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }
}
