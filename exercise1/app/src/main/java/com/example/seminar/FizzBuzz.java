package com.example.seminar;

import java.util.ArrayList;
import java.util.List;


/**
 * FizzBuzzとは
 *      1,2,Fizz,4,Buzz,Fizz,7,8,9,FizzBuzz,11...
 *      のように３の倍数の時はFizz，５の倍数の時はBuzz，両方の時はFizzBuzz，それ以外はそのまま数字を出力するプログラム
 * 
 * まずは1~25の範囲のFizzBuzzを出力するプログラムを実装しましょう
 * 
 * 続いて，「5 20」，「37 50」のように引数を2つ入力した場合，「5~20のFizzBuzz」，「37~50のFizzBuzz」のように表示する範囲を変更できるようにしてください
 *      引数は必ず1~50の整数で，2つ目の引数は1つ目の引数以上の値をとるものと考えてください
 *      引数なしで実行した場合は1~25の範囲を表示してください
 * 
 */
public class FizzBuzz {

    /**
     * argsには引数が入ります
     * 何も引数を指定していなければ空の配列です
     * 「3 10」のように入力するとargs[0]が3, args[1]が10となります
     */
    public static void main(String[] args) {
        System.out.println("FizzBuzzを出力するプログラムを作成しましょう");
    }
}
