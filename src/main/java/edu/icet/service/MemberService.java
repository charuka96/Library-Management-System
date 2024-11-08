package edu.icet.service;

import edu.icet.dto.Member;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {
    List<Member> getAllMember(Member member);

    void addMember(Member member);

    void deleteMember(Integer id);

    List<Member> searchByName(String name);

    List<Member> searchByNic(String nic);
}
