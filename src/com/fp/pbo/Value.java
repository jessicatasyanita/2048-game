package com.fp.pbo;

import java.awt.Color;

public enum Value {

	_0   (0,    0x776e65, 0xcdc0b4),
    _2   (2,    0x776e65, 0xeee4da),
    _4   (4,    0x776e65, 0xede0c8),
    _8   (8,    0xf9f6f2, 0xf2b179),
    _16  (16,   0xf9f6f2, 0xf59563),
    _32  (32,   0xf9f6f2, 0xf67c5f),
    _64  (64,   0xf9f6f2, 0xf65e3b),
    _128 (128,  0xf9f6f2, 0xedcf72),
    _256 (256,  0xf9f6f2, 0xedcc61),
    _512 (512,  0xf9f6f2, 0xedc850),
    _1024(1024, 0xf9f6f2, 0xedc53f),
    _2048(2048, 0xf9f6f2, 0xedc22e);

    private final int score;

    private final Color color;

    private final Color fontColor;

    Value(int n, int f, int c) {
        score = n; 					//score=value
        color = new Color(c);		//color kotaknya
        fontColor = new Color(f);	//color font nya
    }

    
    static Value of(int num) {
        return Value.valueOf("_" + num);
    }

    public Color fontColor() {
        return fontColor;
    }

    public Color color() {
        return color;
    }

    public int score() {
        return score;
    }

}
