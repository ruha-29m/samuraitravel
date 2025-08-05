package com.example.samuraitravel.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;

@Service
public class HouseService {
    private final HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    // すべての民宿をページングされた状態で取得する
    public Page<House> findAllHouses(Pageable pageable) {
        return houseRepository.findAll(pageable);
    }   
    
 // 指定されたキーワードを民宿名に含む民宿を、ページングされた状態で取得する
    public Page<House> findHousesByNameLike(String keyword, Pageable pageable) {
        return houseRepository.findByNameLike("%" + keyword + "%", pageable);
    }  
    
 // 指定したidを持つ民宿を取得する
    public Optional<House> findHouseById(Integer id) {
        return houseRepository.findById(id);
    } 
}