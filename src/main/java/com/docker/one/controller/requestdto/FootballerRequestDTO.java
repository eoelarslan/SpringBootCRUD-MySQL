package com.docker.one.controller.requestdto;

import com.docker.one.model.base.DataEntity;

/**
 * Created by ersin on 16.11.2019.
 */
public class FootballerRequestDTO extends DataEntity {

    private int worth;

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "FootballerRequestDTO{" +
                "worth=" + worth +
                '}';
    }
}
