package X;

import android.content.Context;

/* renamed from: X.3ki, reason: invalid class name */
/* loaded from: 3ki.class */
public final class C3ki extends C00q implements C00m {
    public static final C3ki A00 = new C3ki();

    public C3ki() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Context A002 = C0f1.A00();
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        C10924uz c10924uz = new C10924uz(A002, "easy_dogfood_channel");
        c10924uz.A0L("FOS Easy Dogfooding");
        c10924uz.A0C(c0dp.now());
        c10924uz.A0g = true;
        C10924uz.A04(c10924uz, 2, true);
        c10924uz.A0B(2132345298);
        c10924uz.A0b = true;
        c10924uz.A0c = true;
        c10924uz.A03 = 1;
        05X r0 = new 05X();
        ((05Y) r0).A0D = true;
        c10924uz.A0D(r0.A01(A002, (int) c0dp.now(), 268435456));
        c10924uz.A09(new 5YV(3bQ.A00("OFF", 1), "Turn Off", 2132345298));
        c10924uz.A09(new 5YV(3bQ.A00("PAID_BALANCE", 2), "Paid Balance", 2132345298));
        c10924uz.A09(new 5YV(3bQ.A00("ZERO_BALANCE", 3), "Zero Balance", 2132345298));
        c10924uz.A0E(3bQ.A00("delete", 4));
        return c10924uz;
    }
}
