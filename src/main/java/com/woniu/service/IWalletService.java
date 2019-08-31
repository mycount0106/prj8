package com.woniu.service;

import com.woniu.entity.User;
import com.woniu.entity.Wallet;

public interface IWalletService {
     public void save(User user);
     public Wallet findOne(Integer uid);
     public void update(Wallet wallet);
     public Wallet findByWid(Integer walletid,String password);
     public Wallet findByWid(Integer walletid);
     public void updatelimit(Wallet wallet);
}
