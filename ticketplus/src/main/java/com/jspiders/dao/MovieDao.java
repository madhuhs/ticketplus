package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import org.hibernate.Session;

public class MovieDao {
    public void addMovie()//create
    {
        System.out.println("Adding Movie");
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }

    public void getMovie(Long movieId)//read
    {
        System.out.println("Finding Movie by id : "+movieId);
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }

    public void updateMovie(Long movieId)//update
    {
        System.out.println("Updating Movie by id : "+movieId);
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }

    public void deleteMovie(Long movieId)//delete
    {
        System.out.println("Deleting Movie by id : "+movieId);
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }
}
