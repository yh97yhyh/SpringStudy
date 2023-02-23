package com.example.jwttutorial.repository

import com.example.jwttutorial.entity.Authority
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorityRepository : JpaRepository<Authority?, String?>
