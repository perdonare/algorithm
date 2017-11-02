package com.lance.algorithm.tree;

/**
 * 二叉树的遍历  前序  中序 后序 层序
 */
public class BTreeTraverseDemo {
    /**
     *  前序遍历
     *  A B D G H E C K F I J
     */
    public static void preorder(Btree btree) {
        System.out.print(btree.getCurrent() + "  ");
        if (btree.getLeft() != null) {
            preorder(btree.getLeft());
        }

        if (btree.getRight() != null) {
            preorder(btree.getRight());
        }
    }

    /**
     * 中序遍历
     * G D H B E A K C I J F
     */
    public static void middleorder(Btree btree) {
        if (btree != null) {
            if (btree.getLeft() != null) {
                middleorder(btree.getLeft());
            }
            System.out.print(btree.getCurrent() + "  ");

            if (btree.getRight() != null) {
                middleorder(btree.getRight());
            }

        }
    }

    /**
     * 后序遍历
     * G H D E B K J I F C A
     */
    public static void postorder(Btree btree) {
        if (btree != null) {
            if (btree.getLeft() != null) {
                postorder(btree.getLeft());
            }

            if (btree.getRight() != null) {
                postorder(btree.getRight());
            }

            System.out.print(btree.getCurrent() + "  ");


        }
    }

    /**
     * 层序遍历
     */
    public static void layerorder(Btree btree) {

    }
}
