package edu.icet.service.impl;

import edu.icet.Entity.MemberEntity;
import edu.icet.dto.Book;
import edu.icet.dto.Member;
import edu.icet.repository.MemberRepository;
import edu.icet.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

 final MemberRepository repository;
 final ModelMapper mapper;

    @Override
    public List<Member> getAllMember(Member member) {
        List<Member>memberList = new ArrayList<>();
        repository.findAll().forEach(members-> memberList.add(mapper.map(members,Member.class)));
        return memberList;
    }

    @Override
    public void addMember(Member member) {
        repository.save( mapper.map(member,MemberEntity.class));
    }

    @Override
    public void deleteMember(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Member> searchByName(String name) {
   List<Member>memberList=new ArrayList<>();
        repository.findByName(name).forEach(names-> memberList.add(mapper.map(names,Member.class)));
        return memberList;
    }

    @Override
    public List<Member> searchByNic(String nic) {
        List<Member>memberList=new ArrayList<>();
        repository.findByNic(nic).forEach(nics-> memberList.add(mapper.map(nics,Member.class)));
        return memberList;
    }
}
