package X;

import android.content.BroadcastReceiver;
import android.content.Context;

/* renamed from: X.4Jc, reason: invalid class name */
/* loaded from: 4Jc.class */
public abstract class C4Jc extends C4Jd {
    public final BroadcastReceiver A00;

    public C4Jc(Context context, C4Ii c4Ii) {
        super(context, c4Ii);
        this.A00 = new 4OU(this);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    public android.content.IntentFilter A04() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.C4Jh
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L21
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            r0.addAction(r1)
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            r304 = r0
        L1a:
            r0 = r303
            r1 = r304
            r0.addAction(r1)
            r0 = r303
            return r0
        L21:
            r0 = r301
            boolean r0 = r0 instanceof X.C4Je
            r302 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L3e
            r0 = r303
            r0.<init>()
            r0 = r303
            java.lang.String r1 = "android.intent.action.BATTERY_OKAY"
            r0.addAction(r1)
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            r304 = r0
            goto L1a
        L3e:
            r0 = r303
            r0.<init>()
            r0 = r303
            java.lang.String r1 = "android.os.action.CHARGING"
            r0.addAction(r1)
            java.lang.String r0 = "android.os.action.DISCHARGING"
            r304 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Jc.A04():android.content.IntentFilter");
    }
}
