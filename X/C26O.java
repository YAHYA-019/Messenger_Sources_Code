package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.26O, reason: invalid class name */
/* loaded from: 26O.class */
public final class C26O implements AnonymousClass262 {
    public static final /* synthetic */ C26O[] A00;
    public static final C26O A01;
    public static final C26O A02;
    public static final C26O A03;
    public static final C26O A04;
    public static final C26O A05;
    public static final C26O A06;
    public static final C26O A07;
    public static final C26O A08;
    public static final C26O A09;
    public static final C26O A0A;
    public static final C26O A0B;
    public static final C26O A0C;
    public static final C26O A0D;
    public static final C26O A0E;
    public static final C26O A0F;
    public static final C26O A0G;
    public static final C26O A0H;
    public static final C26O A0I;
    public static final C26O A0J;
    public static final C26O A0K;
    public static final C26O A0L;
    public static final C26O A0M;
    public static final C26O A0N;
    public static final C26O A0O;
    public static final C26O A0P;
    public static final C26O A0Q;
    public final boolean _defaultState;
    public final int _mask = 1 << ordinal();

    static {
        C26O c26o = new C26O("USE_BIG_DECIMAL_FOR_FLOATS", 0, false);
        A0M = c26o;
        C26O c26o2 = new C26O("USE_BIG_INTEGER_FOR_INTS", 1, false);
        A0N = c26o2;
        C26O c26o3 = new C26O("USE_LONG_FOR_INTS", 2, false);
        A0P = c26o3;
        C26O c26o4 = new C26O("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 3, false);
        A0O = c26o4;
        C26O c26o5 = new C26O("FAIL_ON_UNKNOWN_PROPERTIES", 4, true);
        A0F = c26o5;
        C26O c26o6 = new C26O("FAIL_ON_NULL_FOR_PRIMITIVES", 5, false);
        A0B = c26o6;
        C26O c26o7 = new C26O("FAIL_ON_NUMBERS_FOR_ENUMS", 6, false);
        A0C = c26o7;
        C26O c26o8 = new C26O("FAIL_ON_INVALID_SUBTYPE", 7, true);
        A07 = c26o8;
        C26O c26o9 = new C26O("FAIL_ON_READING_DUP_TREE_KEY", 8, false);
        A0D = c26o9;
        C26O c26o10 = new C26O("FAIL_ON_IGNORED_PROPERTIES", 9, false);
        A06 = c26o10;
        C26O c26o11 = new C26O("FAIL_ON_UNRESOLVED_OBJECT_IDS", 10, true);
        A0G = c26o11;
        C26O c26o12 = new C26O("FAIL_ON_MISSING_CREATOR_PROPERTIES", 11, false);
        A08 = c26o12;
        C26O c26o13 = new C26O("FAIL_ON_NULL_CREATOR_PROPERTIES", 12, false);
        A0A = c26o13;
        C26O c26o14 = new C26O("FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", 13, true);
        A09 = c26o14;
        C26O c26o15 = new C26O("FAIL_ON_TRAILING_TOKENS", 14, false);
        A0E = c26o15;
        C26O c26o16 = new C26O("WRAP_EXCEPTIONS", 15, true);
        A0Q = c26o16;
        C26O c26o17 = new C26O("ACCEPT_SINGLE_VALUE_AS_ARRAY", 16, false);
        A04 = c26o17;
        C26O c26o18 = new C26O("UNWRAP_SINGLE_VALUE_ARRAYS", 17, false);
        A0L = c26o18;
        C26O c26o19 = new C26O("UNWRAP_ROOT_VALUE", 18, false);
        A0K = c26o19;
        C26O c26o20 = new C26O("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 19, false);
        A02 = c26o20;
        C26O c26o21 = new C26O("ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", 20, false);
        A01 = c26o21;
        C26O c26o22 = new C26O("ACCEPT_FLOAT_AS_INT", 21, true);
        A03 = c26o22;
        C26O c26o23 = new C26O("READ_ENUMS_USING_TO_STRING", 22, false);
        A0H = c26o23;
        C26O c26o24 = new C26O("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 23, false);
        A0I = c26o24;
        C26O c26o25 = new C26O("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", 24, false);
        A0J = c26o25;
        C26O c26o26 = new C26O("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 25, true);
        C26O c26o27 = new C26O("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 26, true);
        C26O c26o28 = new C26O("EAGER_DESERIALIZER_FETCH", 27, true);
        A05 = c26o28;
        C26O[] c26oArr = new C26O[28];
        System.arraycopy(new C26O[]{c26o, c26o2, c26o3, c26o4, c26o5, c26o6, c26o7, c26o8, c26o9, c26o10, c26o11, c26o12, c26o13, c26o14, c26o15, c26o16, c26o17, c26o18, c26o19, c26o20, c26o21, c26o22, c26o23, c26o24, c26o25, c26o26, c26o27}, 0, c26oArr, 0, 27);
        System.arraycopy(new C26O[]{c26o28}, 0, c26oArr, 27, 1);
        A00 = c26oArr;
    }

    public C26O(String str, int i, boolean z) {
        this._defaultState = z;
    }

    public static C26O valueOf(String str) {
        return (C26O) Enum.valueOf(C26O.class, str);
    }

    public static C26O[] values() {
        return (C26O[]) A00.clone();
    }

    @Override // X.AnonymousClass262
    public boolean APc() {
        return this._defaultState;
    }

    @Override // X.AnonymousClass262
    public int Ava() {
        return this._mask;
    }
}
