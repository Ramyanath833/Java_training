package com.security.school.repository;

import com.security.school.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer>, JpaSpecificationExecutor<UserInfo> {

    Optional<UserInfo> findByName(String username);
}
