package com.exemple.metier;


import com.exemple.dao.IDao;

public class MetierImpl implements Imetier {
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
}
