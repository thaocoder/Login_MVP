package com.example.login_mvp.presenter;


import com.example.login_mvp.model.My_Model;

public class MyPresenter {
    My_Model my_Model;

    public MyPresenter(My_Model my_Model) {
        this.my_Model = my_Model;
    }

    public void checkUsernameAndPassword(String username, String password) {
        if(my_Model.checkUsernameandPassword(username,password)){

        }
    }
}
