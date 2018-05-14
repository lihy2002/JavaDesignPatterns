package priv.lhy.entity;

import lombok.Data;

/**
 * author : lihy
 * date : 2018/5/14 15:28
 */
@Data
public class FullLessInfo {

    private double full;
    private double less;

    public FullLessInfo(double full, double less) {
        this.full = full;
        this.less = less;
    }
}
