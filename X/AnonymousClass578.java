package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.viewstate.SharedAlbumViewState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.578, reason: invalid class name */
/* loaded from: 578.class */
public final class AnonymousClass578 implements AnonymousClass544 {
    public final int A00;
    public final ThreadKey A01;
    public final Aaa A02;
    public final MigColorScheme A03;
    public final List A04;
    public final boolean A05;

    public AnonymousClass578(ThreadKey threadKey, Aaa aaa, MigColorScheme migColorScheme, List list, int i, boolean z) {
        11T.A0F(list, 1);
        11T.A0F(aaa, 3);
        this.A04 = list;
        this.A03 = migColorScheme;
        this.A02 = aaa;
        this.A05 = z;
        this.A00 = i;
        this.A01 = threadKey;
    }

    private final List A00() {
        List<SharedAlbumViewState> list = this.A04;
        ArrayList arrayList = new ArrayList(C1A3.A1D(list, 10));
        for (SharedAlbumViewState sharedAlbumViewState : list) {
            final long j = sharedAlbumViewState.A02;
            final String str = sharedAlbumViewState.A05;
            final long j2 = sharedAlbumViewState.A01;
            final long j3 = sharedAlbumViewState.A03;
            final List A0Y = 0QD.A0Y(sharedAlbumViewState.A06, 2);
            final int i = sharedAlbumViewState.A00;
            arrayList.add(new Object(this, str, A0Y, i, j, j2, j3) { // from class: X.9c0
                public final int A00;
                public final long A01;
                public final long A02;
                public final long A03;
                public final String A04;
                public final List A05;
                public final /* synthetic */ AnonymousClass578 A06;

                {
                    7zP.A1L(str, 3, A0Y);
                    this.A06 = this;
                    this.A02 = j;
                    this.A04 = str;
                    this.A01 = j2;
                    this.A03 = j3;
                    this.A05 = A0Y;
                    this.A00 = i;
                }

                public boolean equals(Object obj) {
                    boolean z = false;
                    if (obj instanceof C9c0) {
                        C9c0 c9c0 = (C9c0) obj;
                        if (c9c0.A02 == this.A02 && 11T.A0O(c9c0.A04, this.A04) && c9c0.A01 == this.A01 && c9c0.A03 == this.A03 && 11T.A0O(c9c0.A05, this.A05) && c9c0.A00 == this.A00) {
                            z = true;
                        }
                    }
                    return z;
                }

                public int hashCode() {
                    return 0J6.A02(this.A04, Long.valueOf(this.A01), Long.valueOf(this.A03), this.A05);
                }
            });
        }
        return arrayList;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544 instanceof AnonymousClass578) {
            AnonymousClass578 anonymousClass578 = (AnonymousClass578) anonymousClass544;
            if (11T.A0O(anonymousClass578.A03, this.A03) && 11T.A0O(anonymousClass578.A02, this.A02) && 11T.A0O(anonymousClass578.A00(), A00()) && anonymousClass578.A05 == this.A05) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 3025775161L;
    }
}
