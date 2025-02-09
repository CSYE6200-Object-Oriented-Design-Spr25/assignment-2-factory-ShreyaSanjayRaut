package edu.neu.csye6200;

import java.util.List;
import java.util.ArrayList;


abstract class AbstractStore {
    protected List<Item> items = new ArrayList<>();
    abstract void demo();
}