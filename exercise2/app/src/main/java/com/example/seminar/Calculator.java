package com.example.seminar;

public class Calculator {
    /**
     * 卒業要件
     */
    static final int youkenKyouyou = 30;
    static final int youkenKiso = 24;
    static final int youkenDaiichiMajor = 32;
    static final int youkenDainiMajor = 16;
    static final int youkenSonotaMajor = 14;
    static final int youkenJiyuu = 8;
    static final int[] youken = {
            youkenKyouyou,
            youkenKiso,
            youkenDaiichiMajor,
            youkenDainiMajor,
            youkenSonotaMajor,
            youkenJiyuu
    };

    /**
     * @param tanni 取得単位数の整数配列。
     *              new int[]{教養, 基礎, 第一メジャー, 第二メジャー, その他メジャー, 自由選択}
     * @return 卒業要件に照らして余剰分を調整した単位数の整数配列
     * - 第一メジャー、第二メジャーの余剰はその他メジャーに入る
     * - 教養、基礎、その他メジャーの余剰は自由選択に入る
     */
    public static int[] calculate(int[] tanni) {
        int kyouyou = tanni[0];
        int kiso = tanni[1];
        int daiichiMajor = tanni[2];
        int dainiMajor = tanni[3];
        int sonotaMajor = tanni[4];
        int jiyuu = tanni[5];
        //
        // 演習 問題②
        // このファイルを自由に編集して、なるべく多くのテストがPASSEDになるようにしてください
        //
        return new int[]{kyouyou, kiso, daiichiMajor, dainiMajor, sonotaMajor, jiyuu};
    }
}
