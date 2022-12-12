package Contents;

import java.util.*;

public class Kpop implements HallyuContent {
    public String groupName;    // 그룹 이름
    public String agency;   // 소속사
    public List<String> memberList; // 멤버 리스트

    Kpop(String groupName, String agency, List<String> memberList) {    // 생성자 선언
        this.groupName = groupName;
        this.agency = agency;
        this.memberList = memberList;
    }


    @Override
    public void printInfo() {   // 함수 오버라이딩
        System.out.println("그룹명: " + groupName);
        System.out.println("소속사: " + agency);
        System.out.println("멤버: " + memberList);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public List<String> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<String> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "Contents.Kpop{" +
                "groupName='" + groupName + '\'' +
                ", agency='" + agency + '\'' +
                ", memberList=" + memberList +
                '}';
    }
}
