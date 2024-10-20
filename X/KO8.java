package X;

/* loaded from: KO8.class */
public enum KO8 {
    BYPASS("bypass"),
    CURRENT("current"),
    CELL("cell"),
    WIFI_AS_CELL("wifiascell"),
    AVOID_ON_CELL("avoidoncell"),
    AVOID_ON_CELL_DATASAVER("avoidoncelldatasaver"),
    INLINE("inline"),
    SCREEN_WIDTH("screen"),
    MAX_FORMAT_WIDTH("maxformat"),
    MAX_PREFETCH_WIDTH("maxprefetch"),
    FORCE_CURRENT_DROP_FRAME("dfcurr"),
    DROP_FRAME_MIN_WATCHABLE("dfminmos"),
    FLOOR_RAISED("floorraised"),
    DROP_FRAME_MIN_WIDTH_MUTLIPLIER("dfmul"),
    AVOID_ON_ABR("avoidonabr"),
    /* JADX INFO: Fake field, exist only in values array */
    PASSTHROUGH("pst");

    public final String shortName;

    KO8(String str) {
        this.shortName = str;
    }
}
