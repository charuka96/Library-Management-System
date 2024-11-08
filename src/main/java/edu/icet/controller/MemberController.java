package edu.icet.controller;

import edu.icet.dto.Member;
import edu.icet.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/member")
public class MemberController {
    final MemberService service;

   @PostMapping("/add-member")
   public void  addMember(@RequestBody Member member){
       service.addMember(member);
   }
    @GetMapping("/getAll-members")
    public List<Member> getAllMember(Member member){
         return service.getAllMember(member);

    }
    @DeleteMapping("/delete-member/{id}")
    public void deleteMember(@PathVariable Integer id ){
       service.deleteMember(id);
    }
    @PostMapping("/update-member")
    public void updateMember(@RequestBody Member member){
       service.addMember(member);
    }
    @GetMapping("/search-by-name/{name}")
public List<Member>searchByName(@PathVariable String name){
       return service.searchByName(name);
    }

    @GetMapping("search-by-nic/{nic}")

    public List<Member>searchByNic(@PathVariable String nic){
       return service.searchByNic(nic);
    }


}
