package com.buildbooster.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buildbooster.inventory.exception.InventoryServiceException;
import com.buildbooster.inventory.model.InventoryModel;
import com.buildbooster.inventory.response.InventoryResponse;

@Service
public interface InventoryService {

	public List<InventoryResponse> getAllInventory() throws InventoryServiceException;
	
	public InventoryResponse saveInventory(InventoryModel inventoryModel) throws InventoryServiceException;

	public List<InventoryResponse> getCompanyInventory(Long companyid);

	public List<InventoryResponse> getFacilityInventory(Long companyid,Long facilityid);

	public InventoryResponse getFacilityItem(Long companyid, Long facilityid, Long inventoryitemid);
	
}
