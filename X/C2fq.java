package X;

import android.net.Uri;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.2fq, reason: invalid class name */
/* loaded from: 2fq.class */
public final class C2fq implements C2fr {
    public final int A00;
    public final Uri A01;
    public final PicSquare A02;
    public final C2fe A03;
    public final C2fd A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final Uri A0B;
    public final ImmutableList A0C;

    public C2fq(Uri uri, Uri uri2, PicSquare picSquare, C2fe c2fe, C2fd c2fd, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Integer num, int i, boolean z, boolean z2) {
        ImmutableList build;
        this.A03 = c2fe;
        this.A01 = uri;
        this.A0B = uri2;
        this.A02 = picSquare;
        this.A06 = immutableList;
        this.A09 = z;
        this.A07 = immutableList2;
        this.A04 = c2fd;
        this.A05 = immutableList3;
        this.A00 = i;
        this.A0A = z2;
        this.A08 = num;
        if (c2fe != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            23F r0 = (23F) 1Lo.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 33102);
            1Du it = immutableList2.iterator();
            while (it.hasNext()) {
                User A00 = r0.A00((UserKey) it.next());
                if (A00 != null && A00.A04() != null) {
                    builder.m11011add((Object) A00.A04());
                }
            }
            build = builder.build();
        } else {
            if (uri == null) {
                throw AnonymousClass001.A0N("userTileViewLogic or singleImageUri should not be NULL");
            }
            build = null;
        }
        this.A0C = build;
    }

    @Override // X.C2fs
    public String Ai0() {
        ImmutableList immutableList = this.A05;
        if (immutableList.isEmpty()) {
            return null;
        }
        return (String) 1BK.A0r(immutableList);
    }

    @Override // X.C2fs
    public ImmutableList Ai1() {
        return this.A05;
    }

    @Override // X.C2fr
    public Uri Alb(int i, int i2, int i3) {
        UserKey userKey;
        if (i < 0) {
            return null;
        }
        ImmutableList immutableList = this.A07;
        if (i >= immutableList.size()) {
            return null;
        }
        if ((this.A01 == null || i != 0) && this.A03 != null && (userKey = (UserKey) immutableList.get(i)) != null && User.A01(userKey.type)) {
            return C2fe.A01();
        }
        return null;
    }

    @Override // X.C2fs
    public int Azi() {
        if (this.A09) {
            return 0;
        }
        if (this.A01 != null || this.A02 != null) {
            return 1;
        }
        ImmutableList immutableList = this.A07;
        if (immutableList.isEmpty()) {
            immutableList = this.A06;
        }
        return immutableList.size();
    }

    @Override // X.C2fs
    public PicSquare B2q() {
        return this.A02;
    }

    @Override // X.C2fs
    public 3xU B56() {
        return null;
    }

    @Override // X.C2fs
    public C2fd BFg() {
        return this.A04;
    }

    @Override // X.C2fs
    public Integer BFi() {
        return this.A08;
    }

    @Override // X.C2fs
    public int BFz() {
        return this.A00;
    }

    @Override // X.C2fr
    public ImmutableList BIP(int i, int i2) {
        ArrayList arrayList;
        ImmutableList of;
        boolean z = false;
        if (Azi() > 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        Uri uri = this.A01;
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
            Uri uri2 = this.A0B;
            if (uri2 != null) {
                arrayList.add(uri2);
            }
        } else {
            C2fe c2fe = this.A03;
            if (c2fe == null) {
                throw AnonymousClass001.A0N("mUserTileViewLogic should not be NULL, if mSingleImageUri is NULL");
            }
            PicSquare picSquare = this.A02;
            if (picSquare != null) {
                Uri A04 = c2fe.A04(2qZ.A07(picSquare), i, i2);
                if (A04 == null) {
                    A04 = Uri.EMPTY;
                }
                of = ImmutableList.of((Object) A04);
                11T.A0A(of);
                return of;
            }
            ImmutableList immutableList = this.A07;
            if (immutableList.isEmpty()) {
                return this.A06;
            }
            arrayList = new 1rP(new 3dS(this, i, i2), immutableList);
        }
        of = ImmutableList.copyOf((Collection) arrayList);
        11T.A0A(of);
        return of;
    }

    @Override // X.C2fs
    public ImmutableList BIe() {
        return this.A07;
    }

    @Override // X.C2fs
    public boolean BWd() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        return z;
    }

    @Override // X.C2fs
    public boolean CzC() {
        return this.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (X.11T.A0O(r0, ((X.C2fq) r302).A0C) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = X.31E.A00(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0C
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L34
            r0 = r302
            X.2fq r0 = (X.C2fq) r0
            r302 = r0
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0C
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L32:
            r0 = r303
            return r0
        L34:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2fq.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A03 = 0J6.A03(this.A03, this.A01, (Object) null, this.A02, Boolean.valueOf(this.A09));
        return ((A03 + 31) * 31) + 0J6.A03(this.A07, Integer.valueOf(this.A04.ordinal()), this.A05, Integer.valueOf(this.A00), this.A08);
    }

    public String toString() {
        Object obj;
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mSingleImageUri", this.A01);
        stringHelper.add("mBackgroundPictureUri", this.A0B);
        stringHelper.add("mSingleImageFallbackUri", (Object) null);
        stringHelper.add("mPicSquare", this.A02);
        stringHelper.add("mOnlyShowPlaceholder", this.A09);
        stringHelper.add("mTileUserKeys", this.A07);
        stringHelper.add("mTileUris", this.A06);
        stringHelper.add("mTileBadge", this.A04);
        stringHelper.add("mDisplayNames", this.A05);
        stringHelper.add("mTintColor", this.A00);
        stringHelper.add("mUsersProfilePicState", this.A0C);
        switch (this.A08.intValue()) {
            case 1:
                obj = "MONTAGE_UNREAD";
                break;
            case 2:
                obj = "MONTAGE_READ";
                break;
            default:
                obj = "NONE";
                break;
        }
        stringHelper.add("mTileRing", obj);
        return 11T.A02(stringHelper);
    }
}
