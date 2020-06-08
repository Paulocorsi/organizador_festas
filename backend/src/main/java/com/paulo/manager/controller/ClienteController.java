package com.paulo.manager.controller;

import com.paulo.manager.model.Cliente;
import com.paulo.manager.payload.request.ClienteRequest;
import com.paulo.manager.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping("/add")
    public ResponseEntity<?> addCliente(@Valid @RequestBody ClienteRequest clienteRequest) {
        Cliente cliente = new Cliente(clienteRequest.getNome(), clienteRequest.getCpf(),
                clienteRequest.getTelefone(), clienteRequest.getData_nascimento());
        Cliente clienteResponse = clienteRepository.save(cliente);
        return ResponseEntity.ok(clienteResponse);
    }

    @GetMapping()
    public ResponseEntity<?> listar() {
        List<Cliente> cliente = clienteRepository.findAll();
        return cliente.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(cliente);
    }

}
