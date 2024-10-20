package X;

/* loaded from: L2u.class */
public final class L2u {
    public static final Kmk A01 = new Object();
    public static final java.util.Map A02 = 1BK.A1C();
    public final java.util.Map A00 = 1BK.A1C();

    public KTb A00(String str) {
        if (str.length() <= 0) {
            throw AnonymousClass001.A0L("navigator name cannot be an empty string");
        }
        KTb kTb = (KTb) this.A00.get(str);
        if (kTb != null) {
            return kTb;
        }
        throw 0Pz.A07("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final void A01(KTb kTb) {
        String A00 = A01.A00(kTb.getClass());
        if (A00.length() <= 0) {
            throw AnonymousClass001.A0L("navigator name cannot be an empty string");
        }
        java.util.Map map = this.A00;
        KTb kTb2 = (KTb) map.get(A00);
        if (11T.A0O(kTb2, kTb)) {
            return;
        }
        boolean z = false;
        if (kTb2 != null && kTb2.A00) {
            z = true;
        }
        if (!(!z)) {
            throw 1BL.A0h(kTb2, " is replacing an already attached ", AnonymousClass001.A0m(kTb, "Navigator "));
        }
        if (!(!kTb.A00)) {
            throw AnonymousClass002.A0F(" is already attached to another NavController", AnonymousClass001.A0m(kTb, "Navigator "));
        }
        map.put(A00, kTb);
    }
}
