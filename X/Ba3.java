package X;

/* loaded from: Ba3.class */
public abstract class Ba3 {
    public static final 1G2 A00;
    public static final 1G2 A01;
    public static final 1G2 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;

    static {
        1G2 A002 = 1G3.A00(1G0.A04, "messages/");
        A02 = A002;
        1G2 A003 = 1G3.A00(A002, "search/");
        A04 = A003;
        A03 = 1G3.A00(A003, "search_result_debug_layer_enabled");
        A00 = 1G3.A00(A003, "contact_search_ranking_last_run");
        A01 = 1G3.A00(A003, "feature_fetching_graphql_last_run");
    }
}
