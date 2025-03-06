package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Food;
import com.arindam.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
	private FoodRepository frepo;
	public void addData(Food f)
	{
		frepo.save(f);
	}
	public List<Food> getData()
	{
		return frepo.findAll();
	}
	public Food getFoodidDetails(String fid)
	{
		return frepo.findById(fid).orElse(null);
	}
    public void deleteData(String fid)
    {
    	Food f=frepo.findById(fid).orElse(null);
    	if(f!=null)
    	{
    		frepo.delete(f);
    	}
    }
    public Food updateData(Food fs,String fid)
    {
    	
    	Food f=frepo.findById(fid).orElse(null);
    	System.out.println(f);
    	if(f!=null)
    	{
    		//f.setFid(fid);
    		f.setFname(fs.getFname());
    		f.setPrice(fs.getPrice());
    		frepo.save(f);
    	}
    	System.out.println(f);
    	return f;
    }
}
