package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gm.class */
public final class C06374gm implements InterfaceC06384gn, InterfaceC06244gU {
    public final 1iL A00;
    public final 1iL A01;
    public final 2Fq A02;
    public final 2DX A03;
    public final 2FD A04;
    public final ExecutorService A05;
    public final 1iL A06;
    public final 1iL A07;
    public final 1iL A08;
    public final 1iL A09;
    public final 1iL A0A;
    public final 1iL A0B = 1iO.A00;
    public final C0dr A0C;
    public final ScheduledExecutorService A0D;

    public C06374gm(1iL r302, 1iL r303, 1iL r304, 1iL r305, 1iL r306, 1iL r307, 1iL r308, C0dr c0dr, 2Fq r310, 2DX r311, 2FD r312, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A02 = r310;
        this.A0D = scheduledExecutorService;
        this.A05 = executorService;
        this.A0C = c0dr;
        this.A03 = r311;
        this.A04 = r312;
        this.A00 = r302;
        this.A09 = r303;
        this.A01 = r304;
        this.A0A = r305;
        this.A06 = r307;
        this.A08 = r306;
        this.A07 = r308;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.C3298Jpt A00(android.graphics.Bitmap.Config r302, X.C06974ih r303, X.C10014s8 r304) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06374gm.A00(android.graphics.Bitmap$Config, X.4ih, X.4s8):X.Jpt");
    }

    @Override // X.InterfaceC06384gn
    public Drawable AJc(2Ea r302) {
        2G8 r303;
        C10024s9 c10024s9 = (C10024s9) r302;
        synchronized (c10024s9) {
            C10014s8 c10014s8 = c10024s9.A00;
            r303 = c10014s8 == null ? null : c10014s8.A04;
        }
        C10014s8 A00 = c10024s9.A00();
        A00.getClass();
        LVw A002 = A00(r303 != null ? r303.getAnimatedBitmapConfig() : null, null, A00);
        return ((Boolean) this.A0B.get()).booleanValue() ? new JVa(A002) : new JVb(A002);
    }

    @Override // X.InterfaceC06244gU
    public Drawable AJd(Resources resources, C06974ih c06974ih, 2Ea r304) {
        2G8 r306;
        C10024s9 c10024s9 = (C10024s9) r304;
        synchronized (c10024s9) {
            C10014s8 c10014s8 = c10024s9.A00;
            r306 = c10014s8 == null ? null : c10014s8.A04;
        }
        try {
            C10014s8 A00 = c10024s9.A00();
            A00.getClass();
            LVw A002 = A00(r306 != null ? r306.getAnimatedBitmapConfig() : null, c06974ih, A00);
            return ((Boolean) this.A0B.get()).booleanValue() ? new JVa(A002) : new JVb(A002);
        } catch (NullPointerException e) {
            Object AlI = r304.AlI("uri_source");
            if (AlI != null) {
                throw AnonymousClass001.A0Q(0Pz.A0j(e.getMessage(), " uri=", AlI.toString()));
            }
            throw e;
        }
    }

    @Override // X.InterfaceC06384gn
    public boolean D3e(2Ea r302) {
        return r302 instanceof C10024s9;
    }
}
