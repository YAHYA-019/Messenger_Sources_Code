package X;

import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;

/* renamed from: X.84p, reason: invalid class name */
/* loaded from: 84p.class */
public final class C84p implements C5uZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C84p(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C5uZ
    public /* bridge */ /* synthetic */ Object get() {
        5gC r304;
        int i;
        switch (this.A00) {
            case 0:
                C5j5 c5j5 = (C5j5) this.A03;
                C5fr c5fr = ((7Ie) this.A01).A00;
                String ALh = c5j5.ALh(c5fr.A07, 557220298628848L);
                11T.A0A(ALh);
                String ALh2 = c5j5.ALh(c5fr.A06, 557220298628848L);
                11T.A0A(ALh2);
                String ALh3 = c5j5.ALh(c5fr.A09, 557220298628848L);
                11T.A0A(ALh3);
                UserKey userKey = c5fr.A03;
                C2fd c2fd = (C2fd) this.A02;
                HashSet hashSet = new HashSet();
                ImmutableList.of();
                ImmutableList.of();
                C1pq.A08("tileBadge", c2fd);
                if (!hashSet.contains("tileBadge")) {
                    HashSet hashSet2 = new HashSet(hashSet);
                    hashSet = hashSet2;
                    hashSet2.add("tileBadge");
                }
                ImmutableList of = ImmutableList.of((Object) ALh);
                C1pq.A08("displayNames", of);
                ImmutableList of2 = userKey == null ? ImmutableList.of() : ImmutableList.of((Object) userKey);
                C1pq.A08("usersForTiles", of2);
                try {
                    Uri A03 = C0A2.A03(ALh3);
                    if (A03 != null) {
                        return new 6uK(new 6uH(new 6uG(ImmutableMap.of((Object) ALh2, (Object) A03)), c2fd, of, of2, ALh, hashSet, 1, false), 6uI.A00);
                    }
                } catch (SecurityException unused) {
                }
                throw 1BK.A0h();
            case 1:
                C5mn c5mn = (C5mn) this.A03;
                r304 = (C5uY) this.A01;
                String ALh4 = ((C5j5) this.A02).ALh(r304.A02, 195771409088126L);
                11T.A0A(ALh4);
                SpannableStringBuilder A00 = C5mo.A00(r304, ALh4);
                if (((C22a) c5mn.A00.A00.get()).A7O(A00, ((Resources) c5mn.A01.A00.get()).getDimensionPixelSize(2132279355))) {
                    C5vu c5vu = new C5vu(r304);
                    C5uf c5uf = C5uf.A00;
                    C1pq.A08("text", A00);
                    c5vu.A02(c5uf, new C5ug(A00));
                    return new C5uY(c5vu);
                }
                return r304;
            default:
                C5j5 c5j52 = (C5j5) this.A02;
                r304 = (5gC) this.A01;
                String ALh5 = c5j52.ALh(r304.A03, 195771409088126L);
                11T.A0A(ALh5);
                C5mx c5mx = (C5mx) this.A03;
                C00i c00i = c5mx.A01.A00;
                boolean BWc = ((C22a) c00i.get()).BWc(ALh5, (-1) >>> 1);
                boolean BXB = ((C22a) c00i.get()).BXB(ALh5);
                SpannableStringBuilder A002 = C5mo.A00(r304, ALh5);
                if (c5mx.A03.A5b(A002, (C22a) c00i.get(), ((Resources) c5mx.A02.A00.get()).getDimensionPixelSize(2132279390), BWc)) {
                    if (BXB) {
                        i = r304.A00;
                        if (i == 0) {
                            i = ((5uJ) c5mx.A00.A00.get()).A00(5wF.A04);
                        }
                    } else {
                        i = 0;
                    }
                    C5qu c5qu = new C5qu(r304);
                    c5qu.A03 = BWc;
                    c5qu.A00 = i;
                    C5uf c5uf2 = C5uf.A00;
                    C1pq.A08("text", A002);
                    c5qu.A02(c5uf2, new C5ug(A002));
                    c5qu.A02(85N.A00, (r304.A00 == 0 || !BXB) ? null : C86a.A00);
                    r304 = new 5gC(c5qu);
                }
                return r304;
        }
    }
}
