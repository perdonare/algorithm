package com.lance.algorithm.tree;

import java.util.List;

public class NodeTree {
    /**
     * 前驱节点
     */
    private NodeTree before;
    /**
     * 当前数据
     */
    private String current;
    /**
     * 后置节点
     */
    private List<NodeTree> after;

    public NodeTree(String current) {
        this.current = current;
    }

    public NodeTree getBefore() {
        return before;
    }

    public void setBefore(NodeTree before) {
        this.before = before;
    }

    public List<NodeTree> getAfter() {
        return after;
    }

    public void setAfter(List<NodeTree> after) {
        this.after = after;
    }
}
