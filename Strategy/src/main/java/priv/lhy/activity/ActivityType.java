package priv.lhy.activity;

/**
 * author : lihy
 * date : 2018/5/14 15:36
 * 增加算法只需增加枚举字段
 */
public enum ActivityType {
    NORMAL(new NormalActivity()),
    DISCOUNT(new DiscountActivity()),
    FULLLESS(new FullAndLessActivity());

    private IActivity activity;

    ActivityType(IActivity activity) {
        this.activity = activity;
    }

    public IActivity get() {
        return this.activity;
    }

}
