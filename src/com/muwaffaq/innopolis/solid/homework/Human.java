package com.muwaffaq.innopolis.solid.homework;

import java.util.List;

public class Human {

    static class ImplementNeeds implements Needs {
        @Override
        public void ownCompany() {
            // ...
        }

        @Override
        public void becomeEmployee() {
            // ...
        }

        @Override
        public void pray() {
            // ...
        }

        @Override
        public void playSports() {
            // ...

        }

        @Override
        public void getMarried() {
            // ...
        }
    }

    static class Info {
        protected String name;
        protected List<String> hobbies;
        protected String nickname;
        protected double salary;
    }

    public static class PersonalLife extends Info {
        public enum Languages {Arabic, English, Japanese}

        public String sayHello(Languages languages) {
            if (languages == Languages.Arabic)
                return "مرحبا";
            return "Hello";
        }

        int addHobby(String hobby) {
            hobbies.add(hobby);
            return hobbies.size();
        }
    }

    static class BusinessLife extends Info {
        void calculateTax(int percentage) {
            salary = salary * percentage;
        }
        void createNickName(String postFix) {
            nickname = name.concat(postFix);
        }
    }

    static class RunHuman {
        public static void main(String[] args) {
            Human.PersonalLife human = new Human.PersonalLife();
            System.out.println(human.sayHello(Human.PersonalLife.Languages.Arabic));
        }
    }
}

