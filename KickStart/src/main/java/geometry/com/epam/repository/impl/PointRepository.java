package geometry.com.epam.repository.impl;

import geometry.com.epam.entity.Point;
import geometry.com.epam.repository.Repository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PointRepository implements Repository<Point> {

    private List<Point> pointList=new ArrayList<>();
    @Override
    public void add(Point item) {
        pointList.add(item);
    }

    @Override
    public void remove(Point item) {
        pointList.remove(item);
    }

    @Override
    public List<Point> readAll() {
        return pointList;
    }
}
