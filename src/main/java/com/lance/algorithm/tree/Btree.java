package com.lance.algorithm.tree;


public class Btree {
    private Btree parent;

    private Btree left;

    private String current;

    private Btree right;

    public Btree(String current) {
        this.current = current;
    }

    public Btree getParent() {
        return parent;
    }

    public void setParent(Btree parent) {
        this.parent = parent;
    }

    public Btree getLeft() {
        return left;
    }

    public void setLeft(Btree left) {
        this.left = left;
    }

    public Btree getRight() {
        return right;
    }

    public void setRight(Btree right) {
        this.right = right;
    }

    public String getCurrent() {
        return current;
    }
}
