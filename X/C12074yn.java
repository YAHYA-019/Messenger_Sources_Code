package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.4yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yn.class */
public final class C12074yn {
    public final C0dp A00 = (C0dp) 1Bi.A03(99390);
    public final AnonymousClass244 A01 = (AnonymousClass244) 1Bi.A03(68335);

    public static WorkUserForeignEntityInfo A00(String str) {
        if (1JF.A0B(str)) {
            return null;
        }
        try {
            return (WorkUserForeignEntityInfo) AnonymousClass243.A00().A0Q(new 7hB(), str);
        } catch (IOException e) {
            throw 1BK.A0s("Unexpected deserialization exception", e);
        }
    }

    public static PicSquare A01(24X r301) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = r301.iterator();
        while (it.hasNext()) {
            24X r0 = (24X) it.next();
            builder.m11011add((Object) new PicSquareUrlWithSize(4YV.A00(r0, "size"), JSONUtil.A0H(r0.A0D("url"), null)));
        }
        return new PicSquare(builder.build());
    }
}
