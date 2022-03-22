package com.SourceCode.SwalayanTiny;

public class UserProvider extends User{
    private User[] users;

    UserProvider(String name, String membershipId, String pin, double balance) {
        super(name, membershipId, pin, balance);
        this.users = new User[]{
            new User("Ahmad Fathoni","215150700111021", "030402", 100000),
            new User("Dimas","215150700111022", "030303", 50000),
        };
    } 

    UserProvider(){
        
    }

    void Login(String memberId, String password){
        setIsbanned(false);
        int banned = 0;
        for (User user : users) {
            while (getIsBanned() == false) {
                if (memberId.equals(user.getMembershipId())) {
                    while (getIsBanned() == false) {
                        if (password.equals(user.getPin())) {
                            System.out.println("Selamat anda berhasil login");
                        }else{
                            banned++;
                        }

                        if (banned == 3) {
                            setIsbanned(true);
                            System.out.println("Maaf akun anda ke banned");
                        }
                    }    
                }else{
                    banned++;
                }

                if (banned == 3) {
                    setIsbanned(true);
                    System.out.println("Maaf akun anda ke banned");
                }

            }
        }
    }
    
}