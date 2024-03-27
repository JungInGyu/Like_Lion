package com.example.main;

import com.example.util.Lotto;

public class LottoGame {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();

        lotto.pick_num();
        lotto.lotto_ball();
        lotto.lotto_print();
        System.out.println(lotto.lotto_result());
    }
}
