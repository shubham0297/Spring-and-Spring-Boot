package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	List<Product> productList;
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		return productList;
	}
	
	private Product filterProductById(long pid)
	{
		return this.productList.stream().skip(this.productList.size()-1).findFirst().orElse(null);
	}
	
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable("id") int pid) {
		return this.filterProductById(pid);
	}
	
	@PostMapping(value="/products",consumes="application/json",produces="application/json")
	public Product addProduct(@RequestBody Product product) {
		long nextId=0;
		if(this.productList.size()!=0) {
			Product lastProd = this.productList.stream().skip(this.productList.size()-1).findFirst().orElse(null);
			nextId=lastProd.getProductId()+1;
		}
		product.setProductId(nextId);
		this.productList.add(product);
		return product;
	}
	
	
	@PutMapping(value="/products",consumes="application/json",produces="application/json")
	public Product updateProduct(@RequestBody Product product){
		long idToBeUpdated = product.getProductId();
		Product updatedProduct = this.filterProductById(idToBeUpdated);
		if(updatedProduct!= null){
			updatedProduct.setProductId(105);
			updatedProduct.setProductName("Jabra Earphones");
			updatedProduct.setRefName("images/jabra_earphones.jpg");
			updatedProduct.setRating(4.5);
			updatedProduct.setPrice(7000);
		}
		return updatedProduct;
	}
	
	@DeleteMapping(value="/products",consumes="application/json",produces="application/json")
	public Product removeProduct(@RequestBody Product product){
		Product productToDelete = this.filterProductById(product.getProductId());
		if(productToDelete!=null) {
			this.productList.remove(productToDelete);
		}
		return productToDelete;
	}
}
