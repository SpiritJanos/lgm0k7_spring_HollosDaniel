package com.spring.lgm0k7.car.controller.response;

import com.spring.lgm0k7.car.entity.CarEntity;

import java.util.List;

public class CarListResponse {

    private List<CarEntity> cars;

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }
}
