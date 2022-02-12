package com.mouritech.sellermanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.sellermanagement.entity.Seller;
import com.mouritech.sellermanagement.exception.SellerNotFoundException;
import com.mouritech.sellermanagement.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerRepository sellerRepository;

	@Transactional

	public List<Seller> getAllSeller() {

		return sellerRepository.findAll();
	}

	@Transactional
	
	public void saveSeller(Seller theNewSeller) {
		sellerRepository.save(theNewSeller);

	}

	@Transactional

	public Seller getSellerById(Long sellerid) throws SellerNotFoundException {
		return sellerRepository.findById(sellerid)
				.orElseThrow(() -> new SellerNotFoundException("the id is not found"));
	}

	@Transactional
	@Override
	public void updateSeller(Long sellerid, Seller theNewSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellerid)
					.orElseThrow(() -> new SellerNotFoundException(sellerid));
			existingSeller.setSellerEmail(theNewSeller.getSellerEmail());
			existingSeller.setSellerMobNo(theNewSeller.getSellerMobNo());
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Transactional

	public void updateSellerEmail(Long sellerid, String sellerEmail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellerid)
					.orElseThrow(() -> new SellerNotFoundException(sellerid));
			existingSeller.setSellerEmail(sellerEmail);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public void updateSellerMobNo(Long sellerid, Long sellerMobNo) {
			Seller existingSeller = null;
			try {
				existingSeller = sellerRepository.findById(sellerid)
						.orElseThrow(() -> new SellerNotFoundException(sellerid));
				existingSeller.setSellerMobNo(sellerMobNo);
				sellerRepository.save(existingSeller);
			} catch (SellerNotFoundException e) {
			
				e.printStackTrace();
			}
	}

	@Transactional
	
	public void deleteSeller(Long sellerid) {
		sellerRepository.deleteById(sellerid);

	}

}
