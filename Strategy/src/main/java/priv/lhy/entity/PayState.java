package priv.lhy.entity;

import lombok.Data;

/**
 * author : lihy
 * date : 2018/5/14 15:03
 */
@Data
public class PayState {

    private double amount;
    private int state;
    private String msg;
}
