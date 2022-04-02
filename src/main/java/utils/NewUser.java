package utils;

import java.util.Random;

public class NewUser {

    public static class User {
        private String name;
        private String email;

        public User() {
        }

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }




    public static String getRegistration(int lenght){
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lenght; i++){
            int number = random.nextInt(62);
            sb.append(AB.charAt(number));
        }
        return sb.toString();
    }
    public static User createUsers(){
        return new User(getRegistration(7), getRegistration(5));
    }
}


