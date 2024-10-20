package X;

/* renamed from: X.4fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fk.class */
public final class C06014fk {
    public static volatile C06014fk A02;
    public C06004fj A00;
    public boolean A01;

    public static Esr A00() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A00, "AppInfo Factory is not provided!");
        return (Esr) A0D.A00.A00.get();
    }

    public static EyR A01() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A0C, "ResourcesManager Factory is not provided!");
        return (EyR) A0D.A00.A0C.get();
    }

    public static Fi9 A02() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A05, "DeviceInfo Factory is not provided!");
        return (Fi9) A0D.A00.A05.get();
    }

    public static DLb A03() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A08, "FBPayGating Factory is not provided!");
        return (DLb) A0D.A00.A08.get();
    }

    public static FAF A04() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A0D, "Theme Factory is not provided!");
        return (FAF) A0D.A00.A0D.get();
    }

    public static Hlk A05() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A0A, "FBPayImageLoader Factory is not provided!");
        return (Hlk) A0D.A00.A0A.get();
    }

    public static ErF A06() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A02, "BloksCheckoutLauncher Factory is not provided!");
        return (ErF) A0D.A00.A02.get();
    }

    public static KqI A07() {
        C06014fk A0E = A0E();
        A0K(A0E);
        0RZ.A03(A0E.A00.A09, "FBPayHubManager Factory is not provided!");
        return (KqI) A0E.A00.A09.get();
    }

    public static GKw A08() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A03, "BloksScreenConfigHelper Factory is not provided!");
        return (GKw) A0D.A00.A03.get();
    }

    public static ETc A09() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A04, "CardScanner Factory is not provided!");
        return (ETc) A0D.A00.A04.get();
    }

    public static Ks7 A0A() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A06, "ECPManager Factory is not provided!");
        return (Ks7) A0D.A00.A06.get();
    }

    public static FAC A0B() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A01, "FBPayAuthManager Factory is not provided!");
        return (FAC) A0D.A00.A01.get();
    }

    public static F60 A0C() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A0B, "PttManager Factory is not provided!");
        return (F60) A0D.A00.A0B.get();
    }

    public static C06014fk A0D() {
        C06014fk A0E = A0E();
        A0K(A0E);
        return A0E;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.4fk] */
    public static C06014fk A0E() {
        if (A02 == null) {
            synchronized (C06014fk.class) {
                if (A02 == null) {
                    A02 = new Object();
                }
            }
        }
        return A02;
    }

    public static F4T A0F() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A07, "Executors Factory is not provided!");
        return (F4T) A0D.A00.A07.get();
    }

    public static ETd A0G() {
        C06014fk A0D = A0D();
        0RZ.A03(A0D.A00.A0E, "FBPayUrlLauncher Factory is not provided!");
        return (ETd) A0D.A00.A0E.get();
    }

    public static void A0H() {
        A0K(A0E());
        0RZ.A03((Object) null, "FBPayCoroutines Factory is not provided!");
        throw 0Q8.createAndThrow();
    }

    public static void A0I() {
        A0K(A0E());
        0RZ.A03((Object) null, "FbPayUIHelper Factory is not provided!");
        throw 0Q8.createAndThrow();
    }

    public static void A0J() {
        A0K(A0E());
        0RZ.A03((Object) null, "LocationAPI Factory is not provided");
        throw 0Q8.createAndThrow();
    }

    public static void A0K(C06014fk c06014fk) {
        0RZ.A05(A0E().A01, "FBPay SDK has not been initialized");
        0RZ.A03(c06014fk.A00, "FBPay SDK has not been initialized");
    }
}
