package edu.icet.repository;

import edu.icet.Entity.MemberEntity;
import edu.icet.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<MemberEntity,Integer> {
    List<MemberEntity> findByName(String name);
    List<MemberEntity>findByNic(String nic);
}
