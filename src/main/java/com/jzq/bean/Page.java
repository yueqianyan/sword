package com.jzq.bean;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 21:04
 */
public class Page {
    private int beginIndex;
    private int size;

    private static Page p = new Page();

    public static Page getInstance() {
        return p;
    }

    private Page() {}

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
