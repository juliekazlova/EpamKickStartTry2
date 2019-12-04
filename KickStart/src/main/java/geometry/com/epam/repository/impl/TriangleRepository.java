package geometry.com.epam.repository.impl;

import geometry.com.epam.entity.Triangle;
import geometry.com.epam.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class TriangleRepository implements Repository<Triangle> {

    private List<Triangle> triangleList=new ArrayList<>();
    @Override
    public void add(Triangle item) {
        triangleList.add(item);
    }

    @Override
    public void remove(Triangle item) {
        triangleList.remove(item);
    }

    @Override
    public List<Triangle> readAll() {
        return triangleList;
    }
}
