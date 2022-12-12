package Contents;

import java.util.*;

public class Kpop implements HallyuContent {
    public String groupName;
    public String agency;
    public List<String> memberList;

    Kpop(String groupName, String agency, List<String> memberList) {
        this.groupName = groupName;
        this.agency = agency;
        this.memberList = memberList;
    }


    @Override
    public void printInfo() {
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
