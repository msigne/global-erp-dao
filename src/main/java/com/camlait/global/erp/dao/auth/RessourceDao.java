package com.camlait.global.erp.dao.auth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.camlait.global.erp.domain.auth.user.Ressource;

public interface RessourceDao extends JpaRepository<Ressource, String> {

	Page<Ressource> findByCodeRessource(String codeRessource, Pageable p);
}
