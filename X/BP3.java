package X;

/* loaded from: BP3.class */
public enum BP3 implements C4zn {
    UNKNOWN("unknown"),
    NULL_STATE("null_state"),
    TYPEAHEAD("typeahead"),
    ALL_TAB("all_tab"),
    PEOPLE_TAB("people_tab"),
    GROUPS_TAB("groups_tab"),
    PAGES_TAB("pages_tab"),
    IG_FOLLOWINGS_TAB("ig_followings_tab"),
    IG_NON_FOLLOWINGS_TAB("ig_non_followings_tab"),
    GLOBAL_SEARCH_NULL_STATE("global_search_null_state"),
    GLOBAL_SEARCH_KEY_PRESSED("global_search_key_pressed");

    public final String loggingName;

    BP3(String str) {
        this.loggingName = str;
    }

    public static BP3 A00(BP5 bp5) {
        switch (bp5.ordinal()) {
            case 1:
                return NULL_STATE;
            case 2:
                return TYPEAHEAD;
            case 3:
                return ALL_TAB;
            case 5:
            case 12:
                return PEOPLE_TAB;
            case 6:
            case 13:
            case 15:
                return GROUPS_TAB;
            case 7:
            case 14:
                return PAGES_TAB;
            case 22:
                return IG_FOLLOWINGS_TAB;
            case 23:
                return IG_NON_FOLLOWINGS_TAB;
            case 27:
                return GLOBAL_SEARCH_NULL_STATE;
            case 28:
                return GLOBAL_SEARCH_KEY_PRESSED;
            default:
                0fH.A14("SearchResultSurface", "Unknown tab type: %s", new Object[]{bp5.loggingName});
                return UNKNOWN;
        }
    }

    @Override // X.C4zn
    public String Aus() {
        throw 0Q8.createAndThrow();
    }
}
