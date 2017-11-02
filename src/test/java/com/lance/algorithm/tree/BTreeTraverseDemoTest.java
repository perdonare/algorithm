package com.lance.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BTreeTraverseDemoTest {
    @Test
    public void postorder() throws Exception {
        BTreeTraverseDemo.postorder(TreeStoreDemo.btreeMiddleAndPost());
    }

    @Test
    public void middleorder() throws Exception {
        BTreeTraverseDemo.middleorder(TreeStoreDemo.btreeMiddleAndPost());
    }

    @org.junit.Test
    public void preorder() throws Exception {
        BTreeTraverseDemo.preorder(TreeStoreDemo.btreePre());

    }

}