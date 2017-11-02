package com.lance.algorithm.tree;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 树存储 数组  链表
 */
public class TreeStoreDemo {
    // 普通树 使用链表

    /**
     *     a
     *  |    \
     *  b     c
     *  | \   |
     *  d e   f
     */
    public static NodeTree tree() {
        NodeTree a = new NodeTree("a");
        NodeTree b = new NodeTree("b");
        NodeTree c = new NodeTree("c");
        NodeTree d = new NodeTree("d");
        NodeTree e = new NodeTree("e");
        NodeTree f = new NodeTree("f");

        a.setAfter(Lists.newArrayList(b,c));

        b.setBefore(a);
        b.setAfter(Lists.newArrayList(d, e));

        c.setBefore(a);
        c.setAfter(Lists.newArrayList(f));

        d.setBefore(b);

        e.setBefore(b);

        f.setBefore(f);
        return a;
    }

    public static Btree btreePre() {
        Btree a = new Btree("a");
        Btree b = new Btree("b");
        Btree c = new Btree("c");
        Btree d = new Btree("d");
        Btree e = new Btree("e");
        Btree f = new Btree("f");
        Btree g = new Btree("g");
        Btree h = new Btree("h");
        Btree i = new Btree("i");
        Btree j = new Btree("j");
        Btree k = new Btree("k");

        a.setLeft(b);
        a.setRight(c);

        b.setParent(a);
        b.setLeft(d);
        b.setRight(e);

        c.setParent(a);
        c.setLeft(k);
        c.setRight(f);

        d.setParent(b);
        d.setLeft(g);
        d.setRight(h);

        e.setParent(b);

        f.setParent(c);
        d.setLeft(i);

        j.setParent(i);

        j.setParent(c);

        g.setParent(d);

        h.setParent(d);

        i.setParent(f);

        i.setRight(j);

        return a;
    }

    public static Btree btreeMiddleAndPost() {
        Btree a = new Btree("a");
        Btree b = new Btree("b");
        Btree c = new Btree("c");
        Btree d = new Btree("d");
        Btree e = new Btree("e");
        Btree f = new Btree("f");
        Btree g = new Btree("g");
        Btree h = new Btree("h");
        Btree i = new Btree("i");
        Btree j = new Btree("j");
        Btree k = new Btree("k");

        a.setLeft(b);
        a.setRight(c);

        b.setParent(a);
        b.setLeft(d);
        b.setRight(e);

        c.setParent(a);
        c.setLeft(k);
        c.setRight(f);

        d.setParent(b);
        d.setLeft(g);
        d.setRight(h);

        e.setParent(b);

        f.setParent(c);
        f.setLeft(i);

        g.setParent(d);

        h.setParent(d);

        i.setParent(f);
        i.setRight(j);

        j.setParent(i);

        j.setParent(c);

        return a;
    }
}
