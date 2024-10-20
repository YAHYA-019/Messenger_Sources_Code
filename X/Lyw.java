package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Lyw.class */
public final class Lyw extends AtomicInteger implements MKH, MHY {
    public static final long serialVersionUID = -6951100001833242599L;
    public volatile boolean active;
    public final int bufferSize;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final MKH downstream;
    public final Lyz error = new AtomicReference();
    public final MDm mapper;
    public final Lz0 observer;
    public MJr queue;
    public int sourceMode;
    public final boolean tillTheEnd;
    public MHY upstream;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Lyz, java.util.concurrent.atomic.AtomicReference] */
    public Lyw(MKH mkh, MDm mDm, int i, boolean z) {
        this.downstream = mkh;
        this.mapper = mDm;
        this.bufferSize = i;
        this.tillTheEnd = z;
        this.observer = new Lz0(mkh, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lyw.A00():void");
    }

    public void Bpm() {
        this.done = true;
        A00();
    }

    public void C9Q(Object obj) {
        if (this.sourceMode == 0) {
            this.queue.offer(obj);
        }
        A00();
    }

    public void COI(MHY mhy) {
        MQt jRy;
        if (JS2.A01(this.upstream, mhy)) {
            this.upstream = mhy;
            if (mhy instanceof MQs) {
                jRy = (MQt) mhy;
                int Cgx = jRy.Cgx(3);
                this.sourceMode = Cgx;
                if (Cgx == 1) {
                    this.queue = jRy;
                    this.done = true;
                    this.downstream.COI(this);
                    A00();
                    return;
                }
            } else {
                jRy = new JRy(this.bufferSize);
            }
            this.queue = jRy;
            this.downstream.COI(this);
        }
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        JS2.A00(this.observer);
    }

    public void onError(Throwable th) {
        if (!Kxz.A00(th, this.error)) {
            KZ0.A00(th);
        } else {
            this.done = true;
            A00();
        }
    }
}
