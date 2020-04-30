package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.EletronicosModel;


@Repository
public class EletronicosRepository {

	@Autowired
	private static Map<Long, EletronicosModel> eletronicos;

	public EletronicosRepository() {
		// Populando "banco de dados"
		eletronicos.put(1L, new EletronicosModel(1L, "Eletronico 1", "Sku-01"));
		eletronicos.put(2L, new EletronicosModel(2L, "Eletronico 2", "Sku-02"));
		eletronicos.put(3L, new EletronicosModel(3L, "Eletronico 3", "Sku-03"));
	}

	public List<EletronicosModel> findAll() {
		return new ArrayList<EletronicosModel>(eletronicos.values());
	}

	public EletronicosModel findById(long id) {
		return eletronicos.get(id);
	}

	public void save(EletronicosModel eletronico) {
		Long newId = (long) (eletronicos.size() + 1);
		eletronico.setId(newId);
		eletronicos.put(newId, eletronico);

	}

	public void update(EletronicosModel eletronico) {
		eletronicos.put(eletronico.getId(), eletronico);
	}

	public void deleteById(long id) {
		eletronicos.remove(id);
	}
}