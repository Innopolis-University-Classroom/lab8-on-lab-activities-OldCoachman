package com.muwaffaq.innopolis.solid.homework;

import java.util.List;

public class Human {

    static class ImplementNeeds implements Needs {
        @Override
        public void ownCompany() {

        }

        @Override
        public void becomeEmployee() {

        }

        @Override
        public void pray() {
        }

        @Override
        public void playSports() {

        }

        @Override
        public void getMarried() {

        }
    }

    static class Info {
        private String name;
        public List<String> hobbies;
        private String nickname;
        private double salary;
    }

    public static class PersonalLife {
        Info info = new Info();
        public enum Languages {Arabic, English, Japanese}

        public String sayHello(Languages languages) {
            if (languages == Languages.Arabic)
                return "مرحبا";
            return "Hello";
        }

        int addHobby(String hobby) {
            info.hobbies.add(hobby);
            return info.hobbies.size();
        }
    }
    
    static class BusinessLife {
        Info info = new Info();

        void calculateTax(int percentage) {
            info.salary = info.salary * percentage;
        }
        void creatNickName(String postFix) {
            info.nickname = info.name.concat(postFix);
        }
    }
}
