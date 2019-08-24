package com.woniu.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.User;
import com.woniu.entity.Wallet;
import com.woniu.mapper.WalletMapper;
import com.woniu.service.IWalletService;
@Service
public class WalletServiceImpl implements IWalletService {
    @Resource
	private WalletMapper walletMapper;
	@Override
	public void save(User user) {
		Wallet wallet=new Wallet();
		wallet.setAccount(Integer.parseInt(user.getPhone()));
		wallet.setUid(user.getUid());
		wallet.setCreatetime(new Date());
		wallet.setLimit(5000.0);
		wallet.setCanlimit(5000.0);
		walletMapper.insertSelective(wallet);
	}

}