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
		wallet.setAccount(user.getPhone());
		wallet.setUid(user.getUid());
		wallet.setCreatetime(new Date());
		wallet.setCountlimit(5000.0);
		wallet.setCanlimit(5000.00);
		walletMapper.insertSelective(wallet);
	}
	@Override
	public Wallet findOne(Integer uid) {
		
		return walletMapper.findByUid(uid);
	}
	@Override
	public void update(Wallet wallet) {
		
		walletMapper.updateByUid(wallet);
	}
	@Override
	public Wallet findByWid(Integer walletid, String password) {
		
		return walletMapper.findByWid(walletid, password);
	}
	@Override
	public Wallet findByWid(Integer walletid) {
		
		return walletMapper.selectByPrimaryKey(walletid);
	}

}
