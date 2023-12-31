package com.korea.basic1.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByuserid(String userid);

    SiteUser findByNickname(String nickname);

    List<SiteUser> findAllByRoleIn(List<String> roles);
}
