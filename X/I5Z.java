package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: I5Z.class */
public abstract class I5Z {
    public final long A01;
    public final I9e A02;
    public final Set A05;
    public static final J4i A07 = new J4i(true);
    public static final J4i A06 = new J4i(false);
    public final List A03 = AnonymousClass001.A0s();
    public final Queue A04 = new PriorityQueue(16, A07);
    public long A00 = Long.MAX_VALUE;

    /* JADX WARN: Type inference failed for: r0v30, types: [X.QyL, java.lang.Object] */
    public I5Z(I9e i9e, java.util.Map map, long j) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            List list = this.A03;
            String A0j = AnonymousClass001.A0j(A0z);
            I9V i9v = (I9V) A0z.getValue();
            ?? obj = new Object();
            ((QyL) obj).A01 = A0j;
            ((QyL) obj).A00 = i9v;
            list.add(obj);
        }
        this.A01 = TimeUnit.MILLISECONDS.toMicros(j);
        this.A05 = AnonymousClass001.A0v();
        this.A02 = i9e;
    }

    private void A04(String str) {
        if ((this instanceof H3u) || !(this instanceof H3t)) {
            return;
        }
        IEN ien = ((H3t) this).A00;
        Object remove = ien.A0K.remove(Integer.valueOf(Integer.parseInt(str)));
        if (remove != null) {
            ien.A0J.add(ien.A0M.submit((Callable) new J5V(remove, ien, 37)));
        }
    }

    public void A00() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            String str = ((QyL) it.next()).A01;
            A02(str);
            A04(str);
        }
    }

    public final void A01(long j) {
        boolean z;
        if (j < this.A00) {
            Queue queue = this.A04;
            queue.clear();
            queue.addAll(this.A03);
        }
        while (true) {
            Queue queue2 = this.A04;
            if (queue2.isEmpty()) {
                break;
            }
            long j2 = this.A01 + j;
            I9V i9v = ((QyL) queue2.peek()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            if (j2 < i9v.A03(timeUnit)) {
                break;
            }
            QyL qyL = (QyL) queue2.poll();
            if (j < qyL.A00.A02(timeUnit)) {
                Set set = this.A05;
                if (!set.contains(qyL)) {
                    set.add(qyL);
                    String str = qyL.A01;
                    if (!(this instanceof H3u) && (this instanceof H3t)) {
                        IEN ien = ((H3t) this).A00;
                        int parseInt = Integer.parseInt(str);
                        I9d i9d = ien.A08.A08;
                        if (i9d != null) {
                            java.util.Map map = ien.A0L;
                            Integer valueOf = Integer.valueOf(parseInt);
                            if (!map.containsKey(valueOf)) {
                                JO9 jo9 = ien.A0G;
                                boolean A1e = ien.A08.A0A.A1e();
                                Huc A04 = i9d.A04(HAy.A01, parseInt);
                                A04.getClass();
                                Iterator A1D = GOp.A1D(A04.A04);
                                while (A1D.hasNext()) {
                                    HuY huY = (HuY) A1D.next();
                                    if (!huY.A01(A1e)) {
                                        try {
                                            File file = huY.A04;
                                            file.getClass();
                                            Hqj A00 = JO9.A00(jo9, file);
                                            if (A00 != null && !A00.A0K) {
                                            }
                                        } catch (Exception unused) {
                                        }
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                                map.put(valueOf, Boolean.valueOf(z));
                            }
                            if (!AnonymousClass001.A1V(map.get(valueOf))) {
                            }
                        }
                        1BK.A1O(ien.A0M.submit(new J57(parseInt, 2, ien, i9d)), ien.A0K, parseInt);
                    }
                }
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        Set<QyL> set2 = this.A05;
        for (QyL qyL2 : set2) {
            I9V i9v2 = qyL2.A00;
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            if (i9v2.A06(timeUnit2, j, this.A02.A1d())) {
                if (!qyL2.A02) {
                    A0s.add(qyL2);
                }
            } else if (qyL2.A02) {
                A0s3.add(qyL2);
            }
            long j3 = this.A01;
            if (j - j3 > i9v2.A02(timeUnit2) || j3 + j < i9v2.A03(timeUnit2)) {
                A0s2.add(qyL2);
            }
        }
        J4i j4i = A06;
        Collections.sort(A0s3, j4i);
        Iterator it = A0s3.iterator();
        while (it.hasNext()) {
            QyL qyL3 = (QyL) it.next();
            qyL3.A02 = false;
            A02(qyL3.A01);
        }
        Collections.sort(A0s, A07);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            QyL qyL4 = (QyL) it2.next();
            qyL4.A02 = true;
            A03(qyL4.A01);
        }
        Collections.sort(A0s2, j4i);
        Iterator it3 = A0s2.iterator();
        while (it3.hasNext()) {
            A04(((QyL) it3.next()).A01);
        }
        set2.removeAll(A0s2);
        this.A00 = j;
    }

    public void A02(String str) {
        if (!(this instanceof H3u)) {
            Hib hib = ((H3t) this).A00.A0F;
            hib.A01.disableTrack(Integer.parseInt(str));
            return;
        }
        H3u h3u = (H3u) this;
        if (h3u.A00 != 0) {
            ((JH4) h3u.A01).C6M(Integer.parseInt(str));
            return;
        }
        HfG hfG = (HfG) DKC.A12(str, (java.util.Map) h3u.A02);
        IEN ien = (IEN) h3u.A01;
        Integer num = hfG.A02;
        MediaEffect mediaEffect = hfG.A01;
        int intValue = num.intValue();
        JN3 jn3 = ien.A0F.A01;
        if (intValue == -1) {
            jn3.removeEffect(mediaEffect);
        } else {
            jn3.removeEffect(num, mediaEffect);
        }
    }

    public void A03(String str) {
        if (!(this instanceof H3u)) {
            Hib hib = ((H3t) this).A00.A0F;
            hib.A01.enableTrack(Integer.parseInt(str));
            return;
        }
        H3u h3u = (H3u) this;
        if (h3u.A00 != 0) {
            ((JH5) h3u.A02).C6N(Integer.parseInt(str));
            return;
        }
        HfG hfG = (HfG) DKC.A12(str, (java.util.Map) h3u.A02);
        IEN ien = (IEN) h3u.A01;
        Integer num = hfG.A02;
        MediaEffect mediaEffect = hfG.A01;
        int intValue = num.intValue();
        JN3 jn3 = ien.A0F.A01;
        if (intValue == -1) {
            jn3.addEffect(mediaEffect);
        } else {
            jn3.addEffect(num, mediaEffect);
        }
    }
}
