package com.woniu.action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.woniu.entity.Message;
import com.woniu.entity.PageBean;
import com.woniu.entity.Product;
import com.woniu.service.IProductService;
@RestController
@RequestMapping("/api")
public class ProductController {
	@Resource
	private IProductService productServiceImpl;
	//增加
	@PostMapping("/save")
	public Message save(Product product) {
		Message msg = null;
		try {
			productServiceImpl.add(product);
			msg = new Message(true, "产品增加成功");
		} catch (Exception e) {
			msg = new Message(false, "产品增加失败"+e.getMessage());
		}
		return msg;
	}
	//删除
	@DeleteMapping("/del")
	public void del(Integer id) {
		productServiceImpl.del(id);
		
	}
	@RequestMapping("/revoke")
	public void revoke(Integer id) {
		productServiceImpl.revoke(id);
		
	}
	//修改
	@PutMapping("/edit")
	public Message edit(Product product) {
		Message msg = null;
		try {
			productServiceImpl.update(product);
			msg = new Message(true, "产品修改成功");
		} catch (Exception e) {
			msg = new Message(false, "产品修改失败"+e.getMessage());
		}
		return msg;
	}
	//查一个
	@GetMapping("/goedit")
	public Product find(@PathVariable Integer id) {
		Product product = productServiceImpl.find(id);
		return product;
	}
	//查所有
	@GetMapping("/productall")
	public Map<String, Object> findAll(PageBean pb) {
		Map<String,Object>map = new HashMap<String,Object>();
		List<Product> products = productServiceImpl.findAll(pb);
		map.put("list", products);
		map.put("page", pb);
		return map;
	}
}
