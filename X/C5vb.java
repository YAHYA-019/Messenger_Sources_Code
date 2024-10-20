package X;

import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5vb, reason: invalid class name */
/* loaded from: 5vb.class */
public final class C5vb implements Iterator, AnonymousClass116 {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C5va A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ArrayList A0A;
    public final Iterator A0B;
    public final Set A0C;

    public C5vb(C5ng c5ng, C5va c5va, Iterator it) {
        11T.A0F(it, 2);
        this.A0B = it;
        this.A07 = c5va;
        this.A08 = c5ng.A01;
        this.A09 = c5ng.A02;
        ImmutableList immutableList = c5ng.A00;
        HashSet hashSet = new HashSet();
        Iterator it2 = immutableList.iterator();
        while (it2.hasNext()) {
            hashSet.add(((C5fr) it2.next()).A06);
        }
        this.A0C = hashSet;
        this.A0A = new ArrayList();
        immutableList.isEmpty();
        this.A02 = Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(X.C5fr r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 1
            r304 = r0
        L16:
            java.lang.String r0 = "Required value was null."
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L28
            r0 = r302
            if (r0 != 0) goto L3f
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L28:
            r0 = r301
            java.lang.String r0 = r0.A0A
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3f
        L3a:
            r0 = r301
            java.lang.String r0 = r0.A07
            r302 = r0
        L3f:
            r0 = r302
            X.11T.A0D(r0)
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5vb.A00(X.5fr):java.lang.String");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A0B.hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        boolean z;
        5vE r327;
        82U r309;
        C5fv c5fv = (C5fv) this.A0B.next();
        if (!(c5fv instanceof 5vM) && !(c5fv instanceof C5uY)) {
            boolean z2 = false;
            if (this.A05) {
                z = false;
            } else {
                this.A05 = true;
                z = true;
            }
            if (!this.A06 && !((C5fu) c5fv).A0H) {
                this.A06 = true;
                z2 = true;
            }
            if (z || z2) {
                c5fv = c5fv.A6V(C5vc.A00, new 82U(z, z2, 1));
            }
            C5va c5va = this.A07;
            11T.A0F(c5fv, 0);
            Set set = c5va.A00;
            C5fu c5fu = (C5fu) c5fv;
            C2o9 c2o9 = c5fu.A04;
            if (!set.contains(c2o9)) {
                if (!c5fu.A0H) {
                    long j = this.A02;
                    long j2 = c5fu.A02;
                    if (j < j2) {
                        this.A02 = j2;
                    }
                }
                82T AxW = c5fv.AxW(5mD.A00);
                int i = 0;
                if (AxW == null || !AxW.A01) {
                    int i2 = this.A01;
                    ImmutableList immutableList = this.A09;
                    int size = immutableList.size();
                    while (true) {
                        int i3 = this.A01;
                        if (i3 >= size) {
                            break;
                        }
                        C5fr c5fr = (C5fr) immutableList.get(i3);
                        String str = c5fr.A06;
                        String str2 = c5fu.A05.A06;
                        if (!11T.A0O(str, str2) || !this.A0C.remove(str2) || !this.A0A.add(A00(c5fr))) {
                            long j3 = c5fr.A02;
                            long j4 = c5fu.A02;
                            if (j3 < j4 || !this.A0C.remove(str) || !this.A0A.add(A00(c5fr))) {
                                if (j3 < j4) {
                                    break;
                                }
                                this.A01++;
                            }
                        }
                        i++;
                        this.A01++;
                    }
                    if (i > 0) {
                        C2o9 c2o92 = C2o9.A06;
                        ImmutableList subList = immutableList.subList(i2, this.A01);
                        11T.A0A(subList);
                        C00j.A05("AbstractMessage.updateSendState", 573453235);
                        try {
                            if (subList.isEmpty()) {
                                0fH.A0o("AbstractMessage", "Attempting to set an invalid send state of SEEN but with no seenParticipants");
                            }
                            C5fq A00 = c5fu.A00();
                            A00.A04 = c2o92;
                            A00.A05(subList);
                            c5fv = A00.A00();
                            C00j.A01(-891731652);
                        } catch (Throwable th) {
                            C00j.A01(-1078926153);
                            throw th;
                        }
                    } else if (this.A01 > 0) {
                        c5fv = c5fv.D7v(c5va.A01 ? C2o9.A06 : C2o9.A05);
                    }
                    ArrayList arrayList = this.A0A;
                    List A0V = 0QD.A0V(arrayList);
                    boolean z3 = false;
                    if (arrayList.size() == immutableList.size()) {
                        z3 = true;
                    }
                    if (!c5va.A01 && (!A0V.isEmpty())) {
                        return c5fv.A6V(C5wt.A00, new C5wu(A0V, z3));
                    }
                }
                if (this.A00 == 0) {
                    ImmutableList immutableList2 = this.A08;
                    int size2 = immutableList2.size();
                    while (true) {
                        int i4 = this.A00;
                        if (i4 >= size2 || ((C5fr) immutableList2.get(i4)).A00 < c5fu.A02) {
                            break;
                        }
                        this.A00++;
                    }
                }
                c5fv = c5fv.D7v(this.A00 > 0 ? C2o9.A02 : C2o9.A08);
                if (!this.A04) {
                    this.A04 = true;
                    r327 = 5vE.A00;
                    r309 = new 82U(false, true, 2);
                    return c5fv.A6V(r327, r309);
                }
            } else if (c2o9 == C2o9.A07 && !this.A03) {
                this.A03 = true;
                r327 = 5vE.A00;
                r309 = new 82U(true, false, 2);
                return c5fv.A6V(r327, r309);
            }
        }
        return c5fv;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0q(AnonymousClass000.A00(ActionId.APPLY_FINISHED_LIST_AGAIN));
    }
}
