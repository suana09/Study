package com.ohgiraffers.section01.users;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }
}
