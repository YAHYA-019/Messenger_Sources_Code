package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1gg, reason: invalid class name */
/* loaded from: 1gg.class */
public abstract class C1gg {
    public static final /* synthetic */ C1gg[] A00;
    public static final C1gg A01;
    public static final C1gg A02;
    public static final C1gg A03;
    public static final C1gg A04;
    public static final C1gg A05;
    public static final C1gg A06;
    public static final C1gg A07;
    public static final C1gg A08;
    public static final C1gg A09;

    static {
        C2yf c2yf = new C2yf(0);
        A06 = c2yf;
        C2yf c2yf2 = new C2yf(1);
        A09 = c2yf2;
        C2yf c2yf3 = new C2yf(2);
        A03 = c2yf3;
        C2yf c2yf4 = new C2yf(3);
        A07 = c2yf4;
        C2yf c2yf5 = new C2yf(4);
        A04 = c2yf5;
        C2yf c2yf6 = new C2yf(5);
        A08 = c2yf6;
        C2yf c2yf7 = new C2yf(6);
        A01 = c2yf7;
        C2yf c2yf8 = new C2yf(7);
        A05 = c2yf8;
        C2yf c2yf9 = new C2yf(8);
        A02 = c2yf9;
        A00 = new C1gg[]{c2yf, c2yf2, c2yf3, c2yf4, c2yf5, c2yf6, c2yf7, c2yf8, c2yf9};
    }

    public C1gg(String str, int i) {
    }

    public static IllegalStateException A00(Integer num, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" can't accept: ");
        switch (num.intValue()) {
            case 1:
                str = "MAILBOX_READY";
                break;
            case 2:
                str = "MAILBOX_HIT_ERROR";
                break;
            case 3:
                str = "CLEAN_UP";
                break;
            case 4:
                str = "CLEAN_UP_READY";
                break;
            default:
                str = "RUN_WITH_MAILBOX";
                break;
        }
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static C1gg[] values() {
        return (C1gg[]) A00.clone();
    }
}
