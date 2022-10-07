package ir.digipay.bulkshop.rest;

import ir.digipay.bulkshop.api.IndexResult;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexRestEndpoint {

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<IndexResult> index() {
		return ResponseEntity.ok(new IndexResult());
	}

}
