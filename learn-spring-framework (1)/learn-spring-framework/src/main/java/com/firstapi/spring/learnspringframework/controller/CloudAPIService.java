package com.firstapi.spring.learnspringframework.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapi.spring.learnspringframework.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVentorDetails(String vendorId) {

		return cloudVendor;
		/// "C1", "Vendor 1", "Address One", "xxxx");

	}
	@PostMapping
	public String createCloudVendorDetails(
			@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";

	}
	@PutMapping
	public String updateCloudVendorDetails(
			@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Updated Successfully";

	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud Vendor deleted Successfully";

	}

}
