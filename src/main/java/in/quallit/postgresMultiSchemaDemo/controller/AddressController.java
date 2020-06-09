package in.quallit.postgresMultiSchemaDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.quallit.postgresMultiSchemaDemo.entity.Address;
import in.quallit.postgresMultiSchemaDemo.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressRepository addressRepository;

	@GetMapping
	public ResponseEntity<List<Address>> getAll() {
		return ResponseEntity.ok(this.addressRepository.findAll());
	}
}
