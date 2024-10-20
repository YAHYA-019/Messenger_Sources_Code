package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: Ezv.class */
public final class Ezv {
    public GK8 A00;
    public FHM A01;
    public final Context A02;
    public final C00i A03 = DKG.A0Q();
    public final FAX A04;
    public final DQ7 A05;

    public Ezv(Context context) {
        this.A02 = context;
        this.A04 = ((F6C) 1Hv.A02(context, 82751)).A00;
        this.A05 = new DQ7(context);
    }

    public void A00() {
        FHM fhm = this.A01;
        if (fhm != null) {
            synchronized (fhm) {
                fhm.A03 = true;
                fhm.A07();
            }
        }
    }

    public void A01() {
        FHM fhm = this.A01;
        if (fhm != null) {
            ValueAnimator valueAnimator = fhm.A00;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            synchronized (fhm) {
                fhm.A06 = true;
                fhm.A07();
            }
            fhm.A02.C07();
        }
    }

    public void A02() {
        FHM fhm = this.A01;
        if (fhm != null) {
            if (F4Q.A00(fhm.A0B)) {
                Er6 er6 = fhm.A0E.A03;
                FIT A01 = FHM.A01(fhm);
                ImmutableList immutableList = er6 == null ? null : er6.A0N;
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("permissions", new JSONArray((Collection) immutableList).toString());
                A01.A0J("privacy_info_show", A0u);
            }
            fhm.A02.BrM();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v9 ??, still in use, count: 6, list:
          (r308v9 ??) from 0x008d: PHI (r308v8 ??) = (r308v5 ??), (r308v6 ??), (r308v7 ??), (r308v9 ??) binds: [B:80:0x00fd, B:77:0x00ea, B:68:0x00bb, B:36:0x0089] A[DONT_GENERATE, DONT_INLINE]
          (r308v9 ?? I:X.E8M) from 0x004d: IPUT (r1v42 ?? I:boolean), (r308v9 ?? I:X.E8M) A[Catch: all -> 0x0423] X.E8M.A00 boolean
          (r308v9 ?? I:X.FHM) from 0x006c: IGET (r0v253 ?? I:android.content.Context) = (r308v9 ?? I:X.FHM) A[Catch: all -> 0x0423] X.FHM.A0A android.content.Context
          (r308v9 ?? I:X.E8M) from 0x0073: INVOKE (r0v253 ?? I:android.content.Context), (r308v9 ?? I:X.E8M) STATIC call: X.E8M.A00(android.content.Context, X.E8M):void A[Catch: all -> 0x0423]
          (r308v9 ?? I:X.FHM) from 0x0078: IGET (r0v248 ?? I:X.DQ7) = (r308v9 ?? I:X.FHM) A[Catch: all -> 0x0423] X.FHM.A02 X.DQ7
          (r308v9 ?? I:X.E8M) from 0x0084: INVOKE (r0v249 ?? I:X.Fpt), (r308v9 ?? I:X.E8M) DIRECT call: X.Fpt.<init>(X.E8M):void A[Catch: all -> 0x0423, MD:(X.E8M):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A03() {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezv.A03():void");
    }

    public void A04() {
        synchronized (this) {
            FHM fhm = this.A01;
            if (fhm != null) {
                synchronized (fhm) {
                    fhm.A09 = true;
                    if (fhm.A07) {
                        fhm.A06();
                    }
                }
            }
        }
    }

    public void A05(GK8 gk8) {
        ColorDrawable A0D;
        DQ7 dq7;
        float f;
        synchronized (this) {
            this.A00 = gk8;
            boolean A07 = DKF.A0d(this.A03).A07();
            Context context = this.A02;
            if (A07) {
                A0D = 7zL.A0D(context.getColor(2132213765));
                dq7 = this.A05;
                f = 0.3f;
            } else {
                A0D = 7zL.A0D(context.getColor(2132214306));
                dq7 = this.A05;
                f = 1.0f;
            }
            dq7.A0G.setAlpha(f);
            dq7.A0F.setBackground(A0D);
        }
    }
}
