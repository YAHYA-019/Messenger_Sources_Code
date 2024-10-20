package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KO0.class */
public final class KO0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KO0[] A01;
    public static final KO0 A02;
    public static final KO0 A03;
    public static final KO0 A04;
    public static final KO0 A05;
    public static final KO0 A06;
    public static final KO0 A07;
    public static final KO0 A08;
    public final int code;

    static {
        KO0 ko0 = new KO0("SUCCESS", 0, 0);
        A07 = ko0;
        KO0 ko02 = new KO0("STREAM_CLOSED", 1, 1);
        A06 = ko02;
        KO0 ko03 = new KO0("INVALID_STREAM_ID", 2, 2);
        A05 = ko03;
        KO0 ko04 = new KO0("INVALID_FRAME", 3, 3);
        A04 = ko04;
        KO0 ko05 = new KO0("CIPHER_NOT_AVAILABLE", 4, 4);
        A02 = ko05;
        KO0 ko06 = new KO0("FRAMING_LOST", 5, 5);
        A03 = ko06;
        KO0 ko07 = new KO0("UNSUPPORTED_TYPE", 6, 6);
        A08 = ko07;
        KO0[] ko0Arr = {ko0, ko02, ko03, ko04, ko05, ko06, ko07};
        A01 = ko0Arr;
        A00 = C00t.A00(ko0Arr);
    }

    public KO0(String str, int i, int i2) {
        this.code = i2;
    }

    public static KO0 valueOf(String str) {
        return (KO0) Enum.valueOf(KO0.class, str);
    }

    public static KO0[] values() {
        return (KO0[]) A01.clone();
    }
}
