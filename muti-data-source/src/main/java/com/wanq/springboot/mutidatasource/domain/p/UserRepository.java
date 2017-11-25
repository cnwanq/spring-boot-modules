package com.wanq.springboot.mutidatasource.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
