package com.sornambigai.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.repositories.ItemSubtypeDetailsRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemSubtypeDetailsDaoImpl implements ItemSubtypeDetailsDao {

	private final ItemSubtypeDetailsRepository itemSubtypeDetailsRepository;

	@Override
	public List<ItemSubtypeDetailsEntity> getSubTypeDetails() {
		return itemSubtypeDetailsRepository.findAll().stream().map(dto -> ItemSubtypeDetailsEntity.formEntity(dto))
				.collect(Collectors.toList());
	}

}
