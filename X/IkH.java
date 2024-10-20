package X;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: IkH.class */
public final class IkH implements JH9 {
    public int A00;
    public C11684xK A01;
    public ROX A02;
    public HFx A03;
    public HjD A04;
    public RYn A05;
    public Hqj A06;
    public I9d A07;
    public I9d A08;
    public JMY A09;
    public QyG A0A;
    public JKd A0B;
    public File A0C;
    public Integer A0D;
    public boolean A0E;
    public S3C A0F;
    public I7F A0G;
    public final Context A0H;
    public final JIC A0I;
    public final JMM A0J;
    public final JGs A0K;
    public final Ho9 A0L;
    public final RUi A0M;
    public final Hqo A0N;
    public final Hoh A0O;
    public final Hv3 A0P;
    public final JNB A0Q;
    public final JMJ A0R;
    public final String A0S;
    public final List A0T;
    public final ExecutorService A0U;
    public final J4b A0V;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:84:0x077f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public IkH(android.content.Context r302, X.JIC r303, X.Hqo r304, X.JMJ r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 1927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkH.<init>(android.content.Context, X.JIC, X.Hqo, X.JMJ, java.lang.String):void");
    }

    public static final void A00(IkH ikH) {
        S3C s3c = ikH.A0F;
        if (s3c == null) {
            throw 1BK.A0h();
        }
        Object obj = s3c.A01;
        synchronized (obj) {
            obj.notifyAll();
            s3c.A00 = true;
            s3c.A02 = null;
        }
    }

    public static final void A01(IkH ikH) {
        JJG jjg = ikH.A0N.A0J;
        if (ikH.A0P.A0N() && jjg != null) {
            jjg.Ce7(ikH.A0K);
        }
        ROX rox = ikH.A02;
        if (rox != null) {
            7zO.A1X(rox.A03);
            rox.A05.shutdown();
        }
        I7F i7f = ikH.A0G;
        if (i7f != null) {
            I7F.A00(i7f, new SCJ(ikH.A0H, i7f));
        }
        ikH.A0V.A00.set(null);
    }

    public static final void A02(IkH ikH, Exception exc) {
        synchronized (ikH) {
            RYn rYn = ikH.A05;
            if (rYn != null) {
                RYn.A00(rYn, exc, AbstractC00603o4.A00(209));
            }
            if (!ikH.A0E) {
                I3d i3d = new I3d(ikH.A0I, ikH.A0J, ikH.A0M.A00());
                i3d.A01();
                i3d.A02(exc);
            }
            ikH.A0R.Bxd(exc);
            ikH.A0Q.onFailure(exc);
            A01(ikH);
            A00(ikH);
        }
    }

    @Override // X.JH9
    public JKY D8P() {
        IllegalStateException A0N;
        JKY jky;
        synchronized (this) {
            if (this.A0F == null) {
                this.A0F = new S3C(this);
                ExecutorService executorService = this.A0U;
                if (executorService != null) {
                    executorService.execute(new J4W(this));
                    jky = this.A0F;
                    if (jky == null) {
                        A0N = 1BK.A0h();
                    }
                } else {
                    A0N = 1BK.A0h();
                }
            } else {
                A0N = AnonymousClass001.A0N("upload can be called only one time!");
            }
            throw A0N;
        }
        return jky;
    }
}
